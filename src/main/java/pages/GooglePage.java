package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePage{

    public GooglePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    public WebElement kabulEtButton;


    @FindBy(name = "btnK")
    public WebElement searchButton;

    @FindBy(xpath = "//h3[contains(text(),'Java')]")
    public WebElement searchResult;
}
