package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy (css = ".woocommerce-cart-form__cart-item [aria-label]")
    private WebElementFacade deleteProductButton;

    @FindBy (css = "a[title='View your shopping cart'] > .dashicons.dashicons-cart")
    private WebElementFacade CartLink;

    @FindBy ( css = "#post-5 > div > div.woocommerce-message")
    private WebElementFacade productErasedMessage;

    @FindBy (css = ".button.wc-backward")
    private WebElementFacade returnToShopLink;

    public void deleteProductFromCart (){
        clickOn(deleteProductButton);
    }
    public void clickOnCartLink(){
        clickOn(CartLink);
    }
    public String checkProductErasedMessage(){
        System.out.println("generate text:" + productErasedMessage.getText());
        return productErasedMessage.getText();
    }
    public void clickOnReturnToShopLink(){
        clickOn(returnToShopLink);
    }


}
