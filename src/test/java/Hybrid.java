import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hybrid extends PageObject {

    @FindBy(xpath = "/html/body/a")
    private WebElement ClickReturnButton;

    public Hybrid (WebDriver driver) { super(driver); }

    public void ClickReturnButton() { this.ClickReturnButton.click(); }

}
