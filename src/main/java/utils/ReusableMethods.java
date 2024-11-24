package utils;

import drivers.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ReusableMethods {

    static WebDriver driver=DriverManager.getDriver();
    static Actions actions = new Actions(driver);


    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = DriverManager.getDriver().getWindowHandle();
        for (String handle : DriverManager.getDriver().getWindowHandles()) {
            DriverManager.getDriver().switchTo().window(handle);
            if (DriverManager.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        DriverManager.getDriver().switchTo().window(origin);
    }




    public static List<String> getStringList(List<WebElement> kaynakList){

        List<String> stringList = new ArrayList<>();

        for ( WebElement eachElement : kaynakList
        ) {

            stringList.add(eachElement.getText());

        }


        return stringList;
    }

    public static void switchWindowByUrl (WebDriver driver, String hedefUrl){

        Set<String> acikWindowlarinWhdSeti = driver.getWindowHandles();
        for (String eachWhd : acikWindowlarinWhdSeti
        ) {
            // once bizim oglanin getirdigi whd ile bir window'a gecis yapalim
            driver.switchTo().window(eachWhd);
            String gecilenSayfaUrl = driver.getCurrentUrl();

            if (gecilenSayfaUrl.equals(hedefUrl)){
                break;
            }
        }
    }

    public static void switchWindowByTitle(WebDriver driver, String hedefTitle){
        Set<String> acikWindowlarinWhdSeti = driver.getWindowHandles();
        for (String eachWhd : acikWindowlarinWhdSeti
        ) {
            // once bizim oglanin getirdigi whd ile bir window'a gecis yapalim
            driver.switchTo().window(eachWhd);
            String gecilenSayfaTitle = driver.getTitle();

            if (gecilenSayfaTitle.equals(hedefTitle)){
                break;
            }
        }
    }

    public static void getFullScreenshot(WebDriver driver, String screenshotIsmi){
        // 1.adim screenshot objesi olusturmak ve deger olarak driver'imizi atamak
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2.adim screenshot'i kaydedecegimiz File'i olusturun
        File tumSayfaSS = new File("target/ekranGoruntuleri/"+screenshotIsmi+".png");

        // 3.adim screenshot'i alip gecici bir dosyaya kopyalayalim
        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi, asil kaydetmek istedigimiz dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya,tumSayfaSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFullScreenshot(WebDriver driver){
        // dosya isimlerine tarih etiketi ekleyelim
        // ... 240829114023 gibi bir etiket eklemek dosya ismini benzersiz yapar

        LocalDateTime zaman = LocalDateTime.now(); // 2024.08.29T11:42:23:123456
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihEtiketi = zaman.format(dateTimeFormatter); // 240829114023

        // 1.adim screenshot objesi olusturmak ve deger olarak driver'imizi atamak
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2.adim screenshot'i kaydedecegimiz File'i olusturun
        File tumSayfaSS = new File("target/ekranGoruntuleri/TumSayfaSS_"+tarihEtiketi+".png");

        // 3.adim screenshot'i alip gecici bir dosyaya kopyalayalim
        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi, asil kaydetmek istedigimiz dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya,tumSayfaSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void getWebelementScreenshot(WebElement istenenWebelement){

        // tarih etiketi olusturalim
        LocalDateTime zaman = LocalDateTime.now(); // 2024.08.29T11:42:23:123456
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihEtiketi = zaman.format(dateTimeFormatter); // 240829114023


        // 1.adim kullanacagimiz WebElementi locate edip kaydedin

        // 2.adim kaydedeceginiz dosyayi olusturun
        File webelementSS = new File("target/ekranGoruntuleri/webelementSS_"+tarihEtiketi+".png");

        // 3.adim webelementi kullanarak screenshot'i alip gecici dosyaya kaydedin
        File geciciDosya = istenenWebelement.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya,webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void getWebelementScreenshot(WebElement istenenWebelement,String resimIsmi){

        // tarih etiketi olusturalim
        LocalDateTime zaman = LocalDateTime.now(); // 2024.08.29T11:42:23:123456
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihEtiketi = zaman.format(dateTimeFormatter); // 240829114023


        // 1.adim kullanacagimiz WebElementi locate edip kaydedin

        // 2.adim kaydedeceginiz dosyayi olusturun
        File webelementSS = new File("target/ekranGoruntuleri/"+resimIsmi+"_"+tarihEtiketi+".png");

        // 3.adim webelementi kullanarak screenshot'i alip gecici dosyaya kaydedin
        File geciciDosya = istenenWebelement.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciDosya,webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void clickWithText(String text) {

        driver.findElement(By.xpath("//*[text()='" + text + "']")).click();
    }

    public static boolean isElementVisible(WebElement element) {
        try {

            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public static void waitForElementVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean isTextVisible(String text) {
        try {
            // Metni içeren bir WebElement bul
            WebElement element = driver.findElement(By.xpath("//*[text()='" + text + "']"));
            // Bulunan elementin görünür olup olmadığını kontrol et
            return isElementVisible(element);
        } catch (Exception e) {
            // Element bulunamazsa veya başka bir hata oluşursa false döndür
            return false;
        }
    }

    public static void waitForPageToLoad(long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
                .equals("complete"));
    }

    public static void hoverOver(WebElement element) {

        actions.moveToElement(element).perform();
    }

    /**
     * Sends TAB key press
     */
    public static void pressTab() {

        actions.sendKeys(Keys.TAB).perform();
    }

    public static void hardWait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
