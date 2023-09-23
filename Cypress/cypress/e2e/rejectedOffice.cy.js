import officeManagement from "../pageObjects/officeManagement";
describe('Rejected Office', function() {
    beforeEach(() => {
        cy.visit("https://mra-ims.celloscope.net/login")
        cy.get('#loginId').type("mfi-admin")
        cy.get('#password').type("123456")
        cy.get('#loginBtn').click();
    })
    it('Navigate to Rejected Office List Page', function() {
        const ln = new officeManagement();
        ln.clickOffice();
        cy.get('#rejected-office').click();
        cy.get('.page-title').should('contain.text', 'Rejected Office List');


    })
    it.only('Office Creation with Valid Data and get reject', function() {
        cy.fixture('officeManagement').then((data)=>{
            const ln = new officeManagement();
            ln.clickDashboard();
            ln.clickOffice();
            ln.clickOfficeManagement();
            ln.createOffice();
            ln.setNameEn(data.nameEn);
            ln.setNameBn(data.nameBn);
            ln.clickOfficeType();
            
            ln.setOfficeType(data.officeType);
            ln.setMobile(data.mobile);
            ln.clickDivision();
            ln.setDivision(data.division);
            ln.clickDistrict();
            ln.setDistrict(data.district);
            ln.clickUpazila();
            ln.setUpazila(data.upazila);
            ln.setAddress(data.address);
            ln.clickSave();
            ln.clickConfirm();
            
            //wait for clicking on profile
            cy.wait(5000);
            ln.clickProfile();
            //logout
            cy.get('.mat-menu-content > :nth-child(8) > span').click();
            cy.wait(2000);
            //wait for the login page to be loaded
            //cy.wait(7000);
            

        })
        //login to mra admin
        cy.visit("https://mra-ims.celloscope.net/login");
        
        cy.get('#loginId').type('mra-admin');
        cy.get('#password').type('123456');
        cy.get('#loginBtn').click();
        // Going my task to approve the created office
        cy.get('#mat-expansion-panel-header-2').click();
        cy.get('#my-task-office').click();
        cy.wait(2000);
        cy.reload();

        //searching for the created office
        cy.get('#btnSearch').type("Test Office 1 en");
        //approve
        cy.wait(2000);
        cy.get('#actionbtn_00').click();
        //click on lock
        cy.get('#btnLock').click();
    })

})