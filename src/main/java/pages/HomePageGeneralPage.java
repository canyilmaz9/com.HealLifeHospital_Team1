package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class HomePageGeneralPage extends BasePage{
    public HomePageGeneralPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



    //US_004>TC_001 Locations
    @FindBy(xpath = "(//*[@class='he-title'])[1]")
    public WebElement anaSayfaInsurancePlansYazisi;

    @FindBy(xpath = "(//*[@class='he-title'])[2]")
    public WebElement pediatricServiceYazisi;

    @FindBy(xpath = "(//*[@class='he-title'])[3]")
    public WebElement labTestingYazisi;

    @FindBy(xpath = "(//*[@class='he-title'])[4]")
    public WebElement openingHoursYazisi;


    //US_004>TC_002 Locations

    @FindBy (xpath = "(//*[@class='morebtn'])[1]")
    public WebElement insurancePlansReadMoreButonu;

    @FindBy (xpath = "(//*[@class='morebtn'])[2]")
    public WebElement pediatricServicesReadMoreButonu;

    @FindBy (xpath = "(//*[@class='morebtn'])[3]")
    public WebElement labTestingReadMoreButonu;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/h1/strong")
    public WebElement insurancePlansSayfasiKontrolYazisi;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/h1/span")
    public WebElement pediatricServicesKontrolYazisi;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[1]/h2/span")
    public WebElement labTestingSayfasiKontrolYazisi;


    //US019>TC_003 Locations
    @FindBy (xpath = "//*[@class='fa fa-user']")
    public WebElement logInButonu;

    @FindBy (xpath = "//*[@name='username']")
    public WebElement userNameBox;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement signInButton;

    @FindBy (xpath = "(//*[@class='info-box-text'])[1]")
    public WebElement dashboardaGirisdogrulamaButonu;

    @FindBy (xpath = "//*[@id=\"sibe-box\"]/ul/li[3]/a/span")
    public WebElement OPDDashBoardMenuSteteskop;

    @FindBy (xpath = "//*[@class='active']")
    public WebElement OPDDashboardDogrulamaYazisiOverview;

    //US019>TC_004 Locations

    @FindBy (xpath = "//*[@class='scrtabs-tabs-movable-container']/ul/li[2]/a")
    public WebElement OPDVisitsButton;

    @FindBy (xpath = "//*[@class='scrtabs-tabs-movable-container']/ul/li[3]/a")
    public WebElement OPDLabInvestigationButton;

    @FindBy (xpath = "//*[@class='scrtabs-tabs-movable-container']/ul/li[4]/a")
    public WebElement OPDtreatmentHistoryButton;

    @FindBy (xpath = "//*[@class='scrtabs-tabs-movable-container']/ul/li[5]/a")
    public WebElement OPDtimelineButton;


    //US019>TC_005 Locations

    @FindBy (xpath = "(//*[@class='text-uppercase bolds mt0 ptt10 pull-left font14'])[1]")
    public WebElement OPDHeaderHastaAdi;

    @FindBy (xpath = "(//*[@class='media-heading'])[1]")
    public WebElement doctorsName;

    @FindBy (xpath = "//*[@id=\"overview\"]/div/div[2]/div[1]/div/div[2]/div/table/tbody/tr[1]/td[1]")
    public WebElement visitDetails;

    @FindBy (xpath = "(//*[@class='staff-members'])[4]")
    public WebElement labInvestigationDetails;

    @FindBy (xpath = "(//*[@class='staff-members'])[5]")
    public WebElement treatmentHistoryDetails;

    @FindBy (xpath = "(//*[@class='timeline-header text-aqua'])[1]")
    public WebElement TimelineDetails;


    //US019>TC_006 Locations

    @FindBy (xpath = "(//*[@class='sorting'])[1]")
    public WebElement visitsOPDNo;

    @FindBy (xpath = "(//*[@class='sorting'])[2]")
    public WebElement caseID;

    @FindBy (xpath = "(//*[@class='sorting'])[3]")
    public WebElement appointmentDate;

    @FindBy (xpath = "(//*[@class='sorting'])[4]")
    public WebElement consultant;

    @FindBy (xpath = "(//*[@class='sorting'])[5]")
    public WebElement reference;

    @FindBy (xpath = "(//*[@class='sorting'])[6]")
    public WebElement sympthoms;

    @FindBy (xpath = "//*[@class='text-right noExport sorting_asc']")
    public WebElement action;

    }



