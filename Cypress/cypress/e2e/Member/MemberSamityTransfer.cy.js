import MemberSamityTransferPage from 
'C:\\Users\\88013\\test\\cypress\\PageObject\\Member\\MemberSamityTransferPage.js';
import MemberSamityTransferData from 
'C:\\Users\\88013\\test\\cypress\\fixtures\\member\\MemberSamityTransferData.json';


describe('Login Test', () => {
  const memberSamityTransferPage = new MemberSamityTransferPage();
  

  before(() => {
    memberSamityTransferPage.visit();
    memberSamityTransferPage.waitForPageLoad();
  });

   it('should login with valid credentials', () => {
     memberSamityTransferPage.verifyPageTitle();
       memberSamityTransferPage.login(MemberSamityTransferData.username, 
        MemberSamityTransferData.password);
     memberSamityTransferPage.verifyLoginSuccess();
     memberSamityTransferPage.navigateToMemberSamityTransferList();
     memberSamityTransferPage.batchTransfer(MemberSamityTransferData.newOffice, 
          MemberSamityTransferData.newSamity);
     memberSamityTransferPage.memberSamityTransferApproval();
     memberSamityTransferPage.navigateToMemberSamityTransferList();


    });
});
