package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Gallery_ContactUsPage extends BasePage {
    public Gallery_ContactUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
