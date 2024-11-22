package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AppointmentPage extends BasePage{
    public AppointmentPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
