

import 'cypress-file-upload';
import MemberManagementPage from 'C:\\Users\\88013\\test\\cypress\\PageObject\\Member\\MemberManagementPage.js'; 
import memberManagementData from 'C:\\Users\\88013\\test\\cypress\\fixtures\\member\\MemberManagementData.json';

describe('Login Test', () => {
  const memberManagementPage = new MemberManagementPage();

  before(() => {
    memberManagementPage.visit();
    memberManagementPage.waitForPageLoad();
  });

  it('should login with valid credentials', () => {
    memberManagementPage.verifyPageTitle();
    memberManagementPage.login(memberManagementData.username, memberManagementData.password);
    memberManagementPage.verifyLoginSuccess();
    memberManagementPage.navigateToMemberList();
    memberManagementPage.switchLanguageToBangla();
    memberManagementPage.searchForMember(memberManagementData.memberName);
    memberManagementPage.selectStatus(memberManagementData.statusToSelect);
    memberManagementPage.createMember(memberManagementData.officeId, 
        memberManagementData.samityId, memberManagementData.memberNameEnglish,
        memberManagementData.dateOfBirth, memberManagementData.identificationType,
        memberManagementData.passportNo, memberManagementData.firstMobileNumber, 
        memberManagementData.fatherNameEnglish, memberManagementData.motherNameEnglish, 
        memberManagementData.divisionName, memberManagementData.districtName, 
        memberManagementData.upazilaName, memberManagementData.resAddressFirst);
        
    memberManagementPage.approveMember();
    memberManagementPage.navigateToMemberList();
    
    memberManagementPage.viewMember();
    memberManagementPage.updateMember(memberManagementData.resAddressLineTwo);
    




  });
});
