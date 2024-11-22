package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Admin_IPDPage extends BasePage {
    public Admin_IPDPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
