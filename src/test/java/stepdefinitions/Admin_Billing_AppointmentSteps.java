package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.Admin_Billing_AppointmentPage;

public class Admin_Billing_AppointmentSteps {
    private static final Logger logger = LogManager.getLogger(Admin_Billing_AppointmentSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_Billing_AppointmentPage adminBillingAppointmentPage = new Admin_Billing_AppointmentPage(driver);
}
