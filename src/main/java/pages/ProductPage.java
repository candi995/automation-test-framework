package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    // Locators
    private By productsMenu = By.xpath("//a[text()=' Products']");
    private By firstProductAddToCart = By.xpath("(//a[text()='Add to cart'])[1]");
    private By continueShoppingBtn = By.xpath("//button[text()='Continue Shopping']");
    private By viewCartBtn = By.xpath("//u[text()='View Cart']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToProducts() {
        driver.findElement(productsMenu).click();
    }

    public void addFirstProductToCart() {
        driver.findElement(firstProductAddToCart).click();
        driver.findElement(continueShoppingBtn).click();
    }

    public void goToCart() {
        driver.findElement(viewCartBtn).click();
    }
}
