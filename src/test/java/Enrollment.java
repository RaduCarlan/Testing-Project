import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enrollment  extends PageObject{

    @FindBy(xpath = "/html/body/div/div/h2")
    private WebElement textSignUp;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;






    public Enrollment (WebDriver driver) { super(driver); }

    public String getTextSign() {
        return this.textSignUp.getText(); }

    public void nextButton() { this.nextButton.click(); }




}
