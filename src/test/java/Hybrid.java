import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hybrid extends PageObject {

    @FindBy(xpath = "/html/body/a")
    private WebElement ClickReturnButton;

    @FindBy(xpath = "/html/body/h1")
    private WebElement HybridPageText;

    public Hybrid (WebDriver driver) { super(driver); }

    public void ClickReturnButton() { this.ClickReturnButton.click(); }

    public String HybridPageText() {
        return this.HybridPageText.getText();
    }

}
