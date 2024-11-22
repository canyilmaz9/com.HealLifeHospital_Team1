package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.Admin_Pharmacy_Pathology_RadiologyPage;

public class Admin_Pharmacy_Pathology_RadiologySteps {
    private static final Logger logger = LogManager.getLogger(Admin_Pharmacy_Pathology_RadiologySteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_Pharmacy_Pathology_RadiologyPage admin_Pharmacy_Pathology_RadiologyPage = new Admin_Pharmacy_Pathology_RadiologyPage(driver);
}
