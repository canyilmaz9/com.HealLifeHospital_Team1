package pages;

import config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		String timeoutValue = ConfigReader.getProperty("timeout");
		if (timeoutValue == null || timeoutValue.isEmpty()) {
			throw new RuntimeException("Timeout value is not set or invalid in config.properties!");
		}
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(timeoutValue)));
	}

	public void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void type(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
	}
}