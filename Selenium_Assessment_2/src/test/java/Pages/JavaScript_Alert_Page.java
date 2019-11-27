package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScript_Alert_Page extends Base_Super_Class {

    @FindBy(xpath = "/html/body/div[2]/div/div/ul/li[2]/button")
    private WebElement JS_Confirm;

    @FindBy(id = "result")
    private WebElement Result;

    public JavaScript_Alert_Page(WebDriver driver) {
        super(driver);
    }

    public void JSConfirm() {
        JS_Confirm.click();
    }

    public void JS_Confirm_Alert() {
        driver.switchTo().alert().accept();
    }

    public String JS_Result() {
        String result = this.Result.getText();
        return result;
    }
}
