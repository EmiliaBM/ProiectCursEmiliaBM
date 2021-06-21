package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class AddNewProductSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private WpAdminPage wpAdminPage;
    private AddNewProductPage addNewProductPage;
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
    public void clickOnAddProduct(){
        wpAdminPage.setProductsLink();
        wpAdminPage.addNewProduct();
        wpAdminPage.setProductTitle("Juice");
        wpAdminPage.clickOnPublishNewProductButton();
    }
    @Step
    public void checkPostProductPublishedMessage(String text) {
        Assert.assertTrue(wpAdminPage.checkPostPublishedProductMessage().equals(text));
    }
    @Step
    public void modifyLastProductsTitle() {
        wpAdminPage.setProductsLink();
        wpAdminPage.clickOnLastProductsTitle();
        wpAdminPage.modifyLastProductsTitle("Jeans Tommy");
        wpAdminPage.clickOnPublishNewProductButton();
    }
    @Step
    public void checkUpdatedMessage(String text) {
        Assert.assertTrue(wpAdminPage.checkUpdatedProductMessage().equals(text));
    }

}
