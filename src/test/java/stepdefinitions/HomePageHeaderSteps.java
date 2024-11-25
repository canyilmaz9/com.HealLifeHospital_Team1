package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePageHeaderPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import javax.swing.*;
import static utilities.ReusableMethods.bekle;


public class HomePageHeaderSteps {

    private static final Logger logger = LogManager.getLogger(HomePageHeaderSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();

    HomePageHeaderPage homePageHeaderPage = new HomePageHeaderPage(driver);

    @Given("User goes to the Home Page")
    public void user_goes_to_the() {
        driver.get(ConfigReader.getProperty("homePageUrl"));
        logger.info("Ana Sayfa'ya gidildi");
    }

    @Given("Verifies that it is Heal Life HomePage")
    public void verifies_that_it_is_heal_life_home_page() {
        String expUrl = "https://qa.heallifehospital.com/";
        String actUrl = driver.getCurrentUrl();
        Assert.assertEquals(expUrl, actUrl);
        logger.info("Ana Sayfa'ya gidildiği doğrulandı");
    }
    @Then("Verifies that LatestNews button is visible")
    public void verifies_that_latest_news_button_is_visible() {
        Assert.assertTrue(homePageHeaderPage.headerLatestNewsButton.isDisplayed());
        logger.info("Latest News butonunun görünür olduğu test edildi");
    }
    @Then("Tests that the LatestNews information is visible as scrolling text")
    public void tests_that_the_latest_news_information_is_visible_as_scrolling_text() {
        Assert.assertTrue(homePageHeaderPage.headerLatestNewsScroll.isDisplayed());
        logger.info("Latest News butonunun görünür olduğu test edildi");
    }
    @Then("Verifies that HealLife Logo is visible")
    public void verifies_that_heal_life_logo_is_visible() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(homePageHeaderPage.headerLogo.isDisplayed());
        logger.info("Heal Life Logosunun görünür olduğu test edildi");
    }
    @Then("Verifies that Header Home Button is visible")
    public void verifies_that_header_home_button_is_visible() {
        Assert.assertTrue(homePageHeaderPage.headerHomeButton.isDisplayed());
        logger.info("Header'daki Home Butonunun görünür olduğu test edildi");
    }
    @Then("Verifies that Header Appointment Button is visible")
    public void verifies_that_header_appointment_button_is_visible() {
        Assert.assertTrue(homePageHeaderPage.headerAppointmentButton.isDisplayed());
        logger.info("Header'daki Appointment Butonunun görünür olduğu test edildi");
    }
    @Then("Verifies that Header About Us Button is visible")
    public void verifies_that_header_about_us_button_is_visible() {
        Assert.assertTrue(homePageHeaderPage.headerAboutUsButton.isDisplayed());
        logger.info("Header'daki About Us Butonunun görünür olduğu test edildi");
    }
    @Then("Verifies that Header Gallery Button is visible")
    public void verifies_that_header_gallery_button_is_visible() {
        Assert.assertTrue(homePageHeaderPage.headerGalleryButton.isDisplayed());
        logger.info("Header'daki Gallery Butonunun görünür olduğu test edildi");
    }
    @Then("Verifies that Header Contact Us Button is visible")
    public void verifies_that_header_contact_us_button_is_visible() {
        Assert.assertTrue(homePageHeaderPage.headerContactUsButton.isDisplayed());
        logger.info("Header'daki Contact Us Butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the HealLife Logo")
    public void clicks_on_the_heal_life_logo() {
        homePageHeaderPage.headerLogo.click();
        logger.info("Heal Life Logosuna tıklandı");
    }

    @Then("Clicks on the Header Home Button")
    public void clicks_on_the_header_home_button() {
        homePageHeaderPage.headerHomeButton.click();
        logger.info("Header'daki Home butonuna tıklandı");
    }

    @Then("Verifies that Heal Life HomePage opens")
    public void verifies_that_heal_life_home_page_opens() {
        String expUrl = "https://qa.heallifehospital.com/frontend";
        String actUrl = driver.getCurrentUrl();
        Assert.assertEquals(expUrl, actUrl);
        logger.info("Ana Sayfa'nın açıldığı doğrulandı");
    }
    @Then("Clicks on the Appointment Button")
    public void clicks_on_the_appointment_button() {
        homePageHeaderPage.headerAppointmentButton.click();
        logger.info("Header'daki Appointment butonuna tıklandı");
    }

    @Then("Verifies that it is Appointment Page")
    public void verifies_that_it_is_appointment_page() {
        Assert.assertTrue(homePageHeaderPage.AppointmentPageSpecialistButton.isDisplayed());
        logger.info("Appointment sayfasının açıldığı doğrulandı");
    }
    @Then("Clicks on the About Us Button")
    public void clicks_on_the_about_us_button() {
        homePageHeaderPage.headerAboutUsButton.click();
        logger.info("Header'daki About Us butonuna tıklandı");
    }

    @Then("Verifies that the dropdown menu opens")
    public void verifies_that_the_dropdown_menu_opens() {
        Assert.assertTrue(homePageHeaderPage.headerDropDownFAQsButton.isDisplayed());
        logger.info("Header'daki About Us dropdownunun açıldığı doğrulandı");
    }
    @Then("Clicks on the Gallery Button")
    public void clicks_on_the_gallery_button() {
        homePageHeaderPage.headerGalleryButton.click();
        logger.info("Header'daki Gallery butonuna tıklandı");
    }

    @Then("Verifies that it is Gallery Page")
    public void verifies_that_it_is_gallery_page() {
        Assert.assertTrue(homePageHeaderPage.GalleryPageGalleryButton.isDisplayed());
        logger.info("Gallery sayfasının açıldığı doğrulandı");
    }
    @Then("Clicks on the Contact Us Button")
    public void clicks_on_the_contact_us_button() {
        homePageHeaderPage.headerContactUsButton.click();
        logger.info("Header'daki Contact Us butonuna tıklandı");
    }

    @Then("Verifies that it is Contact Us Page")
    public void verifies_that_it_is_contact_us_page() {
        Assert.assertTrue(homePageHeaderPage.ContactUsPageLetsTalkButton.isDisplayed());
        logger.info("Contact Us sayfasının açıldığı doğrulandı");
    }
    @When("Navigates to the About Us Button")
    public void navigates_to_the_about_us_button() {
        Actions actions= new Actions(driver);
        actions.moveToElement(homePageHeaderPage.headerAboutUsButton).perform();
        logger.info("Header'daki About Us butonunun üzerine gelindi");
    }
    @Then("Clicks on the About Hospitals Button")
    public void clicks_on_the_about_hospitals_button() {
        homePageHeaderPage.AboutUsDropdownAboutHospitalsButton.click();
        logger.info("About Us altındaki About Hospitals butonuna tıklandı");
    }

    @Then("Verifies that it is About Hospitals Page")
    public void verifies_that_it_is_about_hospitals_page() {
        Assert.assertTrue(homePageHeaderPage.AboutHospitalsPageTextLink.isDisplayed());
        logger.info("About Hospitals sayfasının açıldığı doğrulandı");
    }
    @Then("Clicks on the Meet Our Doctors Button")
    public void clicks_on_the_meet_our_doctors_button() {
        homePageHeaderPage.AboutUsDropdownMeetOurDoctorsButton.click();
        logger.info("About Us altındaki Meet Our Doctors butonuna tıklandı");
    }

    @Then("Verifies that it is Meet Our Doctors Page")
    public void verifies_that_it_is_meet_our_doctors_page() {
        Assert.assertTrue(homePageHeaderPage.MeetOurDoctorsPageDoctorTaps.isDisplayed());
        logger.info("Meet Our Doctors sayfasının açıldığı doğrulandı");
    }
    @Then("Clicks on the FAQs Button")
    public void clicks_on_the_fa_qs_button() {
        homePageHeaderPage.AboutUsDropDownFAQsButton.click();
        logger.info("About Us altındaki FAQs butonuna tıklandı");
    }

    @Then("Verifies that it is FAQs Page")
    public void verifies_that_it_is_fa_qs_page() {
        Assert.assertTrue(homePageHeaderPage.FAQsPageClientFaqsTextLink.isDisplayed());
        logger.info("FAQs sayfasının açıldığı doğrulandı");
    }
    @Then("Clicks on the Departments Button")
    public void clicks_on_the_departments_button() {
        homePageHeaderPage.AboutUsDropDownDepartmentsButton.click();
        logger.info("About Us altındaki Departments butonuna tıklandı");
    }

    @Then("Verifies that it is Departments Page")
    public void verifies_that_it_is_departments_page() {
        Assert.assertTrue(homePageHeaderPage.DepartmentsPageDepartmentsTextLink.isDisplayed());
        logger.info("Departments sayfasının açıldığı doğrulandı");
    }
    @Then("Clicks on the Testimonials Button")
    public void clicks_on_the_testimonials_button() {
        homePageHeaderPage.AboutUsDropDownTestimonialsButton.click();
        logger.info("About Us altındaki Testimonials butonuna tıklandı");
    }

    @Then("Verifies that it is Testimonials Page")
    public void verifies_that_it_is_testimonials_page() {
        Assert.assertTrue(homePageHeaderPage.TestimonialsPageUserTestimonialsLink.isDisplayed());
        logger.info("Testimonials sayfasının açıldığı doğrulandı");
    }


}
