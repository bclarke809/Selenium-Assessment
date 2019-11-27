package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base_Super_Class {
    @FindBy(xpath = "/html/body/div[2]/div/ul/li[29]/a")
    private WebElement JS_Alert_Home;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void JS_Alert() {
        JS_Alert_Home.click();
    }
}
