package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShopPage extends PageObject {

    @FindBy(css = "#primary > main > div > div > div.item.first.post-27.product.type-product.status-publish.has-post-thumbnail.product_cat-music.instock.downloadable.virtual.taxable.purchasable.product-type-simple > div > div.p-info > div.product-details > a")
    private WebElementFacade productAlbum;

    @FindBy (css = "#menu-item-66 > a")
    private WebElementFacade shopButton;

    @FindBy (css = "#primary > main > div > div > div.item.first.post-27.product.type-product.status-publish.has-post-thumbnail.product_cat-music.instock.downloadable.virtual.taxable.purchasable.product-type-simple > div > div.p-info > div.action > a")
    private WebElementFacade addProductAlbumToCart;

    @FindBy (css ="#post-5 > div > div > p.return-to-shop > a")
    private WebElementFacade returnToShopButton;

    @FindBy (css = ".woocommerce-result-count")
    private WebElementFacade showingResultsText;

    @FindBy (css="[class='item post-19 product type-product status-publish has-post-thumbnail product_cat-accessories last instock sale taxable shipping-taxable purchasable product-type-simple'] .attachment-woocommerce_thumbnail")
    private WebElementFacade productBeanie;

    public void clickOnProductAlbum (){
        clickOn(productAlbum);
    }
    public void clickOnShopButton(){
        clickOn(shopButton);
    }
    public void addProductAlbumToCart (){
        clickOn(addProductAlbumToCart);
    }
    public void clickOnReturnToShopButton(){
        clickOn(returnToShopButton);
    }
    public String checkResultsText(){
        System.out.println("generate text:" + showingResultsText.getText());
        return showingResultsText.getText();
    }
    public void clickOnProductBeanie (){
        clickOn(productBeanie);
    }

}
