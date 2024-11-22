package pages;

import config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ExcelDataReader;

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



    public void doctorLogin(int rowAccessInfo) {
        ExcelDataReader reader=new ExcelDataReader("src/test/resources/testData.xlsx", "loginBilgileri");

        adminDoctorMail.sendKeys(reader.getCellData(rowAccessInfo, 4));
        adminPass.sendKeys(reader.getCellData(rowAccessInfo, 2));
        doctorSignIn.click();





    }

}