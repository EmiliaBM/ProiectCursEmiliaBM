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
        addNewProductSteps.checkPostProductPublishedMessage("Thumbnail regeneration is running in the background. Depending on the amount of images in your store this may take a while.");
    }
    @Test
    public void modifyJeansTommyOriginalProductTitle() {
        addNewProductSteps.navigateToHomePage();
        addNewProductSteps.enterCredentials("admin", "parola11");
        addNewProductSteps.navigateToDashBoard();
        addNewProductSteps.modifyLastProductsTitle();
        addNewProductSteps.checkUpdatedMessage("Thumbnail regeneration is running in the background. Depending on the amount of images in your store this may take a while.");
    }
}
