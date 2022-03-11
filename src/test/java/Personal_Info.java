import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Personal_Info extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement SelectFirstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement SelectLastName;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement SelectUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement SelectPassword;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement SelectConPassword;


    public Personal_Info (WebDriver driver) { super(driver); }


    public void nextButton() { this.nextButton.click(); }

    public void SelectFirstName(String input) {
        this.SelectFirstName.sendKeys(input);
    }

    public void SelectLastName(String input) {
        this.SelectLastName.sendKeys(input);
    }

    public void SelectUsername(String input) {
        this.SelectUsername.sendKeys(input);
    }

    public void SelectPassword(String input) {
        this.SelectPassword.sendKeys(input);
    }

    public void SelectConPassword(String input) {
        this.SelectConPassword.sendKeys(input);
    }

}
