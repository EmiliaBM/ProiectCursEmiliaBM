package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class LoginSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private LoginPage loginPage;

    @Step
    public void navigateToLoginPage(){
        homePage.open();
        homePage.clickAccountLink();
    }
    @Step
    public void enterCredentials(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
    }
    @Step
    public void clickLogIn(){
        loginPage.clickLoginButton();
    }
    @Step
    public void checkUserRegist(String text){
        Assert.assertTrue(myAccountPage.checkRegisterMessage().equals(text));
    }
    @Step
    public void checkNotLoggedIn(String text){
        Assert.assertTrue(loginPage.checkInvalidCredentialsMessage().equals(text));
    }
    @Step
    public void checkAccountAlreadyRegisteredMessage(String text) {
        Assert.assertTrue(loginPage.checkAccountAlreadyRegisteredMessage().equals(text));

    }

}
