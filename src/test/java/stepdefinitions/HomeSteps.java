package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import config.ConfigReader;

public class HomeSteps {

    private static final Logger logger = LogManager.getLogger(HomeSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
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


}
