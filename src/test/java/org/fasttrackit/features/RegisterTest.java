package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;
    @Test
    public void registerTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.registerUser("user5@gmail.com","Parola1+Parola");
        registerSteps.checkUserRegist("user5");
    }

}
