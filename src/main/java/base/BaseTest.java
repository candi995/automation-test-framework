package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverFactory;

import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;
    Properties prop;

    //@BeforeMethod
    public void setUp() {
        prop = ConfigReader.loadConfig();
        DriverFactory.initDriver(prop.getProperty("browser"));
        driver = DriverFactory.getDriver();
        driver.get(prop.getProperty("url"));
    }

  //  @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
