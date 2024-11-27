package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import config.ConfigReader;

import utilities.ReusableMethods;

import java.util.List;

public class HomeSteps {

    private static final Logger logger = LogManager.getLogger(HomeSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
   // HomePage homePage = new HomePage(driver);
    HomePage homePage = new HomePage(driver);

   @Given("Kullanici Anasayfa adresine gider")
   public void kullaniciAnasayfaAdresineGider() {
       String url = ConfigReader.getProperty("url");
       driver.get(url);
       logger.info("Anasayfaya gidildi: " + url);
   }

    @When("Anasayfa slidebar altinda bulunan Insurance plans, Pediatric Services, Lab Testing, Opening Hours Boardlarinin gorunur oldugunu dogrular")
    public void anasayfa_slidebar_altinda_bulunan_insurance_plans_pediatric_services_lab_testing_opening_hours_boardlarinin_gorunur_oldugunu_dogrular() {

        String expectedInsurancePlansYazisi="Insurance Plans";
        String actualIPYazisi=homePage.anaSayfaInsurancePlansYazisi.getText();

        Assert.assertEquals(actualIPYazisi,expectedInsurancePlansYazisi);

    }


    @Given("kullanici url adresine gider")
    public void kullanici_url_adresine_gider() {

        String url = ConfigReader.getProperty("url");
        driver.get(url);
        logger.info("Anasayfaya gidildi: " + url);

    }
    @Then("kullanici About Us butonuna tiklar")
    public void kullanici_about_us_butonuna_tiklar() {

        homePage.headerAboutUsButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("kullanici About Hospital  basligini gorur")
    public void kullanici_about_hospital_basligini_gorur() {


        Assertions.assertTrue(homePage.homePageaboutUsAboutHospitals.isDisplayed());
    }
    @When("kullanici Meet Our Doctors  basligini gorur")
    public void kullanici_meet_our_doctors_basligini_gorur() {


        Assertions.assertTrue(homePage.homePageAboutUsMeetOurDoctors.isDisplayed());
    }
    @When("kullanici FAQ's   basligini gorur")
    public void kullanici_faq_s_basligini_gorur() {


        Assertions.assertTrue(homePage.homePageAboutUsFAQ.isDisplayed());
    }
    @Then("kullanici Departments  basligini gorur")
    public void kullanici_departments_basligini_gorur() {


        Assertions.assertTrue(homePage.homePageAboutUsDepartments.isDisplayed());
    }
    @Then("kullanici Testimonials  basligini gorur")
    public void kullanici_testimonials_basligini_gorur() {


        Assertions.assertTrue(homePage.homePageAboutUsTestimonials.isDisplayed());
    }
    @Then("kullanici about hospital yazisina tiklar ve sayfaya ulasir.")
    public void kullanici_about_hospital_yazisina_tiklar_ve_sayfaya_ulasir() {

      homePage.homePageaboutUsAboutHospitals.click();

      Assertions.assertTrue(homePage.homePageAboutUsAboutHospitalsSomeWordsAboutUs.isDisplayed());
    }
    @Then("kullanici sayfada some words about us ve our mission basligini gordugunu dogrular")
    public void kullanici_sayfada_some_words_about_us_ve_our_mission_basligini_gordugunu_dogrular() {


        Assertions.assertTrue(homePage.homePageAboutUsAboutHospitalsSomeWordsAboutUs.isDisplayed());
        Assertions.assertTrue(homePage.homePageAboutUsAboutHospitalOurMission.isDisplayed());

    }
    @Then("kullanici sayfada openin hours bilgilerini gordugunu dogrular")
    public void kullanici_sayfada_openin_hours_bilgilerini_gordugunu_dogrular() {


        Assertions.assertTrue(homePage.homePageAboutUsAboutHospitalOpeninHours.isDisplayed());
    }
    @When("kullanici sayfanin our specialist kisminda hastane doktorlarin resimlerini isimlerini ve title larını gorur")
    public void kullanici_sayfanin_our_specialist_kisminda_hastane_doktorlarin_resimlerini_isimlerini_ve_title_larını_gorur() {


    }

    @Given("kullanici url gelir")
    public void kullanici_url_gelir() {


        String url = ConfigReader.getProperty("url");
        driver.get(url);
        logger.info("Anasayfaya gidildi: " + url);

    }
    @Then("kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular")
    public void kullanici_about_us_menusunun_uzerine_gelerek_acilan_pencerede_about_hospitals_meet_our_doctors_faq_s_departments_testimonials_sayfalarinin_oldugunu_dogrular() {


        homePage.headerAboutUsButton.click();
        Assertions.assertTrue(homePage.homePageaboutUsAboutHospitals.isDisplayed());
        Assertions.assertTrue(homePage.homePageAboutUsMeetOurDoctors.isDisplayed());
        Assertions.assertTrue(homePage.homePageAboutUsFAQ.isDisplayed());
        Assertions.assertTrue(homePage.homePageAboutUsDepartments.isDisplayed());
        Assertions.assertTrue(homePage.homePageAboutUsTestimonials.isDisplayed());

   }


    @Then("kullanici meet our doctors yazisina tiklyarak sayfaya ulasir")
    public void kullaniciMeetOurDoctorsYazisinaTiklyarakSayfayaUlasir() {

       homePage.homePageAboutUsMeetOurDoctors.click();
    }


    @Then("kullanici  general practitioner yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur")
    public void kullaniciGeneralPractitionerYazisinaTiklayarakBuBolumdeCalisanDoktorlariVeBilgileriniGorur() {

      homePage.HomePageAboutUsMeetOurDoctorsGeneralPractitioner.click();
      ReusableMethods.bekle(1);
      Assertions.assertTrue(homePage.MeetourDoctorsgeneralpractitionerdoctorresmi.isDisplayed());
      Assertions.assertTrue(homePage.MeetourDoctordoktorismi.isDisplayed());
      Assertions.assertTrue(homePage.MeetOurdoctorsdoctorunvan.isDisplayed());
    }

    @Then("kullanici ophthalmologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur")
    public void kullaniciOphthalmologistYazisinaTiklayarakBuBolumdeCalisanDoktorlariVeBilgileriniGorur() {

       homePage.MeetourdoctorsOphthalmologist.click();
        ReusableMethods.bekle(1);
       Assertions.assertTrue(homePage.MeetOurdoctorsophthalmologistdoktorresmi.isDisplayed());
       Assertions.assertTrue(homePage.MeetOurdoctorsophthalmologistdoktorismi.isDisplayed());
       Assertions.assertTrue(homePage.Meetourdoctorsophthalmologistdoctorunvan.isDisplayed());

    }

    @Then("kullanici paediatrician yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur")
    public void kullaniciPaediatricianYazisinaTiklayarakBuBolumdeCalisanDoktorlariVeBilgileriniGorur() {

       homePage.MeetourDoctorspaediatrician.click();
        ReusableMethods.bekle(1);
       Assertions.assertTrue(homePage.Meetourdoctorspaediatriciandoctorresmi.isDisplayed());
       Assertions.assertTrue(homePage.Meetourdoctorspaediatriciandoctorismi.isDisplayed());
       Assertions.assertTrue(homePage.Meetourdoctorspaediatriciandoctorunvan.isDisplayed());
    }

    @When("kullanici cardiologist yazisina tiklayarak bu bolumde calısan doktorlari ve bilgilerini gorur")
    public void kullaniciCardiologistYazisinaTiklayarakBuBolumdeCalısanDoktorlariVeBilgileriniGorur() {
       homePage.MeetourdoctorsCardiologist.click();
        ReusableMethods.bekle(2);
       Assertions.assertTrue(homePage.MeetourdoctorsCardiologistdoctorsresmi.isDisplayed());
       Assertions.assertTrue(homePage.MeetourdoctorsCardiologistdoctorismi.isDisplayed());
       Assertions.assertTrue(homePage.MeetourdoctorsCardiologistdoctorunvan.isDisplayed());
    }

    @When("kullanici gynaecologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur")
    public void kullaniciGynaecologistYazisinaTiklayarakBuBolumdeCalisanDoktorlariVeBilgileriniGorur() {

       homePage.Meetourdoctorsgynaecologist.click();
        ReusableMethods.bekle(1);
       Assertions.assertTrue(homePage.Meetourdoctorsgynaevologistdoctorresmi.isDisplayed());
       Assertions.assertTrue(homePage.Meetourdoctorsgynaevologistdoctorismi.isDisplayed());
       Assertions.assertTrue(homePage.Meetourdoctorsgynaevologistdoctorunvan.isDisplayed());
    }

    @And("kullanici neurologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur")
    public void kullaniciNeurologistYazisinaTiklayarakBuBolumdeCalisanDoktorlariVeBilgileriniGorur() {

       homePage.MeetourdoctorsNeurologist.click();
        ReusableMethods.bekle(1);
       Assertions.assertTrue(homePage.MeetourdoctorsNeurologistdoctorresmi.isDisplayed());
       Assertions.assertTrue(homePage.MeetourdoctorsNeurologistdoctorismi.isDisplayed());
       Assertions.assertTrue(homePage.MeetourdoctorsNeurologistdoctorunvan.isDisplayed());
    }

    @Then("kullanici FAQ yazisina tiklayarak sayfaya ulasir")
    public void kullanici_faq_yazisina_tiklayarak_sayfaya_ulasir() {
       homePage.homePageAboutUsFAQ.click();

    }
    @When("kullanici bu sayfada what our clients say ve what our doctor say basliklarini  gorur")
    public void kullanici_bu_sayfada_what_our_clients_say_ve_what_our_doctor_say_basliklarini_gorur() {
    ReusableMethods.bekle(1);
    Assertions.assertTrue(homePage.AboutUsFAQWhatourclientssay.isDisplayed());
    Assertions.assertTrue(homePage.AboutUsFAQWhatourdoctorsay.isDisplayed());

    }
    @When("kullanici sayfadaki sorulardan herhangi birini tikladiginda cevabini gorur")
    public void kullanici_sayfadaki_sorulardan_herhangi_birini_tikladiginda_cevabini_gorur() {

       homePage.AboutusFAQwhatourclientssayilksoru.click();
       ReusableMethods.bekle(2);
       Assertions.assertTrue(homePage.AboutusFAQwhatourclientssayilksoruilkcevap.isDisplayed());

       homePage.AboutusFAQwhatourclientssayikincisoru.click();
       ReusableMethods.bekle(2);
       Assertions.assertTrue(homePage.AboutusFAQwhatourclientssayikincisoruikincicevap.isDisplayed());
    }

    @When("kullanici departments yazisina tiklayarak sayfaya ulasir")
    public void kullanici_departments_yazisina_tiklayarak_sayfaya_ulasir() {

       homePage.homePageAboutUsDepartments.click();
    }
    @When("kullanici sayfada hastahane departmanlarini resimleri ve kucuk aciklama yazisiyla birlikte gorur")
    public void kullanici_sayfada_hastahane_departmanlarini_resimleri_ve_kucuk_aciklama_yazisiyla_birlikte_gorur() {

       ReusableMethods.bekle(2);

       Assertions.assertTrue(homePage.AbouUsDepartmentsAccidentandemergency.isDisplayed());
       Assertions.assertTrue(homePage.AbouUsDepartmentsAccidentandemergencyaltyazi.isDisplayed());

       Assertions.assertTrue(homePage.AbouUsDepartmentAdmissions.isDisplayed());
       Assertions.assertTrue(homePage.AbouUsDepartmentAdmissionsaltyazi.isDisplayed());

    }

    @Then("kullanici testimonials yazisina tiklayarak sayfaya ulasir")
    public void kullanici_testimonials_yazisina_tiklayarak_sayfaya_ulasir() {
       homePage.homePageAboutUsTestimonials.click();
       ReusableMethods.bekle(2);

    }
    @Then("kullanici sayfada hastahanede tedavi gormus kisilerin yorumlarini gorur")
    public void kullanici_sayfada_hastahanede_tedavi_gormus_kisilerin_yorumlarini_gorur() {

       Assertions.assertTrue(homePage.AboutusTestimonialsresim.isDisplayed());
       Assertions.assertTrue(homePage.AboutusTestimonialsisim.isDisplayed());
       Assertions.assertTrue(homePage.AboutusTestimonialyorum.isDisplayed());
       ReusableMethods.bekle(1);

       Assertions.assertTrue(homePage.AboutusTestimonialsresim2.isDisplayed());
       Assertions.assertTrue(homePage.AboutusTestimonialsisim2.isDisplayed());
       Assertions.assertTrue(homePage.AboutusTestimonialyorum2.isDisplayed());

    }


}
