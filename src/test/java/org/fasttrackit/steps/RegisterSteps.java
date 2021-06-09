package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;
    @Step
    public void navigateToRegisterPage(){
        homePage.open();
        homePage.setMyAccountLink();
    }
    @Step
    public void registerUser(String email,String password){
        myAccountPage.setEmailField(email);
        myAccountPage.setPassField(password);
        myAccountPage.setRegisterButton();

    }
    @Step
    public void checkUserRegist(String text){
        Assert.assertTrue(myAccountPage.checkRegisterMessage().equals(text));
    }
    @Step
    public void checkWeakPass (String text) {
        Assert.assertTrue(myAccountPage.checkWeakPassMessage().equals(text));
    }
    @Step
    public void registerUserWithWeakPass(String email,String password) {
        myAccountPage.setEmailField(email);
        myAccountPage.setPassField(password);
        myAccountPage.setRegisterButton();


    }
}
