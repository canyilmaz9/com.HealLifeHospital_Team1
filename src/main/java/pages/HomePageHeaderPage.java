package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageHeaderPage extends BasePage{

    public HomePageHeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[@class='navbar-brand logo']")
    public WebElement headerLogo;

    @FindBy(xpath="(//*[text()='Home'])[1]")
    public WebElement headerHomeButton;

    @FindBy(xpath="//*[text()='Appointment']")
    public WebElement headerAppointmentButton;

    @FindBy(xpath="//*[text()='About Us ']")
    public WebElement headerAboutUsButton;

    @FindBy(xpath="//*[text()='FAQ’s']")
    public WebElement headerDropDownFAQsButton;

    @FindBy(xpath="(//*[text()='Gallery'])[1]")
    public WebElement headerGalleryButton;

    @FindBy(xpath="(//*[text()='Contact Us'])[1]")
    public WebElement headerContactUsButton;

    @FindBy(xpath="//*[text()='Login']")
    public WebElement headerLoginButton;

    @FindBy(xpath="//*[text()='Latest News']")
    public WebElement headerLatestNewsButton;

    @FindBy(xpath="//marquee[@*='scroll']")
    public WebElement headerLatestNewsScroll;

    @FindBy(xpath="//*[text()='Specialist']")
    public WebElement AppointmentPageSpecialistButton;

    @FindBy(xpath="//h2[text()='Gallery']")
    public WebElement GalleryPageGalleryButton;

    @FindBy(xpath="//*[text()='LET’S TALK']")
    public WebElement ContactUsPageLetsTalkButton;

    @FindBy(xpath="//*[text()='About Hospitals']")
    public WebElement AboutUsDropdownAboutHospitalsButton;

    @FindBy(xpath="//*[text()='Some Words About Us']")
    public WebElement AboutHospitalsPageTextLink;

    @FindBy(xpath="//*[text()='Meet Our Doctors']")
    public WebElement AboutUsDropdownMeetOurDoctorsButton;

    @FindBy(xpath="//*[@class='nav nav-pills doctortap']")
    public WebElement MeetOurDoctorsPageDoctorTaps;

    @FindBy(xpath="//*[text()='FAQ’s']")
    public WebElement AboutUsDropDownFAQsButton;

    @FindBy(xpath="//*[text()='What Our Clients Say']")
    public WebElement FAQsPageClientFaqsTextLink;

    @FindBy(xpath="//*[text()='Departments']")
    public WebElement AboutUsDropDownDepartmentsButton;

    @FindBy(xpath="//*[text()='DEPARTMENT']")
    public WebElement DepartmentsPageDepartmentsTextLink;

    @FindBy(xpath="//*[text()='Testimonials']")
    public WebElement AboutUsDropDownTestimonialsButton;

    @FindBy(xpath="(//*[@class='user-testimonial'])[1]")
    public WebElement TestimonialsPageUserTestimonialsLink;


}
