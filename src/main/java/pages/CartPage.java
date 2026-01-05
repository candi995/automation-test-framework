package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    private By cartPageTitle = By.xpath("//li[text()='Shopping Cart']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCartPageDisplayed() {
        return driver.findElement(cartPageTitle).isDisplayed();
    }
}
