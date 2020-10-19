package test.com.appium;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.com.appium.utility.CoverageLogIn;
import java.net.MalformedURLException;


public class LogInAndroid extends AppiumSetup {

    @BeforeTest
    public void setUp() throws MalformedURLException {
        prepareCapabilitiesForAndroid();
        super.setUp();
    }

    @Test
    public void testApp() throws InterruptedException {

        CoverageLogIn.logIn(driver, wait, waitAnd);

    }
}