import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Success extends PageObject{

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement ReturnHome;


    public Success (WebDriver driver) { super(driver); }

    public void ReturnHome() { this.ReturnHome.click(); }





}