package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class AddProductToCartSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private ShopPage shopPage;
    private ProductAlbumPage productAlbumPage;
    private LoginPage loginPage;

    @Step
    public void navigateToHomePage(){
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
    public void addProductToCart(){
        productAlbumPage.clickOnAddToCartButton();
    }

    @Step
    public void addedToCartMessage(String text){
        Assert.assertTrue(productAlbumPage.checkAddedToCartMessage().equals(text));
    }
    @Step
    public void navigateToShopAndAddAlbumProductToCart() {
        shopPage.clickOnShopButton();
        shopPage.addProductAlbumToCart();
    }
}
