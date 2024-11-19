package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;
import config.ConfigReader;

public class GoogleSteps {

    private static final Logger logger = LogManager.getLogger(GoogleSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    GooglePage googlePage = new GooglePage(driver);

    @Given("User is on the Google homepage")
    public void user_is_on_the_google_homepage() {
        String googleUrl = ConfigReader.getProperty("googleUrl");
        driver.get(googleUrl);
        logger.info("Google ana sayfasına gidildi: " + googleUrl);
    }

    @When("User searches for {string}")
    public void user_searches_for(String keyword) throws InterruptedException {
        logger.info("Kullanıcı şu terimi arıyor: " + keyword);
        googlePage.kabulEtButton.click();
        logger.info("Google ana sayfasında çerezler kabul edildi.");
        Thread.sleep(1000);
        googlePage.searchBox.sendKeys(keyword);
        logger.info("Arama kutusuna şu anahtar kelime girildi: " + keyword);
        googlePage.searchBox.submit();
        logger.info("Arama işlemi gönderildi.");
    }

    @Then("Search results containing {string} are displayed")
    public void search_results_containing_are_displayed(String keyword) throws InterruptedException {
        Thread.sleep(1000);
        logger.info("Arama sonuçları doğrulanıyor: " + keyword);
        boolean isKeywordPresent = googlePage.searchResult.getText().contains(keyword);
        Assert.assertTrue("Arama sonuçlarında anahtar kelime bulunamadı", isKeywordPresent);
        if (isKeywordPresent) {
            logger.info("Arama sonuçlarında şu anahtar kelime bulundu: " + keyword);
        } else {
            logger.error("Arama sonuçlarında şu anahtar kelime BULUNAMADI: " + keyword);
        }
    }
}
