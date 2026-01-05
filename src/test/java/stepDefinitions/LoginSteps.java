package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps extends BaseTest {

    LoginPage loginPage;

    @Given("user navigates to login page")
    public void user_navigates_to_login_page() {
        loginPage = new LoginPage(driver);
        loginPage.navigateToLogin();
    }

    @When("user enters valid email and password")
    public void user_enters_valid_credentials() {
        loginPage.enterEmail("testuser@gmail.com");
        loginPage.enterPassword("test@123");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        Assert.assertTrue(loginPage.isLogoutVisible());
    }
}