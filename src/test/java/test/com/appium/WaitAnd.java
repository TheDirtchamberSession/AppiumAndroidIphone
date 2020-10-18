package test.com.appium;
;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitAnd {

    public static AppiumDriver<MobileElement> driver;

    WebDriverWait wait;

    public WaitAnd (WebDriverWait wait){
        this.wait = wait;

    }

    public void Click (By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }

    public void SendKeys(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void Clear (By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).clear();
    }
}

