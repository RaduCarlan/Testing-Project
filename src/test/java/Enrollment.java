import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enrollment  extends PageObject{

    @FindBy(xpath = "/html/body/div/div/h2")
    private WebElement textSignUp;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement PersInfoHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement ContactInformationHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement CourseOptionHeader;




    public Enrollment (WebDriver driver) { super(driver); }

    public String PersInfoHeader() {
        return this.PersInfoHeader.getText();
    }

    public String ContactInformationHeader() {
        return this.ContactInformationHeader.getText();
    }

    public String CourseOptionHeader() {
        return this.CourseOptionHeader.getText();
    }

    public String getTextSign() {
        return this.textSignUp.getText(); }

    public void nextButton() { this.nextButton.click(); }




}
