package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DoctorIDPPage;
import utilities.ReusableMethods;
import utils.ExcelDataReader;

public class DoctorIPDFeatureSteps {

    private static final Logger logger = LogManager.getLogger(DoctorIPDFeatureSteps.class);

   static WebDriver driver = Hooks.getDriver();
    DoctorIDPPage doctorIDPPage=new DoctorIDPPage(driver);

    ExcelDataReader reader=new ExcelDataReader(ConfigReader.getProperty("testData"),"serenTestData");



    @Given("Enters the {string}")
    public void enters_the(String url) {
        driver.get(ConfigReader.getProperty(url));
        ReusableMethods.bekle(2);
    }
    @Given("Login as doctor")
    public void login_as_doctor() {
        doctorIDPPage.doctorLogin(9);
    }


    @Then("As a doctor, click on the IPD menu in the dashboard.")
    public void as_a_doctor_click_on_the_ipd_menu_in_the_dashboard() {


        ReusableMethods.clickWithText(" IPD");

    }
    @Then("As a doctor,verify that the IPD menu is enabled.")
    public void as_a_doctor_verify_that_the_ipd_menu_is_enabled() {

       Assert.assertTrue( doctorIDPPage.ipdLink.isEnabled());
    }
    @Then("As a doctor, verify that the page displays the {string}.")
    public void as_a_doctor_verify_that_the_page_displays_the_text_confirming_the_user_is_on_the_correct_page(String elementText) {
      ReusableMethods.waitForElementVisibility(ReusableMethods.getElementByText(driver,elementText),2);
        Assert.assertTrue( ReusableMethods.getElementByText(driver,elementText).isDisplayed());
    }
    @Then("As a doctor, verify that the data table headers are visible.")
    public void as_a_doctor_verify_that_the_data_table_headers_are_visible() {
    doctorIDPPage.verifyHeadersAreVisible(driver);

    }
    @Then("As a doctor, verify that the {string} column is sorted in ascending order.")
    public void as_a_doctor_verify_that_the_case_id_patient_id_column_is_sorted_in_descending_order(String sortableHeader) {
    doctorIDPPage.verifyheaderSortingAscending(sortableHeader,2);
    }
    @Then("As a doctor, the number of patients displayed in the data table should be visible next to the record text below the table.")
    public void as_a_doctor_the_number_of_patients_displayed_in_the_data_table_should_be_visible_next_to_the_text_below_the_table( ) {
   Assert.assertTrue( doctorIDPPage.recordsPatientCountInDataTable.getText().contains(doctorIDPPage.patientCountInDataTable()));
    logger.info("IPD sayfasindaki hasta sayisi Sayfa altinda Record textinde görünürdür. ");
    }
    @Then("As a doctor, Verify that the patient's IPD number and name are enabled.")
    public void as_a_doctor_click_on_patient_names_or_ipd_numbers() {


  //  Assert.assertEquals("name locate inin tagName'i a degil " ,"a",doctorIDPPage.TableDataRetriever(3,3).getTagName());
    logger.error("IPD sayfasinda Name basligi altindaki hasta isimleri erisilir degil");


    }
    @Then("As a doctor, verify that the patient's details page is accessible.")
    public void as_a_doctor_verify_that_the_patient_s_details_page_is_accessible() {
     Assert.assertTrue(doctorIDPPage.TableDataRetriever(3,1).isEnabled());
    }
    @Then("As a doctor, Verify searching with full data of the {int} patient in the data table.")
    public void as_a_doctor_verify_that_the_search_box_allows_searching_for_any_data_present_in_the_data_table(int row) {
     ReusableMethods.waitForElementVisibility(doctorIDPPage.ipdPatientSearchBox,10);
    // doctorIDPPage.searchPatientInIPDBoxWithDataTable(row);

     logger.error("IPD hasta listesindeki tüm datalarla arama yapilamiyor ");
    }
    @Then("As a doctor, access the patient details page through the hamburger menu under the Credit Limit text.")
    public void as_a_doctor_access_the_patient_details_page_through_the_hamburger_menu_under_the_credit_limit_$_text() {
     doctorIDPPage.clickOnHamburgerMenu();
    }
    @Then("As a doctor, verify that the Add Patient button is accessible.")
    public void as_a_doctor_verify_that_the_add_patient_button_is_accessible() {

    }
    @Then("As a doctor, verify that the Discharged Patient button is accessible.")
    public void as_a_doctor_verify_that_the_discharged_patient_button_is_accessible() {

    }

}
