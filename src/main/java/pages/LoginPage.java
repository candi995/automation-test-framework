package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Locators
    private By signupLoginBtn = By.xpath("//a[text()=' Signup / Login']");
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By loginBtn = By.xpath("//button[text()='Login']");
    private By logoutBtn = By.xpath("//a[text()=' Logout']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void navigateToLogin() {
        driver.findElement(signupLoginBtn).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public boolean isLogoutVisible() {
        return driver.findElement(logoutBtn).isDisplayed();
    }
}
