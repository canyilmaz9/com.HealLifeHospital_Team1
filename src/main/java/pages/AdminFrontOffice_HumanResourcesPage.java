package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdminFrontOffice_HumanResourcesPage extends BasePage {
    public AdminFrontOffice_HumanResourcesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
