package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePageGeneralPage;
import utilities.ReusableMethods;

public class HomePageGeneralSteps {

    private static final Logger logger = LogManager.getLogger(HomePageGeneralSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    HomePageGeneralPage homePageGeneralPage =new HomePageGeneralPage(driver);
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
        String expectedInsurancePlansYazisi="Insurance Plans";
        String actualIPYazisi=homePageGeneralPage.anaSayfaInsurancePlansYazisi.getText();
        Assert.assertEquals(actualIPYazisi,expectedInsurancePlansYazisi);
        System.out.println(actualIPYazisi);
        Thread.sleep(3000);


    }
    @Then("Pediatric Services yazisinin gorunur oldugunu dogrular,")
    public void pediatric_services_yazisinin_gorunur_oldugunu_dogrular() throws InterruptedException {
        String expectedPediatricServiceYazisi="Pediatric Services";
        String actualPSYazisi=homePageGeneralPage.pediatricServiceYazisi.getText();
        Assert.assertEquals(actualPSYazisi,expectedPediatricServiceYazisi);
        System.out.println(actualPSYazisi);
        Thread.sleep(3000);
    }
    @Then("Lab Testing boardunun gorunur oldugunu dogrular,")
    public void lab_testing_boardunun_gorunur_oldugunu_dogrular() throws InterruptedException {
        String expectedLabTesting="Lab Testing";
        String actualLTYazisi=homePageGeneralPage.labTestingYazisi.getText();
        Assert.assertEquals(actualLTYazisi,expectedLabTesting);
        System.out.println(actualLTYazisi);
        Thread.sleep(3000);
    }
    @When("Opening Hours Boardlarinin gorunur oldugunu dogrular")
    public void opening_hours_boardlarinin_gorunur_oldugunu_dogrular() throws InterruptedException {
        String expectedOpeningHours="Opening Hours";
        String actualOpeningHours=homePageGeneralPage.openingHoursYazisi.getText();
        Assert.assertEquals(actualOpeningHours,expectedOpeningHours);
        System.out.println(actualOpeningHours);
        Thread.sleep(3000);

    }

    //US004_TC_002 StepDefintiions

    @When("Anasayfa slidebar altinda bulunan Insurance plans yazisinda read more butonuna tiklar ve Acilan sayfada insurance plans yazisinin oldugunu dogrular")
    public void anasayfa_slidebar_altinda_bulunan_insurance_plans_yazisinda_read_more_butonuna_tiklar() throws InterruptedException {

        actions.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).perform();
        homePageGeneralPage.insurancePlansReadMoreButonu.click();
        String expectedInsurancePlansKontrolYazisi="Insurance Plans";
        String actualInsurancePlansKontrolYazisi=homePageGeneralPage.insurancePlansSayfasiKontrolYazisi.getText();
        Assert.assertEquals(actualInsurancePlansKontrolYazisi,expectedInsurancePlansKontrolYazisi);
        System.out.println(actualInsurancePlansKontrolYazisi);
        Thread.sleep(3000);

    }
    @Then("Pediatric Services yazisinda read more butonuna tiklar ve Acilan sayfada our pediatric services yazisinin oldugunu dogrular")
    public void pediatric_services_yazisinda_read_more_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        homePageGeneralPage.pediatricServicesReadMoreButonu.click();
        String expectedPediatricServicesKontrolYazisi="Our Pediatric Services:";
        String actualPediatrciServicesKontrolYazisi=homePageGeneralPage.pediatricServicesKontrolYazisi.getText();
        Assert.assertEquals(actualPediatrciServicesKontrolYazisi,expectedPediatricServicesKontrolYazisi);
        System.out.println(actualPediatrciServicesKontrolYazisi);


    }
    @Then("Anasayfaya geri doner")
    public void anasayfaya_geri_doner() {
        driver.navigate().back();

    }

    @Then("Lab Testing yazisinda read more butonuna tiklar ve Acilan sayfada Lab Testing Services yazisinin oldugunu dogrular")
    public void lab_testing_yazisinda_read_more_butonuna_tiklar() throws InterruptedException {
        homePageGeneralPage.labTestingReadMoreButonu.click();
        String expectedLabTestingSayfasiYazisi="Lab Testing Services:";
        String actualLabTestingSayfasiYazisi=homePageGeneralPage.labTestingSayfasiKontrolYazisi.getText();
        Assert.assertEquals(actualLabTestingSayfasiYazisi,expectedLabTestingSayfasiYazisi);
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
        String expectedOPDYazisi="OPD";
        String actualOPDYazisi=homePageGeneralPage.dashboardaGirisdogrulamaButonu.getText();
        Assert.assertEquals(actualOPDYazisi,expectedOPDYazisi);
        System.out.println(actualOPDYazisi);
        Thread.sleep(1000);

    }
    @When("Patient clicks to OPD button on the left side bar menu")
    public void patient_clicks_to_opd_button_on_the_left_side_bar_menu() {
        homePageGeneralPage.OPDDashBoardMenuSteteskop.click();


    }
    @Then("Patient verifies the OPD page opens")
    public void patient_verifies_the_opd_page_opens() throws InterruptedException {
        String expectedOverviewYazisi="Overview";
        String actualOverviewYazisi= homePageGeneralPage.OPDDashboardDogrulamaYazisiOverview.getText();
        Assert.assertEquals(actualOverviewYazisi,expectedOverviewYazisi);
        System.out.println(actualOverviewYazisi);
        Thread.sleep(1000);

    }


    //US_009>TC004 Step Definitions

    @Then("Patient verifies Overview button is enable")
    public void patient_verifies_overview_button_is_enable() throws InterruptedException {
        String expectedOverviewYazisi="Overview";
        String actualOverviewYazisi= homePageGeneralPage.OPDDashboardDogrulamaYazisiOverview.getText();
        Assert.assertEquals(actualOverviewYazisi,expectedOverviewYazisi);
        System.out.println(actualOverviewYazisi);
        Thread.sleep(1000);

    }
    @Then("Patient verifies Visits button is enable and click it")
    public void patient_verifies_visits_button_is_enable_and_click_it() throws InterruptedException {
        String expectedVisitsYazisi="Visits";
        String actualVisitsYazisi=homePageGeneralPage.OPDVisitsButton.getText();
        Assert.assertEquals(actualVisitsYazisi,expectedVisitsYazisi);
        System.out.println(actualVisitsYazisi);
        homePageGeneralPage.OPDVisitsButton.click();
        Thread.sleep(1000);

    }
    @Then("Patient verifies Lab investigation button is enable and click it")
    public void patient_verifies_lab_investigation_button_is_enable_and_click_it() throws InterruptedException {
        String expectedLabInvestigationYazisi="Lab Investigation";
        String actualLabInvestigationYazisi=homePageGeneralPage.OPDLabInvestigationButton.getText();
        Assert.assertEquals(actualLabInvestigationYazisi,expectedLabInvestigationYazisi);
        System.out.println(actualLabInvestigationYazisi);
        homePageGeneralPage.OPDLabInvestigationButton.click();
        Thread.sleep(1000);
    }

    @Then("Patient verifies Treatment History button is enable and click it")
    public void patient_verifies_treatment_history_button_is_enable_and_click_it() throws InterruptedException {
        String expectedTreatmentHistoryYazisi="Treatment History";
        String actualTreatmentHistoryYazisi=homePageGeneralPage.OPDtreatmentHistoryButton.getText();
        Assert.assertEquals(actualTreatmentHistoryYazisi,expectedTreatmentHistoryYazisi);
        System.out.println(actualTreatmentHistoryYazisi);
        homePageGeneralPage.OPDtreatmentHistoryButton.click();
        Thread.sleep(1000);
    }

    @Then("Patient verifies Timeline button is enable and click it")
    public void patient_verifies_timeline_button_is_enable_and_click_it() throws InterruptedException {
        String expectedTimelineButton="Timeline";
        String actualTimelineButton=homePageGeneralPage.OPDtimelineButton.getText();
        Assert.assertEquals(actualTimelineButton,expectedTimelineButton);
        System.out.println(actualTimelineButton);
        homePageGeneralPage.OPDtimelineButton.click();
        Thread.sleep(1000);

    }

    //US_009>TC005 Step Definitions

    @Then("Patient verifies her name on the header")
    public void patient_verifies_her_name_on_the_header() {

    }
    @Then("Patient verifes Consultant doctors found")
    public void patient_verifes_consultant_doctors_found() {

    }
    @Then("Patient verifies that can be seen details about appointment under the visit details section")
    public void patient_verifies_that_can_be_seen_details_about_appointment_under_the_visit_details_section() {

    }
    @Then("Patient verifies that can be seen details about lab investigetion summary under the lab investigation section")
    public void patient_verifies_that_can_be_seen_details_about_lab_investigetion_summary_under_the_lab_investigation_section() {

    }
    @Then("Patient verifies that can be seen details about treatments under the treatments history section")
    public void patient_verifies_that_can_be_seen_details_about_treatments_under_the_treatments_history_section() {

    }
    @Then("Patient verifies that can be seen details about timeline records under the Timeline section")
    public void patient_verifies_that_can_be_seen_details_about_timeline_records_under_the_timeline_section() {

    }

}
