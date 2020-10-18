package test.com.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.com.appium.utility.CoverageLogIn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class LogInAndroid extends AppiumSetup {

    private WebDriverWait wait;
    private WaitAnd waitAnd;

    @BeforeTest
    public void setUp() {

        prepareCapabilitiesForAndroid();

    }

    @Test
    public void testApp() throws MalformedURLException, InterruptedException {

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AppiumDriver<WebElement> driver = new AppiumDriver<>(url, capabilities);
        wait = new WebDriverWait(driver, 25);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);


        //test
        CoverageLogIn.logIn(driver, wait);


        //Test
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@bounds='[80,414][640,490]']")));
//        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,414][640,490]']")).click();
//        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,414][640,490]']")).sendKeys("perica.stjepanovic@acumenics.com");
//        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,554][640,631]']")).click();
//        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,554][640,631]']")).sendKeys("qwerty66");
//        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[80,709][120,749]']")).click();
//        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[80,804][640,904]']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@bounds='[60,194][509,235]']")));

    }
}