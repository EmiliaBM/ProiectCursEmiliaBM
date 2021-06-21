package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ProductAlbumPage extends PageObject {

    @FindBy (css = "button[name='add-to-cart']")
    private WebElementFacade addToCartButton;

    @FindBy(css = "div[role='alert']")
    private WebElementFacade addedToCartMessage;

    @FindBy (css = "li#tab-title-reviews > a")
    private WebElementFacade reviewsLink;

    @FindBy (css = "textarea#comment")
    private WebElementFacade reviewBox;

    @FindBy (css = "input#submit")
    private WebElementFacade submitButton;

    @FindBy (css = ".star-5")
    private WebElementFacade rateFive;

    @FindBy (css = "#comment-480 > div > p > em")
    private WebElementFacade reviewWaitingForApproval;

    public void clickOnAddToCartButton(){
        clickOn(addToCartButton);
    }
    public String checkAddedToCartMessage(){
        System.out.println("generate text:" + addedToCartMessage.getText());
        return addedToCartMessage.getText();
    }
    public void clickOnReviewsLink(){
        clickOn((reviewsLink));
    }
    public void clickOnReviewBox(){
        clickOn(reviewBox);
    }
    public void setReviewField (String review){
        typeInto(reviewBox,review);
    }
    public void clickSubmit (){
        clickOn(submitButton);
    }
    public void rateFiveStar(){
        clickOn(rateFive);
    }
    public String checkReviewMessage(){
        System.out.println("text generate:" + reviewWaitingForApproval.getText());
        return reviewWaitingForApproval.getText();
    }
}
