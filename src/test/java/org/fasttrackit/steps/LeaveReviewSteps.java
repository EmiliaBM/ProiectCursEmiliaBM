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
        productAlbumPage.setReviewField("Very Good");
        productAlbumPage.clickSubmit();
    }
    @Step
    public void checkUsersReviewMessage(String text) {
        Assert.assertTrue(productAlbumPage.checkReviewMessage().equals(text));

    }
}
