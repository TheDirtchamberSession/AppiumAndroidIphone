package test.com.appium.utility;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoverageLogIn {


    public static void logIn (AppiumDriver<WebElement> driver, WebDriverWait wait, WaitAnd waitAnd) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(WidgetPath.INSTANCE.getUserNameField()));
        driver.findElement(WidgetPath.INSTANCE.getUserNameField()).click();
        waitAnd.click(WidgetPath.INSTANCE.getUserNameField());
        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,414][640,490]']")).sendKeys("perica.stjepanovic@acumenics.com");
        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,554][640,631]']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,554][640,631]']")).sendKeys("qwerty66");
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[80,709][120,749]']")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[80,804][640,904]']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@bounds='[60,194][509,235]']")));

    }

    }

