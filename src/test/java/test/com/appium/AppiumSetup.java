package test.com.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSetup {
    AppiumDriver<MobileElement> driver;

    protected DesiredCapabilities capabilities;

    protected void prepareCapabilitiesForIphone() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "iPhone 11");
        cap.setCapability("platformName", "iOS");
        cap.setCapability("automationName", "XCUITest");
        cap.setCapability("app", "com.apple.Maps");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AppiumDriver<MobileElement> driver = new AppiumDriver<>(url, cap);

    }

    protected void prepareCapabilitiesForAndroid() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Redmi5");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability(CapabilityType.VERSION, "7.1.2");
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("appPackage", "com.rumble.camera");
        capabilities.setCapability("appActivity", "com.rumble.camera.DispatchActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AppiumDriver<MobileElement> driver = new AppiumDriver<>(url, cap);

    }
}