package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class EraseProductFromCartSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private CartPage cartPage;
    private LoginPage loginPage;
    private ShopPage shopPage;
    private ProductAlbumPage productAlbumPage;


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
    public void navigateToShop() {
        shopPage.clickOnShopButton();
        shopPage.clickOnProductAlbum();
    }

    @Step
    public void addProductToCart() {
        productAlbumPage.clickOnAddToCartButton();
    }

    @Step
    public void clickOnCartLink() {
        cartPage.clickOnCartLink();
        cartPage.deleteProductFromCart();
    }

    @Step
    public void checkProductErasedMessage(String text) {
        Assert.assertTrue(cartPage.checkProductErasedMessage().equals(text));
    }

    @Step
    public void checkShowingResultsText(String text) {
        Assert.assertTrue(shopPage.checkResultsText().equals(text));
    }
}