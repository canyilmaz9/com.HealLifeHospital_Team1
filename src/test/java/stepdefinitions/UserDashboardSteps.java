package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePageHeaderPage;
import pages.UserDashboardPage;
import utilities.ConfigReader;

public class UserDashboardSteps {

    private static final Logger logger = LogManager.getLogger(HomePageHeaderSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();

    HomePageHeaderPage homePageHeaderPage = new HomePageHeaderPage(driver);
    UserDashboardPage userDashboardPage = new UserDashboardPage(driver);

    @Given("User goes to the User Login Page")
    public void user_goes_to_the_user_login_page() {
        driver.get(ConfigReader.getProperty("loginPageUrl"));
        logger.info("User Login sayfasına gidildi");
    }

    @Given("Enters the valid username and password in the User Login Page")
    public void enters_the_valid_username_and_password_in_the_user_login_page() {
        driver.findElement(By.id("email")).sendKeys("pat99");
        driver.findElement(By.id("password")).sendKeys("zzzjbq");
        logger.info("User Login sayfasında geçerli kullanıcı adı ve şifresi girildi");
    }
    @Then("Clicks on the Login Button in the User Login Page")
    public void clicks_on_the_login_button_in_the_user_login_page() {
        driver.findElement(By.className("btn")).click();
        logger.info("User Login sayfasında Login butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard Page")
    public void verifies_that_it_is_user_dashboard_page() {
        String expUrl = "https://qa.heallifehospital.com/patient/dashboard";
        String actUrl = driver.getCurrentUrl();
        Assert.assertEquals(expUrl, actUrl);
        logger.info("User Dashboard sayfasının açıldığı doğrulandı");
    }
    @Then("Verifies that User Dashboard button is visible")
    public void verifies_that_user_dashboard_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPageDashboardButton.isDisplayed());
        logger.info("User Dashboard butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard Button")
    public void clicks_on_the_user_dashboard_button() {
        userDashboardPage.userPageDashboardButton.click();
        logger.info("User Dashboard butonuna tıklandı");
    }
        @When("Verifies that User Dashboard My Appointments button is visible")
    public void verifies_that_user_dashboard_my_appointments_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPageMyAppointmentsButton.isDisplayed());
        logger.info("User Dashboard My Appointments butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard My Appointments button")
    public void clicks_on_the_user_dashboard_my_appointments_button() {
        userDashboardPage.userPageMyAppointmentsButton.click();
        logger.info("User Dashboard My Appointments butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard My Appointments Page")
    public void verifies_that_it_is_user_dashboard_my_appointments_page() {
        Assert.assertTrue(userDashboardPage.userAppointmentPageMyAppText.isDisplayed());
        logger.info("User Dashboard My Appointments sayfasının açıldığı test edildi");
    }
    @When("Verifies that User Dashboard OPD button is visible")
    public void verifies_that_user_dashboard_opd_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPageOPDButton.isDisplayed());
        logger.info("User Dashboard OPD butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard OPD button")
    public void clicks_on_the_user_dashboard_opd_button() {
        userDashboardPage.userPageOPDButton.click();
        logger.info("User Dashboard OPD butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard OPD Page")
    public void verifies_that_it_is_user_dashboard_opd_page() {
        Assert.assertTrue(userDashboardPage.userOPDPageVisitsButton.isDisplayed());
        logger.info("User Dashboard OPD sayfasının açıldığı test edildi");
    }
    @When("Verifies that User Dashboard IPD button is visible")
    public void verifies_that_user_dashboard_ipd_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPageIPDButton.isDisplayed());
        logger.info("User Dashboard IPD butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard IPD button")
    public void clicks_on_the_user_dashboard_ipd_button() {
        userDashboardPage.userPageIPDButton.click();
        logger.info("User Dashboard IPD butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard IPD Page")
    public void verifies_that_it_is_user_dashboard_ipd_page() {
        Assert.assertTrue(userDashboardPage.userIPDPageIPDText.isDisplayed());
        logger.info("User Dashboard IPD sayfasının açıldığı test edildi");
    }
    @When("Verifies that User Dashboard Pharmacy button is visible")
    public void verifies_that_user_dashboard_pharmacy_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPagePharmacyButton.isDisplayed());
        logger.info("User Dashboard Pharmacy butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard Pharmacy button")
    public void clicks_on_the_user_dashboard_pharmacy_button() {
        userDashboardPage.userPagePharmacyButton.click();
        logger.info("User Dashboard Pharmacy butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard Pharmacy Page")
    public void verifies_that_it_is_user_dashboard_pharmacy_page() {
        Assert.assertTrue(userDashboardPage.userPharmacyPagePharmacyBillText.isDisplayed());
        logger.info("User Dashboard Pharmacy sayfasının açıldığı test edildi");
    }
    @When("Verifies that User Dashboard Pathology button is visible")
    public void verifies_that_user_dashboard_pathology_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPagePathologyButton.isDisplayed());
        logger.info("User Dashboard Pathology butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard Pathology button")
    public void clicks_on_the_user_dashboard_pathology_button() {
        userDashboardPage.userPagePathologyButton.click();
        logger.info("User Dashboard Pathology butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard Pathology Page")
    public void verifies_that_it_is_user_dashboard_pathology_page() {
        Assert.assertTrue(userDashboardPage.userPathologyPagePatholoyText.isDisplayed());
        logger.info("User Dashboard Pathology sayfasının açıldığı test edildi");
    }
    @When("Verifies that User Dashboard Radiology button is visible")
    public void verifies_that_user_dashboard_radiology_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPageRadiologyButton.isDisplayed());
        logger.info("User Dashboard Radiology butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard Radiology button")
    public void clicks_on_the_user_dashboard_radiology_button() {
        userDashboardPage.userPageRadiologyButton.click();
        logger.info("User Dashboard Radiology butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard Radiology Page")
    public void verifies_that_it_is_user_dashboard_radiology_page() {
        Assert.assertTrue(userDashboardPage.userRadiologyPageRadiologyText.isDisplayed());
        logger.info("User Dashboard Radiology sayfasının açıldığı test edildi");
    }
    @When("Verifies that User Dashboard Ambulance button is visible")
    public void verifies_that_user_dashboard_ambulance_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPageAmbulanceButton.isDisplayed());
        logger.info("User Dashboard Ambulance butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard Ambulance button")
    public void clicks_on_the_user_dashboard_ambulance_button() {
        userDashboardPage.userPageAmbulanceButton.click();
        logger.info("User Dashboard Ambulance butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard Ambulance Page")
    public void verifies_that_it_is_user_dashboard_ambulance_page() {
        Assert.assertTrue(userDashboardPage.userAmbulancePageAmbulanceText.isDisplayed());
        logger.info("User Dashboard Ambulance sayfasının açıldığı test edildi");
    }
    @When("Verifies that User Dashboard Blood Bank button is visible")
    public void verifies_that_user_dashboard_blood_bank_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPageBloodBankButton.isDisplayed());
        logger.info("User Dashboard Blood Bank butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard Blood Bank button")
    public void clicks_on_the_user_dashboard_blood_bank_button() {
        userDashboardPage.userPageBloodBankButton.click();
        logger.info("User Dashboard Blood Bank butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard Blood Bank Page")
    public void verifies_that_it_is_user_dashboard_blood_bank_page() {
        Assert.assertTrue(userDashboardPage.userBloodBankPageIssueText.isDisplayed());
        logger.info("User Dashboard Blood Bank sayfasının açıldığı test edildi");
    }
    @When("Verifies that User Dashboard Live Consultation button is visible")
    public void verifies_that_user_dashboard_live_consultation_button_is_visible() {
        Assert.assertTrue(userDashboardPage.userPageLiveConsultationButton.isDisplayed());
        logger.info("User Dashboard Live Consultation butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the User Dashboard Live Consultation button")
    public void clicks_on_the_user_dashboard_live_consultation_button() {
        userDashboardPage.userPageLiveConsultationButton.click();
        logger.info("User Dashboard Live Consultation butonuna tıklandı");
    }
    @Then("Verifies that it is User Dashboard Live Consultation Page")
    public void verifies_that_it_is_user_dashboard_live_consultation_page() {
        Assert.assertTrue(userDashboardPage.userLiveConsultationPageText.isDisplayed());
        logger.info("User Dashboard Live Consultation sayfasının açıldığı test edildi");
    }


}
