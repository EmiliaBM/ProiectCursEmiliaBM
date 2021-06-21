package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddNewPostSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class AddNewPostTests extends BaseTest {

    @Steps
    private AddNewPostSteps addNewPostSteps;

    @Test
    public void addNewPostTest(){
        addNewPostSteps.navigateToHomePage();
        addNewPostSteps.enterCredentials("admin","parola11");
        addNewPostSteps.navigateToDashBoard();
        addNewPostSteps.clickOnAddPost("Let's play anyway");
        addNewPostSteps.checkPostPublishedMessage("Post published. View post");
    }
    @Test
    public void modifyNewPostTest(){
        addNewPostSteps.navigateToHomePage();
        addNewPostSteps.enterCredentials("admin","parola11");
        addNewPostSteps.navigateToDashBoard();
        addNewPostSteps.clickOnPosts("Let's play now");
        addNewPostSteps.checkUpdatedPostMessage("Post updated. View post");
    }
}
