class EmployeeManagementPage {
    visit() {
      cy.visit('https://mra-ims.celloscope.net');
    }
  
    waitForPageLoad() {
      cy.wait(9000);
    }
  
    verifyPageTitle() {
      cy.title().should('contain', 'MRA IMS');
    }
  
    login(username, password) {
      cy.get('input#loginId').type(username);
      cy.get('input#password').type(password);
      cy.get('button[type="submit"]').click();
    }
  
    verifyLoginSuccess() {
      cy.url().should('include', '/dashboard');
      cy.wait(2000);
    }
  
    navigateToEmployeeList() {
      cy.get('.mat-content > #employee-info').click();
      cy.wait(3000);
      cy.get('mat-list-item[id=employee] span:nth-child(3)').click();
      cy.wait(9000);
    }
  
    switchLanguageToBangla() {
      cy.get('.round-img-sm').click({ force: true });
      cy.wait(7000);
      cy.get('#convertToBanglaBtn > .mat-radio-label > .mat-radio-container > .mat-radio-outer-circle').click({ force: true });
      cy.wait(7000);
      cy.get('.round-img-sm').click({ force: true });
      cy.wait(7000);
      cy.get('#convertToEnglishBtn > .mat-radio-label > .mat-radio-container > .mat-radio-outer-circle').click({ force: true });
      cy.wait(5000);
    }
  
    searchForEmployee(employeeName) {
      cy.get('#btnSearch').type(employeeName);
      cy.wait(5000);
      cy.get('#btnSearch').clear();
    }

    selectStatus(status) {
        cy.wait(2000);
        cy.get('#status').click(); 
        cy.wait(5000);
        cy.get('.ng-option-label').contains(status).click();
        cy.wait(5000); 
      }



    createEmployee(employeeNameEnglish,dateOfBirth, identificationType, passportNo, firstMobileNumber,
        officeId, employeeDesignation, fatherNameEnglish, motherNameEnglish, divisionName, 
        districtName, upazilaName, resAddressFirst) {
            
      cy.get('#featureaddbtn').click();
      cy.get('#empNameEn').type(employeeNameEnglish);
            cy.wait(5000);
      
      cy.get('#dateOfBirth').click();
      const dateSelector = `button[aria-label="${dateOfBirth}"]`;
      cy.get(dateSelector).click();
      cy.get(':nth-child(1) > #gender').click({ force: true });
      cy.wait(5000);
      cy.get('#identificationType > .ng-select-container').click();
      cy.get('.ng-option .ng-option-label').contains(identificationType).click();
      cy.wait(5000);
      cy.get('#passportNo').type(passportNo);
      cy.get('#mobile1').type(firstMobileNumber);
      cy.get('#mat-tab-label-1-1 > .mat-tab-label-content').click();
      cy.get('#officeId > .ng-select-container').click();
      cy.get('.ng-option-label').contains(officeId).click();
      cy.get('#emplDesignationId > .ng-select-container').click();
      cy.wait(5000);
      cy.get('.ng-option .ng-option-label') 
        .contains(employeeDesignation) 
        .click();
    
      cy.get('#mat-tab-label-1-2 > .mat-tab-label-content').click();
      cy.get('#fatherNameEn').type(fatherNameEnglish);
      cy.get('#motherNameEn').type(motherNameEnglish);
      cy.get('#mat-tab-label-1-3 > .mat-tab-label-content').click();
      cy.get('#resDivisionId > .ng-select-container').click();
      cy.get('.ng-option-label').contains(divisionName).click();
      cy.get('#resDistrictId > .ng-select-container').click();
      cy.get('.ng-option-label').contains(districtName).click();
      cy.get('#resUpazilaId > .ng-select-container').click();
      cy.get('.ng-option-label').contains(upazilaName).click();
      cy.get('#resAddressLine1').type(resAddressFirst);
      cy.get('#permanentAsPresent').click();
      
      cy.get('#mat-tab-label-1-4 > .mat-tab-label-content').click();
      cy.wait(5000);
      cy.get('#Photo_Image').attachFile('mra-3.png');
      cy.get('form').submit();
      cy.wait(5000);
      cy.get('#Passport_Document').attachFile('mra-4.png');
      cy.get('form').submit();
      cy.wait(4000);
      
      cy.get('#savewithworkflowbtn').click(); 
      cy.get('#confirmationModalYesBtn').click();
      cy.wait(7000);


    }


    approveEmployee(){
        cy.get('.mat-content > #my-task').click();
        cy.get('#my-task-employee > .mat-list-item-content').click();
        cy.wait(7000);
        cy.get('#actionbtn_50 > .mat-button-wrapper > .ng-star-inserted').click();
        cy.wait(7000);
        cy.get('.left-button > :nth-child(1) > #btnLock').click();
        cy.wait(3000);
        cy.get('#btnApproved').click();
        cy.wait(3000);
        cy.get('#approveModal > .modal-dialog > .modal-content > .form-horizontal > .row.ng-star-inserted > .col-lg-12 > .card-footer > .button-container > .ng-star-inserted > app-button > #savebtn')
        .click();




    }


    navigateToEmployeeList() {
        cy.get('.mat-content > #employee-info').click();
        cy.wait(3000);
        cy.get('mat-list-item[id=employee] span:nth-child(3)').click();
        cy.wait(9000);
      }

    viewEmployee(){
        cy.get('#actionbtn_32 > .mat-button-wrapper > .ng-star-inserted').click();
        cy.wait(2000);
        cy.get('#goToBackBtn').click();
    }


    updateEmployee(resAddressLineTwo){
        cy.get('#actionbtn_60 > .mat-button-wrapper > .ng-star-inserted').click();
        cy.wait(6000);
        cy.get('#mat-tab-label-2-3 > .mat-tab-label-content').click();
        cy.get('#resAddressLine2').type(resAddressLineTwo);
        //cy.get('#updateandcommitbtn').click();
        cy.get(':nth-child(1) > .breadcrumb-item').click();// this  
        //cy.get('#confirmationModalYesBtn').click();


    }





  }
  
  export default EmployeeManagementPage;
