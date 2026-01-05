package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

public class OrderSteps extends BaseTest {

    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;

    @And("user navigates to products page")
    public void user_navigates_to_products_page() {
        productPage = new ProductPage(driver);
        productPage.navigateToProducts();
    }

    @And("user adds a product to cart")
    public void user_adds_product_to_cart() {
        productPage.addFirstProductToCart();
        productPage.goToCart();
    }

    @Then("cart page should be displayed")
    public void cart_page_should_be_displayed() {
        cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }
}