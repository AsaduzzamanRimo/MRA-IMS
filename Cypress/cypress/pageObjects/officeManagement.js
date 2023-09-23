class officeManagement {
    officeButton = "#office-info";
    officeManagementButton = "#office";
    profileDropdown = "#profileDropdown";
    enToBn = "#convertToBanglaBtn";
    pageTitlebn = ".page-title";
    pageTitleEn = ".page-title";
    dashboard = "#dashboard";
    createButton = "#featureaddbtn";
    txtOfficeNameEn = "#officeNameEn";
    txtOfficeNameBn = "#officeNameBn";
    selectOfficeType = "#officeTypeId";
    txtMobile = "#mobile1";
    selectDivision = "#divisionId";
    selectDistrict = "#districtId";
    selectUpazila = "#upazilaId";
    txtAddress = "#addressLine1";
    saveButton = "#savewithworkflowbtn";
    saveConfirm = "#confirmationModalYesBtn";



    clickOffice(){
        cy.get(this.officeButton).click();
    }
    clickOfficeManagement(){
        cy.get(this.officeManagementButton).click();
    }
    clickProfile(){
        cy.get(this.profileDropdown).click();
    }
    clickBangla(){
        cy.get(this.enToBn).click();
    }
    verifyPageTitlebn(){
        cy.get(this.pageTitlebn).should('have.text','অফিসের তালিকা');
    }
    verifyPageTitleEn(){
        cy.get(this.pageTitleEn).should('have.text','Office List');
    }
    clickDashboard(){
        cy.get(this.dashboard).click();
    }
    createOffice(){
        cy.get(this.createButton).click();
    }
    setNameEn(nameEn){
        cy.get(this.txtOfficeNameEn).type(nameEn);
    }
    setNameBn(nameBn){
        cy.get(this.txtOfficeNameBn).type(nameBn);
    }
    clickOfficeType(){
        cy.get(this.selectOfficeType).click();
    }
    setOfficeType(officeType){
        cy.get(this.selectOfficeType).type(officeType).type('{enter}');
    }
    setMobile(mobile){
        cy.get(this.txtMobile).type(mobile);
    }
    clickDivision(){
        cy.get(this.selectDivision).click();
    }
    setDivision(division){
        cy.get(this.selectDivision).type(division).type('{enter}');
    }
    clickDistrict(){
        cy.get(this.selectDistrict).click();
    }
    setDistrict(district){
        cy.get(this.selectDistrict).type(district).type('{enter}');
    }
    clickUpazila(){
        cy.get(this.selectUpazila).click();
    }
    setUpazila(upazila){
        cy.get(this.selectUpazila).type(upazila).type('{enter}');
    }
    setAddress(address){
        cy.get(this.txtAddress).type(address);
    }
    clickSave(){
        cy.get(this.saveButton).click();
    }
    clickConfirm(){
        cy.get(this.saveConfirm).click();
    }

}
export default officeManagement;