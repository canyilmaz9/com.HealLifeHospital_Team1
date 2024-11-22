package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Admin_BirthAndDeathRecord_FinancePage extends BasePage {
    public Admin_BirthAndDeathRecord_FinancePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }
}