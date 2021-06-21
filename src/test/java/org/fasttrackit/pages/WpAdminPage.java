package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WpAdminPage extends PageObject {

    @FindBy (css = "li#menu-posts-product  .wp-menu-name")
    private WebElementFacade productsLink;

    @FindBy (css =".wrap > a:nth-of-type(1)")
    private WebElementFacade addNewProductButton;

    @FindBy ( css = "li#menu-posts  .wp-menu-name")
    private WebElementFacade postsLink;

    @FindBy (css =".page-title-action")
    private WebElementFacade addNewPostLink;

    @FindBy (css ="input#title")
    private WebElementFacade newPostTitle;

    @FindBy ( css = "input#publish")
    private WebElementFacade publishButton;

    @FindBy ( css = "input#publish")
    private WebElementFacade updateButton;

    @FindBy (css =".wrap > div:nth-of-type(3) > p")
    private WebElementFacade postPublishedMessage;

    @FindBy (css =".wrap > div:nth-of-type(3) > p")
    private WebElementFacade updatedPostMessage;

    @FindBy ( css =".author-self.category-uncategorized.format-standard.hentry.iedit.level-0.post-408.status-publish.type-post .row-title")
    private WebElementFacade lastPostTitle;

    @FindBy (css ="#post-1 > td.title.column-title.has-row-actions.column-primary.page-title > strong > a")
    private WebElementFacade firstPostTitle;

    @FindBy (css ="#message > p")
    private WebElementFacade productPublishedMessage;

    @FindBy (css ="input#title")
    private WebElementFacade productTitle;

    @FindBy (css ="input#publish")
    private WebElementFacade publishProductButton;

    @FindBy (css=".author-self.hentry.iedit.level-0.post-431.product_cat-uncategorized.status-publish.type-product .row-title")
    private WebElementFacade lastProductsTitle;

    @FindBy (css ="#title")
    private WebElementFacade theTitleOfTheProduct;

    public void setProductsLink(){
        clickOn(productsLink);
    }
    public void addNewProduct(){
        clickOn(addNewProductButton);
    }
    public void setPostsLink(){
        clickOn(postsLink);
    }
    public void setAddNewPostLink(){
        clickOn(addNewPostLink);
    }
    public void setNewPostTitle(String title){
        typeInto(newPostTitle, title);
    }

    public void clickOnPublishButton(){
        clickOn(publishButton);
    }
    public String checkPostPublishedMessage(){
        System.out.println("generate text:" + postPublishedMessage.getText());
        return postPublishedMessage.getText();
    }
    public void clickOnLastPostTitle(){
        clickOn(lastPostTitle);
    }
    public void modifyLastPostTitle(String newTitle){
        typeInto(newPostTitle,newTitle);
    }
    public void clickOnUpdateButton(){
        clickOn((updateButton));
    }
    public String checkUpdatedPostMessage(){
        System.out.println("generate text:" + updatedPostMessage.getText());
        return updatedPostMessage.getText();
    }
    public void clickOnFirstPostTitle(){
        clickOn(firstPostTitle);
    }
    public void modifyFirstPostTitle(String newTitle){
        typeInto(newPostTitle,newTitle);
    }
    public String checkPostPublishedProductMessage(){
        System.out.println("generate text:" + productPublishedMessage.getText());
        return productPublishedMessage.getText();
    }
    public void setProductTitle (String titleOfTheProduct){
        typeInto(productTitle, titleOfTheProduct);
    }
    public void clickOnPublishNewProductButton(){
        clickOn(publishProductButton);
    }
    public void clickOnLastProductsTitle(){
        clickOn(lastProductsTitle);
    }
    public void modifyLastProductsTitle(String aNewTitle){
        typeInto(theTitleOfTheProduct, aNewTitle);
    }
    public String checkUpdatedProductMessage(){
        System.out.println("generate text:" + productPublishedMessage.getText());
        return productPublishedMessage.getText();
    }
}
