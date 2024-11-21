package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ReusableMethods {

    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



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

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
}
