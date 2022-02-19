import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class Homepage extends PageObject {

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement StartTheEnrollment_button;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement SelectEmail_tab;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement AccesEmail_tab;





    public Homepage (WebDriver driver) { super(driver); }


    public void StartTheEnrollment_button() {
        this.StartTheEnrollment_button.click();
    }

    public void SelectEmail_tab() {
        this.SelectEmail_tab.sendKeys("asd@asd.com");
    }

    public void AccesEmail_tab() { this.AccesEmail_tab.click(); }

}
