package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Admin_OPDPage extends BasePage{
    public Admin_OPDPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
