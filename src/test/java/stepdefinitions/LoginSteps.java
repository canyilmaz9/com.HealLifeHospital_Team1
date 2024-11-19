package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
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
}
