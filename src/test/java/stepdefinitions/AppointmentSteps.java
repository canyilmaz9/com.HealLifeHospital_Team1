package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.AppointmentPage;

public class AppointmentSteps {
    private static final Logger logger = LogManager.getLogger(AppointmentSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    AppointmentPage appointmentPage = new AppointmentPage(driver);
}
