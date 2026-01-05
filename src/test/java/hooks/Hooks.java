package hooks;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.ScreenshotUtil;

import java.util.Properties;

public class Hooks extends BaseTest {

    Properties prop;

    @Before
    public void beforeScenario() {
        prop = ConfigReader.loadConfig();
        DriverFactory.initDriver(prop.getProperty("browser"));
        driver = DriverFactory.getDriver();
        driver.get(prop.getProperty("url"));
    }

    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            ScreenshotUtil.takeScreenshot(driver, scenario.getName());
        }

        DriverFactory.quitDriver();
    }
}