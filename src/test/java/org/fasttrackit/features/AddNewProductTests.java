package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddNewProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class AddNewProductTests extends BaseTest {

    @Steps
    private AddNewProductSteps addNewProductSteps;

    @Test
    public void addNewProduct(){
        addNewProductSteps.navigateToHomePage();
        addNewProductSteps.enterCredentials("admin", "parola11");
        addNewProductSteps.navigateToDashBoard();
        addNewProductSteps.clickOnAddProduct();
    }
}
