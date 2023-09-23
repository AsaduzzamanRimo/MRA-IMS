class EmployeeTransferPage {
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
  
    navigateToEmployeeTransfer() {
        cy.get('#mat-expansion-panel-header-4').click();
        cy.wait(4000);
        cy.get('#employee-transfer > .mat-list-item-content').click();
        cy.wait(7000);
    }

    employeeTransfer(newOffice, newEffectiveDate){
        cy.get(':nth-child(2) > .cdk-column-action > #actionbtn_1 > .mat-button-wrapper > .ng-star-inserted').click();
        cy.get('#newOfficeId > .ng-select-container').click();
        cy.wait(5000);
        cy.get('.ng-option .ng-option-label') 
          .contains(newOffice) 
          .click(); 

     

        cy.get('.date > #effectiveDate').click();
        const dateSelector = `button[aria-label="${newEffectiveDate}"]`;
        cy.get(dateSelector).click();
        cy.get('app-button > #btnChange').click();
        cy.wait(9000);


    }

    employeeTransferApprove(){
        cy.get('#mat-expansion-panel-header-2').click();
        cy.get('#my-task-employee-transfer > .mat-list-item-content').click();
        cy.wait(4000);
        cy.get('#actionbtn_10 > .mat-button-wrapper > .ng-star-inserted').click();
        cy.wait(9000);
        cy.get('.left-button > :nth-child(1) > #btnLock').click();
        cy.get('#btnApproved').click();
        cy.get('#approveModal > .modal-dialog > .modal-content > .form-horizontal > .row.ng-star-inserted > .col-lg-12 > .card-footer > .button-container > .ng-star-inserted > app-button > #savebtn')
            .click();

    }

}
  
export default EmployeeTransferPage;
