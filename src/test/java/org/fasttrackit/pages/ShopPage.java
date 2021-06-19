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
    public void clickOnProductAlbum (){
        clickOn(productAlbum);
    }

    public void clickOnShopButton(){
        clickOn(shopButton);
    }
    public void addProductAlbumToCart (){
        clickOn(addProductAlbumToCart);
    }
}
