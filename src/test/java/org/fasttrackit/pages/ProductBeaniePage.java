package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductBeaniePage extends PageObject {

    @FindBy (css = "li#tab-title-reviews > a")
    private WebElementFacade reviewsLink;

    @FindBy (css = "textarea#comment")
    private WebElementFacade reviewBox;

    @FindBy (css = "input#submit")
    private WebElementFacade submitButton;

    @FindBy (css = ".star-5")
    private WebElementFacade rateFive;

    @FindBy (css = "#comment-487 > div > p > em")
    private WebElementFacade reviewWaitingForTheApproval;

    @FindBy (css ="body#error-page > p:nth-of-type(2)")
    private WebElementFacade duplicateReviewMessage;

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
    public String checkReviewMessageForProductBeanie(){
        System.out.println("text generate:" + reviewWaitingForTheApproval.getText());
        return reviewWaitingForTheApproval.getText();
    }
    public String checkDuplicateReviewMessageForProductBeanie(){
        System.out.println("text generate:" + duplicateReviewMessage.getText());
        return duplicateReviewMessage.getText();
    }
}
