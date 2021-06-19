package org.fasttrackit.features;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.ProductAlbumPage;
import org.fasttrackit.pages.ShopPage;
import org.fasttrackit.steps.AddProductToCartSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class AddToCartTests extends BaseTest {

  @Steps
  private AddProductToCartSteps addProductToCartSteps;

  @Test
  public void clickOnAlbumProduct(){
  addProductToCartSteps.navigateToHomePage();
  addProductToCartSteps.enterCredentials("user5@gmail.com", "Parola1+Parola");
  addProductToCartSteps.navigateToShop();
  }

  @Test
  public void addAlbumProductToCart(){
  addProductToCartSteps.navigateToHomePage();
  addProductToCartSteps.enterCredentials("user5@gmail.com", "Parola1+Parola");
  addProductToCartSteps.navigateToShop();
  addProductToCartSteps.addProductToCart();
  addProductToCartSteps.addedToCartMessage("View cart\n" +
          "“Album” has been added to your cart.");
    }
  @Test
  public void AddAlbumProductToCartFromShopPage(){
    addProductToCartSteps.navigateToHomePage();
    addProductToCartSteps.enterCredentials("user5@gmail.com", "Parola1+Parola");
    addProductToCartSteps.navigateToShopAndAddAlbumProductToCart();
  }
}
