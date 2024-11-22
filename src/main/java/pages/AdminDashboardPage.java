package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage extends BasePage{
    public AdminDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
