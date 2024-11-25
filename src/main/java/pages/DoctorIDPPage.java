package pages;

import config.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ExcelDataReader_Seren;
import utils.ReusableMethods;

import java.util.*;

public class DoctorIDPPage extends BasePage {




    public DoctorIDPPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    ExcelDataReader_Seren reader= new ExcelDataReader_Seren(ConfigReader.getProperty("testData2"),"deneme");

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

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    @FindBy(xpath = "(//*[@class='timeline-header text-aqua'])[8]")
    public WebElement nurseNote;

    @FindBy(xpath = "//*[@href='#medication']")
    public WebElement medicineButton;

    @FindBy(xpath = "//a[normalize-space()='IPDN36']")
    public WebElement IPDN36Patient;

    @FindBy(xpath = "//span[@id='select2-add_charge_type-container']")
    public WebElement chargeTypeDDM;

    @FindBy(xpath = "(//li[@class='select2-results__option'])[1]")
    public WebElement IPDChartType;

    @FindBy(xpath = "//span[@aria-labelledby='select2-charge_category-container']")
    public WebElement chargeCategoryDDM;

    @FindBy(xpath = "(//li[@class='select2-results__option'])[2]")
    public WebElement admissionAndDischargeFromCC;
    @FindBy(xpath = "//*[@id='select2-charge_id-container']")
    public WebElement chargeNameDDM;

    @FindBy(xpath = "//li[@class='select2-results__option']")
    public  WebElement ipdChargeCN;
    @FindBy(xpath = "(//*[@name='qty'])[1]")
    public WebElement quantitiy;

    @FindBy(xpath = "//*[@id='charge_date']")
    public WebElement datePickerDDM;
    @FindBy(xpath = "(//*[@class='close pupclose'])[1]")
    public WebElement closePrescriptionPage;

    @FindBy(xpath = "//span[@title='Next Month']")
    public WebElement nextMonthDatepicker;

    @FindBy(xpath = "//td[@data-day='12/04/2024']")
    public WebElement pickDate;

    @FindBy(xpath = "//a[@data-action='togglePicker']")  //  //a[@data-action='togglePicker']
    public WebElement pickTime;

    @FindBy(xpath = "//span[@class='timepicker-hour']")
    public WebElement pickHourFromTable;

    @FindBy(xpath = "(//td[@data-action='selectHour'])[10]")
    public WebElement pickHour9;


    @FindBy(xpath = "//span[@class='timepicker-minute']")
    public WebElement pickMin;

    @FindBy(xpath = "(//td[@data-action='selectMinute'])[9]")
    public WebElement pickMin40;

    @FindBy(xpath = "//button[@data-action='togglePeriod']")
    public WebElement timePeriodAmOrPm;
    @FindBy(xpath = "(//button[@name='charge_data'])[1]")
    public WebElement addCharge;

    @FindBy(xpath = "(//button[@name='charge_data'])[2]")
    public WebElement saveCharge;






    @FindBy(xpath = "//a[@title='Increment Hour']")
    public WebElement incrementHour;

    @FindBy(xpath = "//a[@title='Decrement Hour']")
    public WebElement decrementHour;

    @FindBy(xpath = "//a[@title='Increment Minute']")
    public WebElement incrementMin;

    @FindBy(xpath = "//a[@title='Decrement Minute']")
    public WebElement decrementMin;























    public void doctorLogin(int rowAccessInfo) {
        ExcelDataReader_Seren reader=new ExcelDataReader_Seren(ConfigReader.getProperty("testData"), "loginBilgileri");

        adminDoctorMail.sendKeys(reader.getCellData(rowAccessInfo, 4));
        adminPass.sendKeys(reader.getCellData(rowAccessInfo, 2));
        doctorSignIn.click();

    }

    public void adminLogin(int rowAccessInfo) {
        ExcelDataReader_Seren reader=new ExcelDataReader_Seren(ConfigReader.getProperty("testData"), "loginBilgileri");

        adminDoctorMail.sendKeys(reader.getCellData(rowAccessInfo, 3));
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

      WebElement  data= driver.findElement(By.xpath("//tbody//tr[" +row+ "]//td[" +column+ "]"));
      ReusableMethods.waitForElementVisibility(data,5);

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
       ReusableMethods.hoverOver(hamburgerMenuIPD);
       ReusableMethods.waitForElementVisibility(hamburgerMenuIPD,2);
        hamburgerMenuIPD.click();
        Assert.assertTrue(ReusableMethods.isTextVisible(" Nurse Notes"));



    }

    public void verifyAddButtonAccessible(){

        ReusableMethods.clickWithText("  Add Patient");
        ReusableMethods.hardWait(1);
        ReusableMethods.isTextVisible("New Patient");

    }

    public void verifyDischargedButtonAccessible(){

        ReusableMethods.clickWithText(" Discharged Patient");
        ReusableMethods.isTextVisible(" IPD Discharged Patient");

    }


    public void verifyMedicineButtonAccessible(){


        medicineButton.click();

        List<WebElement> medicinePageDataTableHeaderList=driver.findElements(By.xpath("(//table[contains(@class, 'table-striped')])[13]//th"));

        for (WebElement header: medicinePageDataTableHeaderList){
            if (header.getText().equals(reader.getCellData(1,1))) {
                Assert.assertTrue(true);
                break;
            }
        }


    }


    public void addMedication(){
            ReusableMethods.clickWithText(" Add Medication Dose");






    }


    public void addCharge(){
        ReusableMethods.clickWithText(" Charges");
        ReusableMethods.clickWithText(" Add Charges");
        chargeTypeDDM.click();
        ReusableMethods.hardWait(2);
        IPDChartType.click();
        ReusableMethods.hardWait(2);
        chargeCategoryDDM.click();
        ReusableMethods.hardWait(2);
        admissionAndDischargeFromCC.click();
        ReusableMethods.hardWait(2);
        chargeNameDDM.click();
        ReusableMethods.hardWait(2);
        ipdChargeCN.click();
        quantitiy.sendKeys("150");
        ReusableMethods.hardWait(2);
        datePickerDDM.click();
        ReusableMethods.hardWait(2);
        pickDate.click();
        ReusableMethods.hardWait(2);
        pickTime.click();
        ReusableMethods.hardWait(2);
        pickHourFromTable.click();
        ReusableMethods.hardWait(2);
        pickHour9.click();
        ReusableMethods.hardWait(2);
        pickMin.click();
        ReusableMethods.hardWait(2);
        pickMin40.click();
        ReusableMethods.hardWait(2);
        Assert.assertEquals("AM",timePeriodAmOrPm.getText());
        ReusableMethods.hardWait(2);
        addCharge.click();
        ReusableMethods.hardWait(2);
        saveCharge.click();



    }







}
