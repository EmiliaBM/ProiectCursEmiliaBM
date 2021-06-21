package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.EraseProductFromCartSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class EraseProductFromCartTests extends BaseTest {

    @Steps
    private EraseProductFromCartSteps eraseProductFromCartSteps;

    @Test
    public void eraseProductFromCartPage(){
        eraseProductFromCartSteps.navigateToHomePage();
        eraseProductFromCartSteps.enterCredentials("user5@gmail.com", "Parola1+Parola");
        eraseProductFromCartSteps.navigateToShop();
        eraseProductFromCartSteps.addProductToCart();
        eraseProductFromCartSteps.clickOnCartLink();
    }

    @Test
    public void eraseProductFromCartPageAndCheckMessage(){
        eraseProductFromCartSteps.navigateToHomePage();
        eraseProductFromCartSteps.enterCredentials("user5@gmail.com", "Parola1+Parola");
        eraseProductFromCartSteps.navigateToShop();
        eraseProductFromCartSteps.addProductToCart();
        eraseProductFromCartSteps.clickOnCartLink();
        eraseProductFromCartSteps.checkProductErasedMessage("“Album” removed. Undo?");
    }
    @Test
    public void eraseProductFromCartPageAndReturnToShop(){
        eraseProductFromCartSteps.navigateToHomePage();
        eraseProductFromCartSteps.enterCredentials("user5@gmail.com", "Parola1+Parola");
        eraseProductFromCartSteps.navigateToShop();
        eraseProductFromCartSteps.addProductToCart();
        eraseProductFromCartSteps.clickOnCartLink();
        eraseProductFromCartSteps.returnToShop();
        eraseProductFromCartSteps.checkShowingResultsText("Showing 1–16 of 39 results");
    }
}
