describe('Samity Management', function() {
    beforeEach(() => {
        cy.visit("https://mra-ims.celloscope.net/login")
        cy.get('#loginId').type("mfi-admin")
        cy.get('#password').type("123456")
        cy.get('#loginBtn').click();
    })
    it('Successful Samity Creation with Valid Data', function() {
        //creating the samity
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity').click();
        cy.get('#featureaddbtn').click();
        cy.get('#samityNameEn').type("Test Samity 1 en");
        cy.get('#samityNameBn').type("Test Samity 1 bn");
        cy.get('#samityType').click();
        cy.get('#samityType').type("Male").type('{enter}');
        cy.get('#officeId').click();
        cy.get('#officeId').type("Dhaka Branch").type('{enter}');
        cy.get('#samityDay').click();
        cy.get('#samityDay').type("Saturday").type('{enter}');
        cy.get('#maximumMember').type("10");
        cy.get('#divisionId').click();
        cy.get('#divisionId').type("Dhaka Division").type('{enter}');
        cy.get('#districtId').click();
        cy.get('#districtId').type("Faridpur").type('{enter}');
        cy.get('#upazilaId').click();
        cy.get('#upazilaId').type("Bhanga").type('{enter}');
        cy.get('#addressLine1').type("Test Address");
        cy.get('#savewithworkflowbtn').click();
        cy.get('#confirmationModalYesBtn').click();
        //approve from my task
        cy.get('#mat-expansion-panel-header-2').click();
        cy.get('#my-task-samity').click();
        cy.wait(2000);
        cy.reload();
        cy.get('#btnSearch').type("Test Samity 1 en");
        cy.wait(2000);
        cy.get('#actionbtn_02').click();
        cy.get('#btnLock').click();
        cy.get('#btnApproved').click();
        cy.get('#savebtn').click();
        //verify approved or not
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity').click();
        cy.wait(2000);
        cy.reload();
        
        cy.get('#btnSearch').type("Test Samity 1 en");
        cy.wait(2000);
        cy.get('.mat-row > .cdk-column-samityNameEn').should('contain.text', 'Test Samity 1 en');

    })
    it('Successful Samity Update with Valid Data', function() {
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity').click();
        cy.wait(2000);
        cy.reload();
        
        cy.get('#btnSearch').type("Test Samity 1 en");
        cy.wait(2000);
        cy.get('#actionbtn_00').click();
        cy.get('#updateandcommitbtn').click();
        cy.get('#confirmationModalYesBtn').click();
        //approve from my task
        cy.get('#mat-expansion-panel-header-2').click();
        cy.get('#my-task-samity').click();
        cy.wait(2000);
        cy.reload();
        cy.get('#btnSearch').type("Test Samity 1 en");
        cy.wait(2000);
        cy.get('#actionbtn_02').click();
        cy.get('#btnLock').click();
        cy.get('#btnApproved').click();
        cy.get('#savebtn').click();
        //verify approved or not
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity').click();
        cy.wait(2000);
        cy.reload();
        
        cy.get('#btnSearch').type("Test Samity 1 en");
        cy.wait(2000);
        cy.get('.mat-row > .cdk-column-samityNameEn').should('contain.text', 'Test Samity 1 en');

    })
    it('Successful Search Result with Valid Samity Name', function() {
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity').click();
        cy.wait(2000);
        cy.reload();
        
        cy.get('#btnSearch').type("Test Samity 1 en");
        cy.wait(2000);
        cy.get('.mat-row > .cdk-column-samityNameEn').should('contain.text', 'Test Samity 1 en');
    }) 
    it('Verify Samity List Page', function() { 
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity').click();

        cy.get('.page-title').should('contain.text', 'Samity List');

    })  
    it('Verify Language switching to bangla', function() {
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity').click();
        cy.wait(5000);

        cy.get('#profileDropdown').click();
        cy.get('#convertToBanglaBtn').click();
        cy.get('.page-title').should('contain.text', 'সমিতির তালিকা');
        cy.reload(); 

    }) 
    it('Verify Samity detail View', function() {
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity').click();
        cy.wait(2000);
        cy.reload();
        
        cy.get('#btnSearch').type("Test Samity 1 en");
        cy.wait(2000);
        cy.get('#actionbtn_02').click();
        cy.get('.page-title').should('contain.text','Samity Detail');
    }) 

})