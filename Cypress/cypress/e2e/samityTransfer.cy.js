describe('Samity Management', function() {
    beforeEach(() => {
        cy.visit("https://mra-ims.celloscope.net/login")
        cy.get('#loginId').type("mfi-admin")
        cy.get('#password').type("123456")
        cy.get('#loginBtn').click();
    })
    it('Navigate to Samity Transfer Page', function() {
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity-transfer').click();
        cy.get('.page-title').should('contain.text', 'Active Samity List');
    })
    it('Successful Search by valid Samity Name', function() {
        cy.get('#mat-expansion-panel-header-5').click();
        cy.get('#samity-transfer').click();
        cy.wait(2000);
        cy.reload();
        cy.get('#btnSearch').type("Test Samity 1 en");
        cy.get(':nth-child(2) > .cdk-column-samityNameEn').should('contain.text', 'Test Samity 1 en');
    })

})