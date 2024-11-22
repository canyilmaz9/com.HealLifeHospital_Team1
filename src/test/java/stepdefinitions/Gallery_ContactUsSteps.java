package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AdminFrontOffice_HumanResourcesPage;
import pages.Gallery_ContactUsPage;

public class Gallery_ContactUsSteps {
    public class AdminFrontOffice_HumanResourcesSteps {
        private static final Logger logger = LogManager.getLogger(AdminFrontOffice_HumanResourcesSteps.class);
        WebDriver driver = stepdefinitions.Hooks.getDriver();
        Gallery_ContactUsPage galleryContactUsPage = new Gallery_ContactUsPage(driver);
    }
}
