package test.com.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class PhoneLookupScreen {

    public static AppiumDriver<MobileElement> driver;

    public PhoneLookupScreen(AppiumDriver<MobileElement> driver){

        PhoneLookupScreen.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }
}
