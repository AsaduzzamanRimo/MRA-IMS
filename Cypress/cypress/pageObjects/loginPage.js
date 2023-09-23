class login {
    txtUserName = "#loginId";
    textPassword = "#password";
    btnSubmit = "#loginBtn";
    lblMessage = ".breadcrumb-item";

    setUserName(username){
        cy.get(this.txtUserName).type(username);
    }
    setPassword(password){
        cy.get(this.textPassword).type(password);
    }
    clickSubmit(){
        cy.get(this.btnSubmit).click();
    }
    verifyLogin(){
        cy.get(this.lblMessage).should('have.text','MFI Admin Dashboard');
    }
}
export default login;