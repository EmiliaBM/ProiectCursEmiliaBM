package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTests extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.registerUser("users10@gmail.com","Parola1+Parola");
        registerSteps.checkUserRegist("users10");
    }
    @Test
    public void registerTestWeakPass() {
        registerSteps.navigateToRegisterPage();
        registerSteps.registerUserWithWeakPass("user7@gmail.com","1234567!");
        registerSteps.checkWeakPass("Weak - Please enter a stronger password.");

    }
    @Test
    public void registerTestAccountAlreadyRegistered(){
        registerSteps.navigateToRegisterPage();
        registerSteps.registerUser("user5@gmail.com","Parola1+Parola");
        registerSteps.checkAccountAlreadyRegisteredMessage("Error: An account is already registered with your email address. Please log in.");
    }

}
