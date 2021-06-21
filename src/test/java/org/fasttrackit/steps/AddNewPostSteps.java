package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;


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
        myAccountPage.clickOnFastrackitLink();
    }

    @Step
    public void clickOnAddPost(String title){
        wpAdminPage.setPostsLink();
        wpAdminPage.setAddNewPostLink();
        wpAdminPage.setNewPostTitle(title);
        wpAdminPage.clickOnPublishButton();
    }
    @Step
    public void checkPostPublishedMessage(String text) {
        Assert.assertTrue(wpAdminPage.checkPostPublishedMessage().equals(text));
    }
    @Step
    public void clickOnPosts ( String newTitle){
        wpAdminPage.setPostsLink();
        wpAdminPage.clickOnLastPostTitle();
        wpAdminPage.modifyLastPostTitle(newTitle);
        wpAdminPage.clickOnUpdateButton();
    }
    @Step
    public void checkUpdatedPostMessage(String text) {
        Assert.assertTrue(wpAdminPage.checkUpdatedPostMessage().equals(text));
    }
}
