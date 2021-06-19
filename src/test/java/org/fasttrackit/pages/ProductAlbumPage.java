package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductAlbumPage extends PageObject {

    @FindBy (css = "button[name='add-to-cart']")
    private WebElementFacade addToCartButton;

    @FindBy(css = "div[role='alert']")
    private WebElementFacade addedToCartMessage;

    public void clickOnAddToCartButton(){
        clickOn(addToCartButton);
    }
    public String checkAddedToCartMessage(){
        System.out.println("generate text:" + addedToCartMessage.getText());
        return addedToCartMessage.getText();
    }
}
