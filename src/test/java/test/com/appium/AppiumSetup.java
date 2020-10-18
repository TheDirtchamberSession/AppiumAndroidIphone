package test.com.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSetup {

    protected DesiredCapabilities capabilities;

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