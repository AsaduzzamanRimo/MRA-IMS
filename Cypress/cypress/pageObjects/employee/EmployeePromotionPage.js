class EmployeePromotionPage {
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
  
    navigateToEmployeePromotion() {
      cy.get('#mat-expansion-panel-header-4').click();
      cy.wait(3000);
      cy.get('#employee-promotion > .mat-list-item-content').click();
      cy.wait(9000);
    }

    employeePromotion(newDepartment, newDesignation, newEffectiveDate){
        cy.get(':nth-child(2) > .cdk-column-action > #actionbtn_1 > .mat-button-wrapper > .ng-star-inserted').click();
      cy.get('#newDepartmentId > .ng-select-container').click();
      cy.get('.ng-option .ng-option-label').contains(newDepartment).click();
      cy.get('#newDesignationId > .ng-select-container').click();
      cy.get('.ng-option .ng-option-label').contains(newDesignation).click();
     

      cy.get('.date > #effectiveDate').click();
      const dateSelector = `button[aria-label="${newEffectiveDate}"]`;
      cy.get(dateSelector).click();
      cy.get('app-button > #btnChange').click();


    }

    employeePromotionApprove(){
        cy.get('#mat-expansion-panel-header-2').click();
        cy.get('#my-task-employee-promotion > .mat-list-item-content').click();
        cy.get('.mat-button-wrapper > .ng-star-inserted').click();
        cy.wait(9000);
        cy.get('.left-button > :nth-child(1) > #btnLock').click();
        cy.get('#btnApproved').click();
        cy.get('#approveModal > .modal-dialog > .modal-content > .form-horizontal > .row.ng-star-inserted > .col-lg-12 > .card-footer > .button-container > .ng-star-inserted > app-button > #savebtn')
            .click();

    }

}
  
export default EmployeePromotionPage;