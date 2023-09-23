import EmployeeTransferData from 'C:\\Users\\88013\\test\\cypress\\fixtures\\employee\\EmployeeTransferData.json';
import EmployeeTransferPage from 'C:\\Users\\88013\\test\\cypress\\PageObject\\employee\\EmployeeTransferPage.js';

describe('Login Test', () => {
    const employeeTransferPage = new EmployeeTransferPage();
  

  before(() => {
    employeeTransferPage.visit();
    employeeTransferPage.waitForPageLoad();
  });

    it('should login with valid credentials', () => {
        employeeTransferPage.verifyPageTitle();
        employeeTransferPage.login(EmployeeTransferData.username, EmployeeTransferData.password);
        employeeTransferPage.verifyLoginSuccess();
        employeeTransferPage.navigateToEmployeeTransfer();
        employeeTransferPage.employeeTransfer(EmployeeTransferData.newOffice, 
            EmployeeTransferData.newEffectiveDate);
        employeeTransferPage.employeeTransferApprove();
        employeeTransferPage.navigateToEmployeeTransfer();



    });
});