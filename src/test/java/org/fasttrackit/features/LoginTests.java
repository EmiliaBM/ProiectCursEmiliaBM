package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTests extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void LoginWithValidCredentials(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("user5@gmail.com", "Parola1+Parola");
        loginSteps.clickLogIn();
        loginSteps.checkUserRegist("user5");
    }
    @Test
    public void loginWithInvalidCredentials(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("user5@gmail.com", "11111111");
        loginSteps.clickLogIn();
        loginSteps.checkNotLoggedIn("ERROR: The password you entered for the email address user5@gmail.com" +
                " is incorrect. Lost your password?");
    }
    @Test
    public void loginWithSpecialCredentials() {
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("#rav$n@gmail.com", "Parola1+Parola");
        loginSteps.clickLogIn();
        loginSteps.checkAccountAlreadyRegisteredMessage("Hello ravn (not ravn? Log out)");
    }
}
