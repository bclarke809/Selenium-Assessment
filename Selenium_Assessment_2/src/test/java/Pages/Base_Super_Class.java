package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Super_Class {
    protected WebDriver driver;

    public Base_Super_Class(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
