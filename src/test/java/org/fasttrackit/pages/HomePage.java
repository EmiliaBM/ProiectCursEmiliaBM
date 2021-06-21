package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")

public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-64 > a")
    private WebElementFacade myAccountLink;

    @FindBy (css ="form[role='search'] > input[name='s']")
    private WebElementFacade searchField;

    public void setMyAccountLink(){
        clickOn(myAccountLink);
    }
    public void clickAccountLink(){
        clickOn(myAccountLink);
    }
    public void clickOnSearchField(){
        clickOn(searchField);
    }
    public void setSearchField(String text){
        typeInto(searchField, text );
    }
}
