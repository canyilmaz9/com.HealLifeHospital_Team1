package pages;

import config.ConfigReader;
import io.cucumber.java.be.I;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ExcelDataReader;
import utils.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoctorIDPPage extends BasePage {




    public DoctorIDPPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//*[@placeholder='Username']")
    public WebElement adminDoctorMail;

    @FindBy (xpath = "//*[@placeholder='Password']")
    public WebElement adminPass;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement doctorSignIn;

    @FindBy(xpath = "//*[text()=' Dashboard']")
    public WebElement dashboardText;

    @FindBy (xpath = "//*[text()=' IPD']")
    public WebElement ipdLink;

    @FindBy(xpath = "//*[text()=' IPD Patient']")
    public WebElement ipdPatientText;

    @FindBy(xpath = "//*[text()='Records: 1 to 4 of 4']")
    public WebElement recordsPatientCountInDataTable;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement ipdPatientSearchBox;

    @FindBy(xpath = "(//*[@class='fa fa-reorder'])[2]")
    public WebElement hamburgerMenuIPD;













    public void doctorLogin(int rowAccessInfo) {
        ExcelDataReader reader=new ExcelDataReader(ConfigReader.getProperty("testData"), "loginBilgileri");

        adminDoctorMail.sendKeys(reader.getCellData(rowAccessInfo, 4));
        adminPass.sendKeys(reader.getCellData(rowAccessInfo, 2));
        doctorSignIn.click();

    }



    public void verifyHeadersAreVisible(WebDriver driver) {
        // Tüm başlıkları locate et
        List<WebElement> tableHeaders = driver.findElements(By.xpath("//thead/tr/th"));

        // Her bir başlık için kontrol yap
        for (WebElement header : tableHeaders) {
            // Doğru sırada assertTrue kullanımı
            Assert.assertTrue("Başlık '" + header.getText() + "' görünür değil!",header.isDisplayed());
        }

    }

    public void verifyheaderSortingAscending(String sortableHeader, int BasliginSutunu){

        List<WebElement> tableHeaders =driver.findElements(By.xpath("//thead/tr/th"));

        for (WebElement header:tableHeaders){
            if (header.getText().contains(sortableHeader)){
                    ReusableMethods.clickWithText(sortableHeader);
                    ReusableMethods.waitForElementVisibility(tableHeaders.get(2),3);

                List<WebElement> rowData=driver.findElements(By.xpath("//tbody//tr//td["+BasliginSutunu+"]"));
                List<Integer> rowDataIntList = new ArrayList<>();


                for (WebElement cell :rowData){

                    try {
                        rowDataIntList.add(Integer.parseInt(cell.getText()));
                    } catch (NumberFormatException e) {
                        System.out.println("Hücre değeri bir sayı değil: " + cell.getText());
                    }
                }
                List<Integer> sortedList=new ArrayList<>();
                Collections.sort(sortedList);

                Assert.assertEquals(rowDataIntList,sortedList);
            }

        }



    }

    public String  patientCountInDataTable(){

        List<WebElement> dataTablePatientCountList= driver.findElements(By.xpath("//tbody//tr"));
        String dataTablePatientCount=""+dataTablePatientCountList.size();


    return dataTablePatientCount;
    }


    public WebElement TableDataRetriever(int row, int column){

        WebElement data= driver.findElement(By.xpath("//tbody//tr["+row+"]//td["+column+"]"));

       return   data;

    }


    public void clickPatientByIPDNo(String IPDNo){

        WebElement data= driver.findElement(By.xpath("//*[text()='IPDN"+IPDNo+"']"));
        data.click();

    }

    public void searchPatientInIPDBoxWithDataTable(int row){

        List<WebElement> dataTable=driver.findElements(By.xpath("//tbody//tr["+row+"]//td"));

        for (WebElement data:dataTable) {

            ipdPatientSearchBox.sendKeys(data.getText());

            Assert.assertTrue(data.isDisplayed());
        }

    }

    public void clickOnHamburgerMenu(){

        //hoverover yap!
       ReusableMethods.waitForElementVisibility(TableDataRetriever(1,8),5);

       ReusableMethods.waitForPageToLoad(5);
        hamburgerMenuIPD.click();
        Assert.assertTrue(ReusableMethods.isTextVisible(" Nurse Notes"));



    }


}
