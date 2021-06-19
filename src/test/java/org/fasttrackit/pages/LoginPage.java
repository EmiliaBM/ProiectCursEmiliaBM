package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy (css = "input#username")
    private WebElementFacade emailField;

    @FindBy (css = "input#password")
    private WebElementFacade passField;

    @FindBy (css = "button[name='login']")
    private WebElementFacade loginButton;

    @FindBy(css = "ul[role='alert'] > li")
    private WebElementFacade errorMessageSpan;

    @FindBy(css = ".woocommerce-MyAccount-content > p:nth-of-type(1)")
    private WebElementFacade accountAlreadyRegistered;
    //ai schimbat selectoru? sau contu
    // nu, doar la metode am umblat. am vrut sa le copiez si sa le pun pe alt page ..si atunci am dat copy paste si la FindBY
// asta e alt .ok, vad ca ala era. sa vad si celalalt test


    public void setEmailField(String email){
        typeInto(emailField, email);
    }
    public void setPasswordField(String password){
        typeInto(passField, password);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }
    public String checkInvalidCredentialsMessage(){
        System.out.println("error text generate   " + errorMessageSpan.getText());
        return errorMessageSpan.getText();
    }
    public String checkAccountAlreadyRegisteredMessage(){
        System.out.println("generate text now" + accountAlreadyRegistered.getText());
        return accountAlreadyRegistered.getText();
    }

}
