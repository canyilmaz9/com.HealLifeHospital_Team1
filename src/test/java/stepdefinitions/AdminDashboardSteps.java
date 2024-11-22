package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.AdminDashboardPage;

public class AdminDashboardSteps {
    private static final Logger logger = LogManager.getLogger(AdminDashboardSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
}
