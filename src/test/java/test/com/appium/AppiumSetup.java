package test.com.appium;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumSetup {

    AppiumDriver<WebElement> driver;
    test.com.appium.waitAnd waitAnd;
    WebDriverWait wait;

    protected DesiredCapabilities capabilities;

    public void setUp() throws MalformedURLException {
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AppiumDriver<>(url, capabilities);
        wait = new WebDriverWait(driver, 25);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        waitAnd = new waitAnd(wait);
    }

    protected void prepareCapabilitiesForIphone() {

        capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "iPhone 11");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("app", "com.apple.Maps");

    }

    protected void prepareCapabilitiesForAndroid() {

        capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.webpartners.leonardo");
        capabilities.setCapability("appActivity", "com.webpartners.leonardo.MainActivity");

    }
}