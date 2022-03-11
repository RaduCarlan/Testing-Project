import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Info extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[1]")
    private WebElement PrevButtonContact;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButton2;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement SelectEmail;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement SelectPhone;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement SelectCountry;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement SelectCity;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement SelectPostCode;


    public Contact_Info (WebDriver driver) { super(driver); }

    public void nextButton2() { this.nextButton2.click(); }

    public void PrevButtonContact() { this.PrevButtonContact.click(); }

    public void SelectEmail(String input) { this.SelectEmail.sendKeys(input); }

    public void SelectPhone(String input) { this.SelectPhone.sendKeys(input); }

    public void SelectCountry(String input) { this.SelectCountry.sendKeys(input); }

    public void SelectCity(String input) { this.SelectCity.sendKeys(input); }

    public void SelectPostCode(String input) { this.SelectPostCode.sendKeys(input); }





}
