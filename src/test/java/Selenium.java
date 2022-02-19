import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Selenium extends PageObject{

    @FindBy(xpath = "/html/body/h1")
    private WebElement textSelenium;

    public Selenium (WebDriver driver) { super(driver); }

    public String getTextSelenium() {
        return this.textSelenium.getText();
    }
}
