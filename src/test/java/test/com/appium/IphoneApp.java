package test.com.appium;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class IphoneApp extends AppiumSetup {

    @Test
    public void testApp() throws MalformedURLException, InterruptedException {

        prepareCapabilitiesForIphone();

//        driver.findElement(By.name("Continue")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.name("Don’t Allow"));
        Thread.sleep(4000);
    }
}