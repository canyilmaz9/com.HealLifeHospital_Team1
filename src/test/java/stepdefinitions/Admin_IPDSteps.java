package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.Admin_IPDPage;

public class Admin_IPDSteps {
    private static final Logger logger = LogManager.getLogger(Admin_IPDSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_IPDPage admin_IPDPage = new Admin_IPDPage(driver);
}
