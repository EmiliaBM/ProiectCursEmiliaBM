package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WpAdminPage extends PageObject {

    @FindBy (css = "li#menu-posts-product > ul > li:nth-of-type(3) > a")
    private WebElementFacade addProductLink;

    public void addProduct(){
        clickOn(addProductLink);
    }

}
