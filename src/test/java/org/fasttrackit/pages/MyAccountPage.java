package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject {
    @FindBy(css = "#reg_email")
    private WebElementFacade emailField;
    @FindBy(css = "#reg_password")
    private WebElementFacade passField;
    @FindBy(css = "p.woocommerce-FormRow.form-row > button")
    private WebElementFacade registerButton;
    @FindBy(css = "#post-7 > div > div > div > p:nth-child(1) > strong:nth-child(1)")
    private WebElementFacade helloText;
    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(2) > div")
    private WebElementFacade weakPass;



    public void setEmailField(String text){
        typeInto(emailField,text);
    }
    public void setPassField(String text){
        typeInto(passField,text);
    }
    public void setRegisterButton(){
        clickOn(registerButton);
    }
    public String checkRegisterMessage(){
        System.out.println(helloText.getText());
        return helloText.getText();
    }
    public String checkWeakPassMessage() {
        System.out.println(weakPass.getText());
        waitFor(3000);
        return weakPass.getText();
    }


}
