package org.fasttrackit.features;

import org.fasttrackit.steps.LeaveAreplySteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class LeaveAreplyTests extends BaseTest {

    private LeaveAreplySteps leaveAreplySteps;

    @Test
    public void leaveAreplyTest(){
        leaveAreplySteps.navigateToHomePage();
        leaveAreplySteps.enterCredentials("user5@gmail.com","Parola1+Parola");
        leaveAreplySteps.navigateToShop();
    }
}
