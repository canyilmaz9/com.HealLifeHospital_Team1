package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Admin_Pharmacy_Pathology_RadiologyPage extends BasePage {
    public Admin_Pharmacy_Pathology_RadiologyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
