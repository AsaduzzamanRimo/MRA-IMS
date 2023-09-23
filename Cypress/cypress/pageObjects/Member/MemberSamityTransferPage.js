class MemberSamityTransferPage {
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
    
      navigateToMemberSamityTransferList() {
        cy.get('#mat-expansion-panel-header-6').click();
        cy.wait(3000);
        cy.get('#member-samity-transfer > .mat-list-item-content').click();
        cy.wait(9000);
       

      }

      batchTransfer(newOffice, newSamity){

        cy.get('#mat-checkbox-6 > .mat-checkbox-layout > .mat-checkbox-inner-container').click();
        cy.wait(3000);
        cy.get('#actionbtn > .mat-button-wrapper > span').click();
        cy.wait(7000);
        cy.get(':nth-child(1) > .item > .full-width > #undefined > .ng-select-container')
          .click();
        cy.get('.ng-option-label').contains(newOffice).click();
        cy.get(':nth-child(2) > .item > .full-width > #undefined > .ng-select-container')
          .click();
        cy.get('.ng-option-label').contains(newSamity).click();
        cy.get('#actionbtn').click();


      }

      memberSamityTransferApproval(){
        cy.get('#mat-expansion-panel-header-2').click();
        cy.get('#my-task-member-samity-transfer > .mat-list-item-content').click();
        cy.get('.mat-button-wrapper > .ng-star-inserted').click();
        cy.wait(9000);
        cy.get('.left-button > :nth-child(1) > #btnLock').click();
        cy.wait(5000);
        cy.get('#btnApproved').click();
        cy.get('#approveModal > .modal-dialog > .modal-content > .form-horizontal > .row.ng-star-inserted > .col-lg-12 > .card-footer > .button-container > .ng-star-inserted > app-button > #savebtn')
          .click();

      }







}

export default MemberSamityTransferPage;