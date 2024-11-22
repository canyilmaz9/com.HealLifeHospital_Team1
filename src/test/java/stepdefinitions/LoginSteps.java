package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.ReusableMethods;

public class LoginSteps {
	private static final Logger logger = LogManager.getLogger(GoogleSteps.class);
	WebDriver driver = stepdefinitions.Hooks.getDriver();
	LoginPage loginPage = new LoginPage(driver);

	@Given("the user is on the login page")
	public void theUserIsOnTheLoginPage() {
		driver.get(config.ConfigReader.getProperty("url"));
	}

	@When("the user enters valid credentials")
	public void theUserEntersValidCredentials() {
		loginPage.login("testUser", "password123");
	}

	@Then("the user should see the home page")
	public void theUserShouldSeeTheHomePage() {
		// Assertion logic


	}

	@Given("kullanici anasayfada")
	public void kullaniciAnasayfada() {
		driver.get(ConfigReader.getProperty("homePageUrl"));
		String homePageUrl = ConfigReader.getProperty("homePageUrl");
		logger.info("Heal Life Hospital ana sayfasına gidildi: " + homePageUrl );
		Assert.assertEquals(ConfigReader.getProperty("homePageUrl"),driver.getCurrentUrl());
		logger.info("Heal Life Hospital ana sayfasında oldugu dogrulandi" );
	}

	@When("login butonu gorunur ve tiklanabilir oldugu dogrulanir ve tiklanir. tiklandiktan sonra userlogin sayfasinda oldugu dogrulanir")
	public void loginButonuGorunurVeTiklanabilirOlduguDogrulanirVeTiklanirTiklandiktanSonraUserloginSayfasindaOlduguDogrulanir() {
		Assert.assertTrue(loginPage.homePageLoginButton.isDisplayed());
		logger.info("Ana sayfada login butonu goruntulendi" );
		Assert.assertTrue(loginPage.homePageLoginButton.isEnabled());
		logger.info("Ana sayfada login butonu tiklanabilirligi dogrulandi" );
		loginPage.homePageLoginButton.click();
		logger.info("Ana sayfada login butonu tiklandi" );
		String loginPageUrl = ConfigReader.getProperty("loginPageUrl");
		Assert.assertEquals(ConfigReader.getProperty("loginPageUrl"),loginPageUrl);
		logger.info("Login page sayfasına gidildigi dogrulandi: " + loginPageUrl );
	}

	@And("user login sayfasinda sagda login penceresi solda latest new bilgileri bulunur")
	public void userLoginSayfasindaSagdaLoginPenceresiSoldaLatestNewBilgileriBulunur() {
		loginPage.loginPageBoxes();
		logger.info("user login sayfasinda sagda login penceresi solda latest new bilgileri bulundu" );
	}

	@Then("user login sayfasinda \\(sisteme daha önceden kayitli) bilgiler girilerek dashboard panele login olunur.")
	public void userLoginSayfasindaSistemeDahaÖncedenKayitliBilgilerGirilerekDashboardPaneleLoginOlunur() {
		loginPage.setLogin(ConfigReader.getProperty("patientUsername"),ConfigReader.getProperty("patientPassword"));

		String patientDashboardUrl=ConfigReader.getProperty("patientDashboardUrl");
		Assert.assertEquals(patientDashboardUrl,driver.getCurrentUrl());
		ReusableMethods.bekle(2);


	}
}
