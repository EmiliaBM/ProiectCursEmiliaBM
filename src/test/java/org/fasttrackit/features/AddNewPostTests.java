package org.fasttrackit.features;

import org.fasttrackit.steps.AddNewPostSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class AddNewPostTests extends BaseTest {

    private AddNewPostSteps addNewPostSteps;

    @Test
    public void addNewPost(){
        addNewPostSteps.navigateToHomePage();
        addNewPostSteps.enterCredentials("admin","parola11");
        addNewPostSteps.navigateToDashBoard();
        addNewPostSteps.clickOnAddPost();
    }
}
