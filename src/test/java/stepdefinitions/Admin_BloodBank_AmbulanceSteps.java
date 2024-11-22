package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.Admin_BloodBank_AmbulancePage;

public class Admin_BloodBank_AmbulanceSteps {
    private static final Logger logger = LogManager.getLogger(Admin_BloodBank_AmbulanceSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_BloodBank_AmbulancePage admin_BloodBank_AmbulancePage = new Admin_BloodBank_AmbulancePage(driver);
}
