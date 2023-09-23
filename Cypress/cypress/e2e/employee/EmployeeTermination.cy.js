import EmployeeTerminationData from 'C:\\Users\\88013\\test\\cypress\\fixtures\\employee\\EmployeeTerminationData.json';
import EmployeeTerminationPage from 'C:\\Users\\88013\\test\\cypress\\PageObject\\employee\\EmployeeTerminationPage.js';

describe('Login Test', () => {
    const employeeTerminationPage = new EmployeeTerminationPage();
  

  before(() => {
    employeeTerminationPage.visit();
    employeeTerminationPage.waitForPageLoad();
  });

    it('should login with valid credentials', () => {
        employeeTerminationPage.verifyPageTitle();
        //memberManagementPage.login('mfi-admin', '123456');
        employeeTerminationPage.login(EmployeeTerminationData.username, EmployeeTerminationData.password);
        employeeTerminationPage.verifyLoginSuccess();
        employeeTerminationPage.navigateToEmployeeTermination();
        employeeTerminationPage.employeeTermination();
        employeeTerminationPage.pendingEmployeeTermination();
        employeeTerminationPage.navigateToEmployeeTermination();



    });
});