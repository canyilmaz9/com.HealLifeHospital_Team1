package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.HomePage;

public class AboutUsSteps {

    private static final Logger logger = LogManager.getLogger(AboutUsSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    AboutUsPage aboutUsPage = new AboutUsPage(driver);
    //



}
