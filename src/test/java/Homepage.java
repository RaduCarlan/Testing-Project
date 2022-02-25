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

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement ClickHybridButton;

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement ClickGoTop;
    @FindBy(xpath = "/html/body/footer/div/p")
    private WebElement TextCopyright;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/a")
    private WebElement ClickFundamentals;
    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/h2")
    private WebElement TextFundamentals;

    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]/a")
    private WebElement ClickSelenium;
    @FindBy(xpath = "/html/body/section[5]/div/div/div[1]/h2")
    private WebElement TextSelenium;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[2]/div/div/a[2]/i")
    private WebElement JaneFacebook;
    @FindBy(xpath = "/html/body/section[7]/div/div/div[2]/div/div/h3")
    private WebElement JaneDoeText;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[4]/div/div/a[4]/i")
    private WebElement SaraInstagram;
    @FindBy(xpath = "/html/body/section[7]/div/div/div[4]/div/div/h3")
    private  WebElement SaraSmithText;


    public Homepage (WebDriver driver) { super(driver); }


    public void StartTheEnrollment_button() {
        this.StartTheEnrollment_button.click();
    }

    public void SelectEmail_tab() {
        this.SelectEmail_tab.sendKeys("asd@asd.com");
    }

    public void AccesEmail_tab() { this.AccesEmail_tab.click(); }

    public void ClickHybridButton() { this.ClickHybridButton.click(); }

    public void ClickGoTop() { Utils.scrollToElement(driver, TextCopyright); this.ClickGoTop.click(); }

    public void ClickFundamentals() { Utils.scrollToElement(driver, TextFundamentals); this.ClickFundamentals.click(); }

    public void ClickSelenium() { Utils.scrollToElement(driver, TextSelenium); this.ClickSelenium.click(); }

    public void ClickJaneFacebook() { Utils.scrollToElement(driver, JaneDoeText); this.JaneFacebook.click(); }

    public void ClickSaraInstagram () { Utils.scrollToElement(driver, SaraSmithText); this.SaraInstagram.click(); }

}
