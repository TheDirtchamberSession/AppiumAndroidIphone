package test.com.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class TestMy extends AppiumSetup{

    @BeforeTest
    public void setUp() throws MalformedURLException {

        prepareCapabilitiesForIphone();

    }

    @Test
    public void testApp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "iPhone 11");
        cap.setCapability("platformName", "iOS");
        cap.setCapability("automationName", "XCUITest");
        cap.setCapability("app", "com.apple.Maps");


        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AppiumDriver<MobileElement> driver = new AppiumDriver<>(url, cap);
        driver.findElement(By.name("Continue")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("Don’t Allow"));
        Thread.sleep(4000);
    }
}