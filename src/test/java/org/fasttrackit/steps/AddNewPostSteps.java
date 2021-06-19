package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;

public class AddNewPostSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private WpAdminPage wpAdminPage;
    private AddNewPostPage addNewPostPage;
    private LoginPage loginPage;

    @Step
    public void navigateToHomePage() {
        homePage.open();
        homePage.setMyAccountLink();
    }

    @Step
    public void enterCredentials(String email, String password) {
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();
    }

    @Step
    public void navigateToDashBoard(){
        myAccountPage.clickOnDashboardLink();
    }

    @Step
    public void clickOnAddPost(){
        wpAdminPage.AddPost();
    }

}
