package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class='he-title'])[1]")
    public WebElement anaSayfaInsurancePlansYazisi;

    @FindBy(xpath = "(//*[@class='he-title'])[2]")
    public WebElement pediatricServiceYazisi;

    @FindBy(xpath = "(//*[@class='he-title'])[3]")
    public WebElement labTestingYazisi;

    @FindBy(xpath = "(//*[@class='he-title'])[4]")
    public WebElement openingHoursYazisi;

    @FindBy(xpath="//*[text()='About Us ']")
    public WebElement headerAboutUsButton;

    @FindBy (xpath = "//a[normalize-space()='About Hospitals']")
    public WebElement homePageaboutUsAboutHospitals;

    @FindBy (xpath = "//a[normalize-space()='Meet Our Doctors']")
    public WebElement homePageAboutUsMeetOurDoctors;

    @FindBy (xpath = "//a[contains(text(),'FAQ’s')]")
    public WebElement homePageAboutUsFAQ;

    @FindBy(xpath = "//a[normalize-space()='Departments']")
    public WebElement homePageAboutUsDepartments;

    @FindBy (xpath = "//a[normalize-space()='Testimonials']")
    public WebElement homePageAboutUsTestimonials;

    @FindBy (xpath = "//h2[normalize-space()='Some Words About Us']")
    public WebElement homePageAboutUsAboutHospitalsSomeWordsAboutUs;

    @FindBy(xpath = "//h2[normalize-space()='Our Mission']")
    public WebElement homePageAboutUsAboutHospitalOurMission;

    @FindBy(xpath = "//p[normalize-space()='OPENIN HOURS']")
    public WebElement homePageAboutUsAboutHospitalOpeninHours;

    @FindBy(xpath = "//ul[@class=\"dropdown-menu\"]/li")
    public List<WebElement> aboutUsList;

    @FindBy(xpath = "//a[normalize-space()='General Practitioner']")
    public WebElement HomePageAboutUsMeetOurDoctorsGeneralPractitioner;

    @FindBy(xpath ="//img[@src='https://www.heallifehospital.com/uploads/gallery/media/friendly-doctor-looking-camera.jpg']" )
    public WebElement MeetourDoctorsgeneralpractitionerdoctorresmi;

    @FindBy(xpath = "//h4[normalize-space()='Rachel Patel']")
    public WebElement MeetourDoctordoktorismi;

    @FindBy(xpath = "//div[@id='practitioner']//div[@class='row']//div[1]//div[1]//p[1]")
    public WebElement MeetOurdoctorsdoctorunvan;

    @FindBy(xpath = "//a[normalize-space()='Ophthalmologist']")
    public WebElement MeetourdoctorsOphthalmologist;

    @FindBy(xpath = "//div[@id='ophthalmologist']//div[@class='row']//div[1]//div[1]//img[1]")
    public WebElement MeetOurdoctorsophthalmologistdoktorresmi;

    @FindBy(xpath = "//h4[normalize-space()='Alexander Lee']")
    public WebElement MeetOurdoctorsophthalmologistdoktorismi;

    @FindBy(xpath = "//div[@id='ophthalmologist']//div[@class='row']//div[1]//div[1]//p[1]")
    public WebElement Meetourdoctorsophthalmologistdoctorunvan;

    @FindBy(xpath = "//a[normalize-space()='Paediatrician']")
    public WebElement MeetourDoctorspaediatrician;

    @FindBy(xpath ="//img[@src='https://www.heallifehospital.com/uploads/gallery/media/beautiful-caucasian-blonde-woman-wearing-doctor-stethoscope.jpg']" )
    public WebElement Meetourdoctorspaediatriciandoctorresmi;

    @FindBy (xpath = "//h4[normalize-space()='Anna Rodriguez']")
    public WebElement Meetourdoctorspaediatriciandoctorismi;

    @FindBy(xpath = "//div[@id='paediatrician']//div[@class='row']//div[1]//div[1]//p[1]")
    public WebElement Meetourdoctorspaediatriciandoctorunvan;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/ul/li[4]/a")
    public WebElement MeetourdoctorsCardiologist;

    @FindBy(xpath = "//img[@src='https://www.heallifehospital.com/uploads/gallery/media/medium-shot-doctor-holding-x-rays.jpg']")
    public WebElement MeetourdoctorsCardiologistdoctorsresmi;

    @FindBy(xpath = "//h4[normalize-space()='Maria Gonzalez']")
    public WebElement MeetourdoctorsCardiologistdoctorismi;

    @FindBy(xpath = "//div[@id='cardiologist']//div[@class='row']//div[1]//div[1]//p[1]")
    public WebElement MeetourdoctorsCardiologistdoctorunvan;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/ul/li[5]/a")
    public WebElement Meetourdoctorsgynaecologist;

    @FindBy(xpath = "//img[@src='https://www.heallifehospital.com/uploads/gallery/media/gynecologist-white-uniform-hospital-clinic-with-chair.jpg']")
    public WebElement Meetourdoctorsgynaevologistdoctorresmi;

    @FindBy(xpath = "//h4[normalize-space()='Laura Thompson']")
    public WebElement Meetourdoctorsgynaevologistdoctorismi;

    @FindBy(xpath = "//div[@id='gynaecologist']//div[@class='row']//div[1]//div[1]//p[1]")
    public WebElement Meetourdoctorsgynaevologistdoctorunvan;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/ul/li[6]/a")
    public WebElement MeetourdoctorsNeurologist;

    @FindBy(xpath = "//img[@src='https://www.heallifehospital.com/uploads/gallery/media/doctor-stands-front-mri-machine.jpg']")
    public WebElement MeetourdoctorsNeurologistdoctorresmi;

    @FindBy(xpath = "//h4[normalize-space()='James Garcia']")
    public WebElement MeetourdoctorsNeurologistdoctorismi;

    @FindBy(xpath = "//div[@id='neurologist']//div[2]//div[1]//p[1]")
    public WebElement MeetourdoctorsNeurologistdoctorunvan;

    @FindBy(xpath = "//h3[normalize-space()='What Our Clients Say']")
    public WebElement AboutUsFAQWhatourclientssay;

    @FindBy(xpath = "//h3[normalize-space()='What Our Doctor Say']")
    public WebElement AboutUsFAQWhatourdoctorsay;

    @FindBy(xpath = "//*[@id=\"headingOne\"]/h4/a")
    public WebElement AboutusFAQwhatourclientssayilksoru;

    @FindBy(xpath = "//*[@id=\"collapseOne\"]/div/p")
    public WebElement AboutusFAQwhatourclientssayilksoruilkcevap;

    @FindBy(xpath = "//*[@id=\"headingFour\"]/h4/a")
    public WebElement AboutusFAQwhatourclientssayikincisoru;

    @FindBy(xpath = "//*[@id=\"collapseFour\"]/div/p")
    public WebElement AboutusFAQwhatourclientssayikincisoruikincicevap;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[1]/div/h4")
    public WebElement AbouUsDepartmentsAccidentandemergency;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[1]/div/p")
    public WebElement AbouUsDepartmentsAccidentandemergencyaltyazi;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div/h4")
    public WebElement AbouUsDepartmentAdmissions;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div/p")
    public WebElement AbouUsDepartmentAdmissionsaltyazi;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/div/img")
    public WebElement AboutusTestimonialsresim;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/div/h3")
    public WebElement AboutusTestimonialsisim;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/div/div[1]/p")
    public WebElement AboutusTestimonialyorum;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/img")
    public WebElement AboutusTestimonialsresim2;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/h3")
    public WebElement AboutusTestimonialsisim2;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div[1]/p")
    public WebElement AboutusTestimonialyorum2;






}
