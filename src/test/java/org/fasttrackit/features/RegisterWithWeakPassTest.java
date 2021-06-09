package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterWithWeakPassTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;
    @Test
    public void registerTest() {
        registerSteps.navigateToRegisterPage();
        registerSteps.registerUserWithWeakPass("user7@gmail.com","1234567!");
        registerSteps.checkWeakPass("Weak - Please enter a stronger password.");

    }
}
