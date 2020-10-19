package test.com.appium.utility

import org.openqa.selenium.By

object WidgetPath {

    val baseURL = "http://0.0.0.0:4723/wd/hub"
    val userNameField: By = By.xpath("//android.widget.EditText[@bounds='[80,414][640,490]']")

}