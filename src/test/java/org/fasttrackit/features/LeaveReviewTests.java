package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LeaveReviewSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class LeaveReviewTests extends BaseTest {

    @Steps
    private LeaveReviewSteps leaveReviewSteps;

    @Test
    public void writeReview() {
        leaveReviewSteps.navigateToHomePage();
        leaveReviewSteps.enterCredentials("user5@gmail.com", "Parola1+Parola");
        leaveReviewSteps.navigateToShop();
        leaveReviewSteps.writeReview();
        leaveReviewSteps.checkUsersReviewMessage("Your review is awaiting approval");
    }
}
