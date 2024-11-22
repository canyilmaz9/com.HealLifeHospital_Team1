package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Admin_BirthAndDeathRecord_FinanceSteps {
    private static final Logger logger = LogManager.getLogger(AboutUsSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_BirthAndDeathRecord_FinancePage admin_BirthAndDeathRecord_FinancePage = new Admin_BirthAndDeathRecord_FinancePage(driver);
}
