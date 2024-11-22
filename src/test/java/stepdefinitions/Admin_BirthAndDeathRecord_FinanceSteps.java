package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.Admin_BirthAndDeathRecord_FinancePage;

public class Admin_BirthAndDeathRecord_FinanceSteps {
    private static final Logger logger = LogManager.getLogger(Admin_BirthAndDeathRecord_FinanceSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_BirthAndDeathRecord_FinancePage admin_BirthAndDeathRecord_FinancePage = new Admin_BirthAndDeathRecord_FinancePage(driver);
}
