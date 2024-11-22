package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AdminDashboardPage;
import pages.AdminFrontOffice_HumanResourcesPage;

public class AdminFrontOffice_HumanResourcesSteps {
    private static final Logger logger = LogManager.getLogger(AdminFrontOffice_HumanResourcesSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    AdminFrontOffice_HumanResourcesPage adminFrontOffice_HumanResourcesPage = new AdminFrontOffice_HumanResourcesPage(driver);

 }
