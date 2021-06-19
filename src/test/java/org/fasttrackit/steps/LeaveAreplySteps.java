package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;

public class LeaveAreplySteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private LoginPage loginPage;
    private ProductAlbumPage productAlbumPage;
    private ShopPage shopPage;

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

}
