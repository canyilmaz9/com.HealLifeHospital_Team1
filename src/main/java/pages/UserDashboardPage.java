package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboardPage extends BasePage{

    public UserDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[text()=' Dashboard']")
    public WebElement userPageDashboardButton;

    @FindBy(xpath="//*[text()='My Appointments']")
    public WebElement userPageMyAppointmentsButton;

    @FindBy(xpath="(//*[text()='My Appointments'])[2]")
    public WebElement userAppointmentPageMyAppText;

    @FindBy(xpath="//*[text()=' OPD']")
    public WebElement userPageOPDButton;

    @FindBy(xpath="//*[text()=' Visits']")
    public WebElement userOPDPageVisitsButton;

    @FindBy(xpath="//*[text()=' IPD']")
    public WebElement userPageIPDButton;

    @FindBy(xpath="//*[text()=' IPD Patient']")
    public WebElement userIPDPageIPDText;

    @FindBy(xpath="//*[text()=' Pharmacy']")
    public WebElement userPagePharmacyButton;

    @FindBy(xpath="//*[text()=' Pharmacy Bill']")
    public WebElement userPharmacyPagePharmacyBillText;

    @FindBy(xpath="//*[text()=' Pathology']")
    public WebElement userPagePathologyButton;

    @FindBy(xpath="(//*[text()='Pathology Test Reports'])[1]")
    public WebElement userPathologyPagePatholoyText;

    @FindBy(xpath="//*[text()=' Radiology']")
    public WebElement userPageRadiologyButton;

    @FindBy(xpath="//*[text()=' Radiology Test Reports']")
    public WebElement userRadiologyPageRadiologyText;

    @FindBy(xpath="//*[text()=' Ambulance']")
    public WebElement userPageAmbulanceButton;

    @FindBy(xpath="//*[text()=' Ambulance Bill']")
    public WebElement userAmbulancePageAmbulanceText;

    @FindBy(xpath="//*[text()=' Blood Bank']")
    public WebElement userPageBloodBankButton;

    @FindBy(xpath="//*[text()='Blood Issue']")
    public WebElement userBloodBankPageIssueText;

    @FindBy(xpath="//*[text()=' Live Consultation']")
    public WebElement userPageLiveConsultationButton;

    @FindBy(xpath="(//*[text()=' Live Consultation'])[2]")
    public WebElement userLiveConsultationPageText;

}
