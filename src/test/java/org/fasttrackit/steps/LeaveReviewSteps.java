package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class LeaveReviewSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private LoginPage loginPage;
    private ProductAlbumPage productAlbumPage;
    private ShopPage shopPage;
    private ProductBeaniePage productBeaniePage;

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
    public void navigateToShop(){
        shopPage.clickOnShopButton();
        shopPage.clickOnProductAlbum();
    }
    @Step
    public void writeReview(){
        productAlbumPage.clickOnReviewsLink();
        productAlbumPage.rateFiveStar();
        productAlbumPage.clickOnReviewBox();
        productAlbumPage.setReviewField("Awesome product, really");
        productAlbumPage.clickSubmit();
    }
    @Step
    public void checkUsersReviewMessage(String text) {
        Assert.assertTrue(productAlbumPage.checkReviewMessage().equals(text));
    }

    @Step
    public void writeReviewForProductBeanie(){
        productBeaniePage.clickOnReviewsLink();
        productBeaniePage.rateFiveStar();
        productBeaniePage.clickOnReviewBox();
        productBeaniePage.setReviewField("very good, very nice");
        productBeaniePage.clickSubmit();
    }

    @Step
    public void navigateToShopAndClickOnProductBeanie(){
        shopPage.clickOnShopButton();
        shopPage.clickOnProductBeanie();
    }
    @Step
    public void checkUsersReviewMessageForProductBeanie(String text) {
        Assert.assertTrue(productBeaniePage.checkReviewMessageForProductBeanie().equals(text));
    }
    @Step
    public void checkDuplicateReviewMessageForProductBeanie(String text) {
        Assert.assertTrue(productBeaniePage.checkDuplicateReviewMessageForProductBeanie().equals(text));
    }
}
