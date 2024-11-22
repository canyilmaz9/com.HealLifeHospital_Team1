package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.Admin_OPDPage;

public class Admin_OPDSteps {
    private static final Logger logger = LogManager.getLogger(Admin_OPDSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_OPDPage admin_OPDPage = new Admin_OPDPage(driver);
}
