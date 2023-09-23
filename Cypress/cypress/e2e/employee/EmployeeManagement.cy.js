import 'cypress-file-upload';
import employeeManagementData from 'C:\\Users\\88013\\test\\cypress\\fixtures\\employee\\employeeManagementData.json';
import EmployeeManagementPage from 'C:\\Users\\88013\\test\\cypress\\PageObject\\employee\\EmployeeManagementPage.js';

describe('Login Test', () => {
    const employeeManagementPage = new EmployeeManagementPage();


  before(() => {
    employeeManagementPage.visit();
    employeeManagementPage.waitForPageLoad();
  });

  it('should login with valid credentials', () => {
    employeeManagementPage.verifyPageTitle();
    employeeManagementPage.login(employeeManagementData.username, employeeManagementData.password);
    employeeManagementPage.verifyLoginSuccess();
    employeeManagementPage.navigateToEmployeeList();
    employeeManagementPage.switchLanguageToBangla();
    employeeManagementPage.searchForEmployee(employeeManagementData.employeeName);
    employeeManagementPage.createEmployee(employeeManagementData.employeeNameEnglish,
        employeeManagementData.dateOfBirth, employeeManagementData.identificationType, 
        employeeManagementData.passportNo, employeeManagementData.firstMobileNumber,
        employeeManagementData.officeId, employeeManagementData.employeeDesignation, 
        employeeManagementData.fatherNameEnglish, employeeManagementData.motherNameEnglish, 
        employeeManagementData.divisionName, employeeManagementData.districtName, 
        employeeManagementData.upazilaName, employeeManagementData.resAddressFirst);


    employeeManagementPage.approveEmployee();
    employeeManagementPage.navigateToEmployeeList();
    

    employeeManagementPage.viewEmployee();
    employeeManagementPage.updateEmployee(employeeManagementData.resAddressLineTwo);


});
});
