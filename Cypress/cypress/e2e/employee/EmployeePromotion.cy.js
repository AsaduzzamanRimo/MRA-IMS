import EmployeePromotionData from 'C:\\Users\\88013\\test\\cypress\\fixtures\\employee\\EmployeePromotionData.json';
import EmployeePromotionPage from 'C:\\Users\\88013\\test\\cypress\\PageObject\\employee\\EmployeePromotionPage.js';

describe('Login Test', () => {
    const employeePromotionPage = new EmployeePromotionPage();
  

  before(() => {
    employeePromotionPage.visit();
    employeePromotionPage.waitForPageLoad();
  });

    it('should login with valid credentials', () => {
        employeePromotionPage.verifyPageTitle();
        employeePromotionPage.login(EmployeePromotionData.username, EmployeePromotionData.password);
        employeePromotionPage.verifyLoginSuccess();
        employeePromotionPage.navigateToEmployeePromotion();
        employeePromotionPage.employeePromotion(EmployeePromotionData.newDepartment, 
            EmployeePromotionData.newDesignation, EmployeePromotionData.newEffectiveDate)
        
        employeePromotionPage.employeePromotionApprove();
        employeePromotionPage.navigateToEmployeePromotion();



    });
});
