import login from "../pageObjects/loginPage";
import officeManagement from "../pageObjects/officeManagement";
describe('Office Management', function() {
    beforeEach(() => {
        cy.visit("https://mra-ims.celloscope.net/login")
        cy.get('#loginId').type("mfi-admin")
        cy.get('#password').type("123456")
        cy.get('#loginBtn').click();
        
    })
    it('English to Bangla', function() {
        const ln = new officeManagement();
        ln.clickOffice();
        ln.clickOfficeManagement();
        cy.wait(5000);
        ln.clickProfile();
        ln.clickBangla();
        ln.verifyPageTitlebn();
        cy.reload();
        
    })
    it('Office List Page', function() {
        
        const ln = new officeManagement();
        ln.clickDashboard();
        ln.clickOffice();
        ln.clickOfficeManagement();
        ln.verifyPageTitleEn();
    })
    it('Office Creation with Valid Data', function() {
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
        //approve
        cy.get('#btnApproved').click();
        cy.get('#savebtn').click();
        cy.wait(5000);
        //logout from mra admin
        const lg = new officeManagement();
        lg.clickProfile();
        cy.get('.mat-menu-content > :nth-child(8) > span').click();
        cy.wait(2000);
        //login to mfi admin
        cy.visit("https://mra-ims.celloscope.net/login");
        
        cy.get('#loginId').type('mfi-admin');
        cy.get('#password').type('123456');
        cy.get('#loginBtn').click();
        lg.clickOffice();
        lg.clickOfficeManagement();
        //checking approved or not
        cy.get('#btnSearch').type("Test Office 1 en");
        cy.get('.mat-row > .cdk-column-officeNameEn').should('contain.text', 'Test Office 1 en');






    })
    it('Office Detail View', function() {
        cy.fixture('officeManagement').then((data)=>{
            const ln = new officeManagement();
            ln.clickDashboard();
            ln.clickOffice();
            ln.clickOfficeManagement();
            cy.get('#btnSearch').type("Test Office 1 en");
            cy.get('#actionbtn_02').click();
            //Verifying the page title
            cy.get('.page-title').should('contain.text','Office Detail');

        })
    })
    it('Edit Office with Valid Data', function() {
        cy.fixture('officeManagement').then((data)=>{
            const ln = new officeManagement();
            ln.clickDashboard();
            ln.clickOffice();
            ln.clickOfficeManagement();
            
            cy.get('#btnSearch').type("Test Office 1 en");
            cy.wait(2000);
            cy.get('#actionbtn_00').click();
            cy.get('#updateandcommitbtn').click();
            cy.get('#confirmationModalYesBtn').click();
            //going my task for approval
            cy.get('#mat-expansion-panel-header-2').click();
            cy.get('#my-task-office').click();
            //searching for the edited office
            cy.wait(2000);
            cy.reload();
            cy.get('#btnSearch').type("Test Office 1 en");
            cy.wait(2000);
            cy.get('#actionbtn_00').click();
            cy.get('#btnLock').click();
            cy.wait(2000);
            cy.get('#btnApproved').click();
            cy.get('#savebtn').click();
            //going approved office list to check the data
            ln.clickOffice();
            ln.clickOfficeManagement();
            cy.wait(2000);
            cy.reload();
            cy.get('#btnSearch').type("Test Office 1 en");
            cy.get('.mat-row > .cdk-column-officeNameEn').should('contain.text', 'Test Office 1 en');



        })
    }) 
    it('Successful Search Result', function() {
        cy.fixture('officeManagement').then((data)=>{
            const ln = new officeManagement();
            ln.clickDashboard();
            ln.clickOffice();
            ln.clickOfficeManagement();
            
            cy.get('#btnSearch').type("Test Office 1 en");
            cy.wait(2000);
            cy.get('.mat-row > .cdk-column-officeNameEn').should('contain.text', 'Test Office 1 en');
        })
    })    

   
})