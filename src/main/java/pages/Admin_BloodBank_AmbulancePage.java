package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Admin_BloodBank_AmbulancePage extends BasePage {
    public Admin_BloodBank_AmbulancePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
