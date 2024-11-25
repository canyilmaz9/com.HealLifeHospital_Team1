package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePageGeneralPage;
import utilities.ReusableMethods;

import javax.sound.midi.Soundbank;
import java.security.Key;

public class HomePageGeneralSteps {

    private static final Logger logger = LogManager.getLogger(HomePageGeneralSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    HomePageGeneralPage homePageGeneralPage = new HomePageGeneralPage(driver);
    Actions actions = new Actions(driver);

    //US004_TC_001 StepDefintiions

    @Given("Kullanici Anasayfa adresine gider")
    public void kullaniciAnasayfaAdresineGider() throws InterruptedException {
        String url = ConfigReader.getProperty("url");
        driver.get(url);
        logger.info("Anasayfaya gidildi: " + url);
        Thread.sleep(3000);

    }

    @When("Anasayfa slidebar altinda bulunan Insurance plans yazisinin gorunur oldugunu dogrular,")
    public void anasayfa_slidebar_altinda_bulunan_insurance_plans_yazisinin_gorunur_oldugunu_dogrular() throws InterruptedException {
        String expectedInsurancePlansYazisi = "Insurance Plans";
        String actualIPYazisi = homePageGeneralPage.anaSayfaInsurancePlansYazisi.getText();
        Assert.assertEquals(expectedInsurancePlansYazisi, actualIPYazisi);
        System.out.println(actualIPYazisi);
        Thread.sleep(3000);


    }

    @Then("Pediatric Services yazisinin gorunur oldugunu dogrular,")
    public void pediatric_services_yazisinin_gorunur_oldugunu_dogrular() throws InterruptedException {
        String expectedPediatricServiceYazisi = "Pediatric Services";
        String actualPSYazisi = homePageGeneralPage.pediatricServiceYazisi.getText();
        Assert.assertEquals(expectedPediatricServiceYazisi, actualPSYazisi);
        System.out.println(actualPSYazisi);
        Thread.sleep(3000);
    }

    @Then("Lab Testing boardunun gorunur oldugunu dogrular,")
    public void lab_testing_boardunun_gorunur_oldugunu_dogrular() throws InterruptedException {
        String expectedLabTesting = "Lab Testing";
        String actualLTYazisi = homePageGeneralPage.labTestingYazisi.getText();
        Assert.assertEquals(expectedLabTesting, actualLTYazisi);
        System.out.println(actualLTYazisi);
        Thread.sleep(3000);
    }

    @When("Opening Hours Boardlarinin gorunur oldugunu dogrular")
    public void opening_hours_boardlarinin_gorunur_oldugunu_dogrular() throws InterruptedException {
        String expectedOpeningHours = "Opening Hours";
        String actualOpeningHours = homePageGeneralPage.openingHoursYazisi.getText();
        Assert.assertEquals(expectedOpeningHours, actualOpeningHours);
        System.out.println(actualOpeningHours);
        Thread.sleep(3000);

    }

    //US004_TC_002 StepDefintiions

    @When("Anasayfa slidebar altinda bulunan Insurance plans yazisinda read more butonuna tiklar ve Acilan sayfada insurance plans yazisinin oldugunu dogrular")
    public void anasayfa_slidebar_altinda_bulunan_insurance_plans_yazisinda_read_more_butonuna_tiklar() throws InterruptedException {

        actions.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).perform();
        homePageGeneralPage.insurancePlansReadMoreButonu.click();
        String expectedInsurancePlansKontrolYazisi = "Insurance Plans";
        String actualInsurancePlansKontrolYazisi = homePageGeneralPage.insurancePlansSayfasiKontrolYazisi.getText();
        Assert.assertEquals(expectedInsurancePlansKontrolYazisi, actualInsurancePlansKontrolYazisi);
        System.out.println(actualInsurancePlansKontrolYazisi);
        Thread.sleep(3000);

    }

    @Then("Pediatric Services yazisinda read more butonuna tiklar ve Acilan sayfada our pediatric services yazisinin oldugunu dogrular")
    public void pediatric_services_yazisinda_read_more_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        homePageGeneralPage.pediatricServicesReadMoreButonu.click();
        String expectedPediatricServicesKontrolYazisi = "Our Pediatric Services:";
        String actualPediatrciServicesKontrolYazisi = homePageGeneralPage.pediatricServicesKontrolYazisi.getText();
        Assert.assertEquals(expectedPediatricServicesKontrolYazisi, actualPediatrciServicesKontrolYazisi);
        System.out.println(actualPediatrciServicesKontrolYazisi);


    }

    @Then("Anasayfaya geri doner")
    public void anasayfaya_geri_doner() {
        driver.navigate().back();

    }

    @Then("Lab Testing yazisinda read more butonuna tiklar ve Acilan sayfada Lab Testing Services yazisinin oldugunu dogrular")
    public void lab_testing_yazisinda_read_more_butonuna_tiklar() throws InterruptedException {
        homePageGeneralPage.labTestingReadMoreButonu.click();
        String expectedLabTestingSayfasiYazisi = "Lab Testing Services:";
        String actualLabTestingSayfasiYazisi = homePageGeneralPage.labTestingSayfasiKontrolYazisi.getText();
        Assert.assertEquals(expectedLabTestingSayfasiYazisi, actualLabTestingSayfasiYazisi);
        System.out.println(actualLabTestingSayfasiYazisi);
        Thread.sleep(3000);

    }


    //US_009>TC003 Step Definitions

    @When("Patient clicks the login button")
    public void patient_clicks_the_login_button() {
        homePageGeneralPage.logInButonu.click();

    }

    @When("Patient logins to patient dashboard")
    public void patient_login_to_patient_dashboard() throws InterruptedException {
        homePageGeneralPage.userNameBox.sendKeys("pat79");
        Thread.sleep(1000);
        homePageGeneralPage.passwordBox.sendKeys("w2c4u8");
        Thread.sleep(1000);
        homePageGeneralPage.signInButton.click();
        Thread.sleep(1000);

    }

    @When("Patient verifies the OPD button is enable")
    public void patient_verifies_the_opd_button_is_enable() throws InterruptedException {
        String expectedOPDYazisi = "OPD";
        String actualOPDYazisi = homePageGeneralPage.dashboardaGirisdogrulamaButonu.getText();
        Assert.assertEquals(expectedOPDYazisi, actualOPDYazisi);
        System.out.println(actualOPDYazisi);
        Thread.sleep(1000);

    }

    @When("Patient clicks to OPD button on the left side bar menu")
    public void patient_clicks_to_opd_button_on_the_left_side_bar_menu() {
        homePageGeneralPage.OPDDashBoardMenuSteteskop.click();


    }

    @Then("Patient verifies the OPD page opens")
    public void patient_verifies_the_opd_page_opens() throws InterruptedException {
        String expectedOverviewYazisi = "Overview";
        String actualOverviewYazisi = homePageGeneralPage.OPDDashboardDogrulamaYazisiOverview.getText();
        Assert.assertEquals(expectedOverviewYazisi, actualOverviewYazisi);
        System.out.println(actualOverviewYazisi);
        Thread.sleep(1000);

    }


    //US_009>TC004 Step Definitions

    @Then("Patient verifies Overview button is enable")
    public void patient_verifies_overview_button_is_enable() throws InterruptedException {
        String expectedOverviewYazisi = "Overview";
        String actualOverviewYazisi = homePageGeneralPage.OPDDashboardDogrulamaYazisiOverview.getText();
        Assert.assertEquals(expectedOverviewYazisi, actualOverviewYazisi);
        System.out.println(actualOverviewYazisi);
        Thread.sleep(1000);

    }

    @Then("Patient verifies Visits button is enable and click it")
    public void patient_verifies_visits_button_is_enable_and_click_it() throws InterruptedException {
        String expectedVisitsYazisi = "Visits";
        String actualVisitsYazisi = homePageGeneralPage.OPDVisitsButton.getText();
        Assert.assertEquals(expectedVisitsYazisi, actualVisitsYazisi);
        System.out.println(actualVisitsYazisi);
        homePageGeneralPage.OPDVisitsButton.click();
        Thread.sleep(1000);

    }

    @Then("Patient verifies Lab investigation button is enable and click it")
    public void patient_verifies_lab_investigation_button_is_enable_and_click_it() throws InterruptedException {
        String expectedLabInvestigationYazisi = "Lab Investigation";
        String actualLabInvestigationYazisi = homePageGeneralPage.OPDLabInvestigationButton.getText();
        Assert.assertEquals(expectedLabInvestigationYazisi, actualLabInvestigationYazisi);
        System.out.println(actualLabInvestigationYazisi);
        homePageGeneralPage.OPDLabInvestigationButton.click();
        Thread.sleep(1000);
    }

    @Then("Patient verifies Treatment History button is enable and click it")
    public void patient_verifies_treatment_history_button_is_enable_and_click_it() throws InterruptedException {
        String expectedTreatmentHistoryYazisi = "Treatment History";
        String actualTreatmentHistoryYazisi = homePageGeneralPage.OPDtreatmentHistoryButton.getText();
        Assert.assertEquals(expectedTreatmentHistoryYazisi, actualTreatmentHistoryYazisi);
        System.out.println(actualTreatmentHistoryYazisi);
        homePageGeneralPage.OPDtreatmentHistoryButton.click();
        Thread.sleep(1000);
    }

    @Then("Patient verifies Timeline button is enable and click it")
    public void patient_verifies_timeline_button_is_enable_and_click_it() throws InterruptedException {
        String expectedTimelineButton = "Timeline";
        String actualTimelineButton = homePageGeneralPage.OPDtimelineButton.getText();
        Assert.assertEquals(expectedTimelineButton, actualTimelineButton);
        System.out.println(actualTimelineButton);
        homePageGeneralPage.OPDtimelineButton.click();
        Thread.sleep(1000);

    }

    //US_009>TC005 Step Definitions

    @Then("Patient verifies her name on the header")
    public void patient_verifies_her_name_on_the_header() {
        String expectedOPDHeaderName = "RANA NUR ULKER (79)";
        String actualOPDHeaderName = homePageGeneralPage.OPDHeaderHastaAdi.getText();
        Assert.assertEquals(expectedOPDHeaderName, actualOPDHeaderName);
        System.out.println("Hasta adinin dogru oldugu dogrulandi.");

    }

    @Then("Patient verifes Consultant doctors found")
    public void patient_verifes_consultant_doctors_found() {
        String expectedDoctorsName = "No Record Found";
        String actualDoctorsname = homePageGeneralPage.doctorsName.getText();
        Assert.assertNotEquals(expectedDoctorsName, actualDoctorsname);
        System.out.println("Doktor isimlerinin listelendigi goruldu.");
    }

    @Then("Patient verifies that can be seen details about appointment under the visit details section")
    public void patient_verifies_that_can_be_seen_details_about_appointment_under_the_visit_details_section() {
        String expectedVisitDetails = "No Record Found";
        String actualVisitDetails = homePageGeneralPage.visitDetails.getText();
        Assert.assertNotEquals(expectedVisitDetails, actualVisitDetails);
        System.out.println("Hasta appointment detaylarini goruntuler");

    }

    @Then("Patient verifies that can be seen details about lab investigation summary under the lab investigation section")
    public void patient_verifies_that_can_be_seen_details_about_lab_investigetion_summary_under_the_lab_investigation_section() {
        String expectedLabInvestigation = "OPD No";
        String actualLabInvestigation = homePageGeneralPage.labInvestigationDetails.getText();
        Assert.assertEquals(expectedLabInvestigation, actualLabInvestigation);
        System.out.println("Lab investigation details gorulur");

    }

    @Then("Patient verifies that can be seen details about treatments under the treatments history section")
    public void patient_verifies_that_can_be_seen_details_about_treatments_under_the_treatments_history_section() {
        String expectedTreatmentsDetails = "OPD No";
        String actualTreatmentDetails = homePageGeneralPage.treatmentHistoryDetails.getText();
        Assert.assertEquals(expectedTreatmentsDetails, actualTreatmentDetails);
        System.out.println("Hasta ilac gecmisine bakar");


    }

    @Then("Patient verifies that can be seen details about timeline records under the Timeline section")
    public void patient_verifies_that_can_be_seen_details_about_timeline_records_under_the_timeline_section() {
        actions.scrollToElement(homePageGeneralPage.TimelineDetails);
        String expectedTimeLine = "Timeline deneme";
        String actualTimeLine = homePageGeneralPage.TimelineDetails.getText();
        Assert.assertEquals(expectedTimeLine, actualTimeLine);
        System.out.println("Timeline akisi gozukur");
    }

    //US_009>TC006 Step Definitions

    @Then("Patient verifies OPD No header")
    public void patient_verifies_opd_no_header() {
        String expectedVisitsOPDNo = "OPD No";
        String actualVisitsOPDNo = homePageGeneralPage.visitsOPDNo.getText();
        Assert.assertEquals(expectedVisitsOPDNo, actualVisitsOPDNo);
        System.out.println("OPD No goruldu");
    }

    @Then("Patient verifies Case IDyi on the header")
    public void patient_verifies_case_i_dyi_on_the_header() {
        String expectedCaseId = "Case ID / Patient ID";
        String actualCaseId = homePageGeneralPage.caseID.getText();
        Assert.assertEquals(expectedCaseId, actualCaseId);
        System.out.println("Case ID goruldu");

    }

    @Then("Patient verifies Appointment date on the header")
    public void patient_verifies_appointment_date_on_the_header() {
        String expectedAppointment = "Appointment Date";
        String actualAppointment = homePageGeneralPage.appointmentDate.getText();
        Assert.assertEquals(expectedAppointment, actualAppointment);
        System.out.println("Appointment date goruldu");
    }

    @Then("Patient verifies consultant on the header")
    public void patient_verifies_consultant_on_the_header() {
        String expectedConsultant = "Consultant";
        String actualConsultant = homePageGeneralPage.consultant.getText();
        Assert.assertEquals(expectedConsultant, actualConsultant);
        System.out.println("Consultant yazisi goruldu");

    }

    @Then("Patient verifies Reference on the header")
    public void patient_verifies_reference_on_the_header() {
        String expectedReference = "Reference";
        String actualReference = homePageGeneralPage.reference.getText();
        Assert.assertEquals(expectedReference, actualReference);
        System.out.println("Reference yazisi goruldu");

    }

    @Then("Patient verifies Symptoms on the header")
    public void patient_verifies_symptoms_on_the_header() {
        String expectedSymptoms = "Symptoms";
        String actualSymptoms = homePageGeneralPage.sympthoms.getText();
        Assert.assertEquals(expectedSymptoms, actualSymptoms);
        System.out.println("Syptoms yazisi goruldu");

    }

    @Then("Patient verifies Action on the header")
    public void patient_verifies_action_on_the_header() {
        String expectedAction = "Action";
        String actualAction = homePageGeneralPage.action.getText();
        Assert.assertEquals(actualAction, expectedAction);
        System.out.println("Action yazisi goruldu");

    }

    @Then("Patient can search appointments on the page")
    public void patient_can_search_appointments_on_the_page() {
        homePageGeneralPage.visitsSearchBox.click();
        homePageGeneralPage.visitsSearchBox.sendKeys("OPD");
        System.out.println("Arama yapildi");
    }

    //US_009>TC007 Step Definitions
    @Then("Patients' visit's details and medication details are enable under the Action header")
    public void patients_visit_s_details_and_medication_details_are_enable_under_the_action_header() {
        String expectedActionDetails = "Medication";
        String actualActionDetails = homePageGeneralPage.underTheAction.getText();
        Assert.assertEquals(expectedActionDetails, actualActionDetails);
        System.out.println("Medication yazisi goruldu");

    }


    //US_009>TC008 Step Definitions

    @Then("Patient verifies Test Name is enable on the header")
    public void patient_verifies_test_name_is_enable_on_the_header() {
        String expectedlabInvestigationTestName = "Test Name";
        String actualLabInvestigationTestName = homePageGeneralPage.labInvestigationTestName.getText();
        Assert.assertEquals(expectedlabInvestigationTestName, actualLabInvestigationTestName);
        System.out.println("Test Name goruldu");
    }


    @Then("Patient verifies Case ID is enable on the header")
    public void patient_verifies_case_id_is_enable_on_the_header() {
        String expectedCaseID = "Case ID / Patient ID";
        String actualCaseID = homePageGeneralPage.labInvestigationCaseID.getText();
        Assert.assertEquals(expectedCaseID, actualCaseID);
        System.out.println("Case ID goruldu");

    }


    @Then("Patient verifies Lab is enable on the header")
    public void patient_verifies_lab_is_enable_on_the_header() {
        String expectedLab = "Lab";
        String actualLab = homePageGeneralPage.labInvestigationLab.getText();
        Assert.assertEquals(expectedLab, actualLab);
        System.out.println("Lab goruldu");
    }

    @Then("Patient verifies Sample Collected is enable on the header")
    public void patient_verifies_sample_collected_is_enable_on_the_header() {
        String expectedSampleCollected = "Sample Collected";
        String actualSampleCollected = homePageGeneralPage.labInvestigationSampleCollected.getText();
        Assert.assertEquals(expectedSampleCollected, actualSampleCollected);
        System.out.println("Sample collected goruldu");
    }

    @Then("Patient verifies Expected Date is enable on the header")
    public void patient_verifies_expected_date_is_enable_on_the_header() {
        String expectedExpectedDate = "Expected Date";
        String actualExpectedDate = homePageGeneralPage.labInvestigationExpectedDate.getText();
        Assert.assertEquals(expectedExpectedDate, actualExpectedDate);
        System.out.println("Expected Date");
    }

    @Then("Patient verifies Approved By is enable on the header")
    public void patient_verifies_approved_by_is_enable_on_the_header() {
        String expectedApproved = "Approved By";
        String actualApproved = homePageGeneralPage.labInvestigationApprovedBy.getText();
        Assert.assertEquals(expectedApproved, actualApproved);
        System.out.println("Approved By goruldu");
    }

    @Then("Patient verifies Action is enable on the header")
    public void patient_verifies_action_is_enable_on_the_header() {
        String expectedAction = "Action";
        String actualAction = homePageGeneralPage.labInvestigationAction.getText();
        Assert.assertEquals(expectedAction, actualAction);
        System.out.println("Action goruldu");

    }

    @Then("Patient verifies search box is clickable and searchable")
    public void patient_verifies_search_box_is_clickable_and_searchable() throws InterruptedException {
        Thread.sleep(2000);
        homePageGeneralPage.searcBoxinLabinvestigation.click();
        homePageGeneralPage.searcBoxinLabinvestigation.sendKeys("Rana Lab");
        System.out.println("Search Box is clickable");


    }


    //US_009>TC009 Step Definitions

    @Then("Patients' Labs details enable under the Action header")
    public void patients_labs_details_enable_under_the_action_header() {
        String expectedlabInvestigationActionTable = "Action";
        String actuallabInvestigationActionTable = homePageGeneralPage.labinvestigationTable.getText();
        Assert.assertEquals(expectedlabInvestigationActionTable, actuallabInvestigationActionTable);
        System.out.println("Tableda yazi liste kontrolu yapildi");

    }

    //US_009>TC010 Step Definitions
    @Then("Patient verifies OPD No is enable under the Treatment History page")
    public void patient_verifies_opd_no_is_enable_under_the_treatment_history_page() {
        String expectedTHOPD = "OPD No";
        String actualTHOPD = homePageGeneralPage.treatmentHistoryOPDNo.getText();
        Assert.assertEquals(expectedTHOPD, actualTHOPD);
        System.out.println("OPD No yazisi goruldu");


    }

    @Then("Patient verifies Case ID is enable under the Treatment History page")
    public void patient_verifies_case_id_is_enable_under_the_treatment_history_page() {
        String expectedTHCaseID = "Case ID / Patient ID";
        String actualTHCaseID = homePageGeneralPage.treatmentHistoryCaseId.getText();
        Assert.assertEquals(expectedTHCaseID, actualTHCaseID);
        System.out.println("Case ID basligi goruldu");
    }

    @Then("Patient verifies Appointment Date is enable under the Treatment History page")
    public void patient_verifies_appointment_date_is_enable_under_the_treatment_history_page() {
        String expectedTHAppointmentDate = "Appointment Date";
        String actualTHAppointmentDate = homePageGeneralPage.treatmentHistoryAppointmentDate.getText();
        Assert.assertEquals(expectedTHAppointmentDate, actualTHAppointmentDate);
        System.out.println("Appointment basligi goruldu");

    }

    @Then("Patient verifies Syptomps is enable under the Treatment History page")
    public void patient_verifies_syptomps_is_enable_under_the_treatment_history_page() {
        String expectedTHSympthoms = "Symptoms";
        String actualTHSymptoms = homePageGeneralPage.treatmentHistorySymptoms.getText();
        Assert.assertEquals(expectedTHSympthoms, actualTHSymptoms);
        System.out.println("Symptoms basligi goruldu");

    }

    @Then("Patient verifies Consultant is enable under the Treatment History page")
    public void patient_verifies_consultant_is_enable_under_the_treatment_history_page() {
        String expectedTHConsultant = "Consultant";
        String actualTHConsultant = homePageGeneralPage.treatmentHistoryConsultant.getText();
        System.out.println("Consultant basligi goruldu");


    }

    @Then("Patient verifies Action is enable under the Treatment History page")
    public void patient_verifies_action_is_enable_under_the_treatment_history_page() {
        String expectedTHAction = "Action";
        String actualTHAction = homePageGeneralPage.treatmentHistoryAction.getText();
        Assert.assertEquals(expectedTHAction, actualTHAction);
        System.out.println("Action basligi goruldu");

    }

    @Then("Patient verifies text box is is clickable and searchable")
    public void patient_verifies_text_box_is_is_clickable_and_searchable() throws InterruptedException {

        homePageGeneralPage.treatmentHistorySearch.click();
        homePageGeneralPage.treatmentHistorySearch.sendKeys("Syrup");
        homePageGeneralPage.treatmentHistorySearch.sendKeys(Keys.ENTER);
        System.out.println("ilaclar icin arama yapildi");
        Thread.sleep(2000);
        String expectedTHDataTable = "Syrup";
        String actualTHDataTable = homePageGeneralPage.THDataTable.getText();
        Assert.assertEquals(expectedTHDataTable, actualTHDataTable);


    }

    //US_009>TC011 Step Definitions
    @Then("It can be seen that a line and enable to see timeline information")
    public void it_can_be_seen_that_a_line_and_enable_to_see_timeline_information() {
        Assert.assertTrue(homePageGeneralPage.timeLineTimeLine.isEnabled());

    }


    //US_030>TC012 Step Definitions
    @Given("User reach gallery section")
    public void user_reach_gallery_section() {

    }

    @Then("User clicks gallery button")
    public void user_clicks_gallery_button() {

    }

    @Then("The link redirected gallery page")
    public void the_link_redirected_gallery_page() {

    }

    //US_030>TC012


    @Then("verification of the Health & Wellness page is clickable and forwarding correct link")
    public void verification_of_the_health_wellness_page_is_clickable_and_forwarding_correct_link() {

    }
    @Then("verification of the Hospitals and Directions page is clickable and forwarding correct link")
    public void verification_of_the_hospitals_and_directions_page_is_clickable_and_forwarding_correct_link() {

    }
    @Then("verification of the Specialities page is clickable and forwarding correct link")
    public void verification_of_the_specialities_page_is_clickable_and_forwarding_correct_link() {

    }
    @Then("verification of the Recreation Centre page is clickable and forwarding correct link")
    public void verification_of_the_recreation_centre_page_is_clickable_and_forwarding_correct_link() {

    }
    @Then("verification of the Your Health page is clickable and forwarding correct link")
    public void verification_of_the_your_health_page_is_clickable_and_forwarding_correct_link() {

    }
    @Then("verification of the Surgery page is clickable and forwarding correct link")
    public void verification_of_the_surgery_page_is_clickable_and_forwarding_correct_link() {

    }


}
