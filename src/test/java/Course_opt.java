import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Course_opt extends PageObject {

    @FindBy (xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement SelectSoftwareTesting;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextButton3;



    public Course_opt (WebDriver driver) { super(driver); }

    public void SelectSoftwareTesting() { this.SelectSoftwareTesting.click(); }

    public void nextButton3() { this.nextButton3.click(); }


}
