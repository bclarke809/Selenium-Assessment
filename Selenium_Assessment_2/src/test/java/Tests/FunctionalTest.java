package Tests;

import Pages.HomePage;
import Pages.JavaScript_Alert_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionalTest extends BaseClass {

    @Test
    public void WebDriver() {
        driver.navigate().to("http://the-internet.herokuapp.com/");

        HomePage homePage = new HomePage(driver);
        JavaScript_Alert_Page AlertPage = new JavaScript_Alert_Page(driver);

        homePage.JS_Alert();
        AlertPage.JSConfirm();
        AlertPage.JS_Confirm_Alert();

        Assert.assertEquals("You clicked: Ok", AlertPage.JS_Result());
    }
}
