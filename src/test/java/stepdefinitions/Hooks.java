package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import drivers.DriverManager;
import utils.LoggerHelper;

import java.time.Duration;

public class Hooks {
	private static WebDriver driver;

	@Before
	public void setUp(Scenario scenario) {
		LoggerHelper.info("Test Başlıyor: " + scenario.getName());

		// Eğer driver zaten başlatılmadıysa başlat
		if (driver == null) {
			driver = DriverManager.getDriver(); // DriverManager üzerinden driver alınıyor
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

			LoggerHelper.info("Driver başlatıldı ve test hazırlandı.");
		}
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerHelper.error("Test başarısız oldu: " + scenario.getName());
		} else {
			LoggerHelper.info("Test başarıyla tamamlandı: " + scenario.getName());
		}

		// Driver'ı kapat ve null yap
		quitDriver();
		LoggerHelper.info("Driver kapatıldı.");
	}
	public static WebDriver getDriver() {
		// Driver null ise hata fırlat, çünkü başlatılmamış olabilir
		if (driver == null) {
			throw new IllegalStateException("Driver henüz başlatılmadı. 'setUp()' metodu çağrılmalı.");
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null; // Driver örneğini null yaparak belleği temizle
		}
	}
}
