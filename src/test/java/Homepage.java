import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.security.PublicKey;

public class Homepage extends PageObject {

    @FindBy(xpath = "/html/body/section[1]/div/div/div/h1/span")
    private WebElement HomePageText;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement StartTheEnrollment_button;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement SelectEmail_tab;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement AccesEmail_tab;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement ClickHybridButton;
    @FindBy(xpath = "/html/body/section[2]/div/div/h3")
    private WebElement HybridText;

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
    private WebElement SaraSmithText;

    @FindBy(xpath = "/html/body/section[6]/div/div/div[3]/h3/button")
    private WebElement QuestionsTabOpen;
    @FindBy(xpath = "/html/body/section[6]/div/div/div[3]/h3/button")
    private WebElement QuestionsTabClose;
    @FindBy(xpath = "/html/body/section[6]/div/h2")
    private WebElement QuestionsText;

    @FindBy(xpath = "/html/body/section[8]/div/div/div[1]/ul/li[4]")
    private WebElement EnrollmentEmail;
    @FindBy(xpath = "/html/body/section[8]/div/div/div[1]/h2")
    private WebElement ContactInfoText;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[3]/a")
    private WebElement InstructorsButton;
    @FindBy(xpath = "/html/body/nav/div/div/ul/li[2]/a")
    private WebElement QuestionsButton;
    @FindBy(xpath = "/html/body/nav/div/div/ul/li[1]/a")
    private WebElement WhatYouLearnButton;
    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement SoftwareTestingButton;

    @FindBy(xpath = "/html/body/section[7]/div/h2")
    private WebElement InstructorsText;
    @FindBy(xpath = "/html/body/section[6]/div/h2")
    private WebElement FreqAskedText;
    @FindBy(xpath = "/html/body/section[4]/div/div/div[2]/h2")
    private WebElement WhatLearnText;


    public Homepage(WebDriver driver) {
        super(driver);
    }

    public String HomePageText() {
        return this.HomePageText.getText();
    }


    public void StartTheEnrollment_button() {
        this.StartTheEnrollment_button.click();
    }

    public void SelectEmail_tab() {
        this.SelectEmail_tab.sendKeys(RandomEmailGen());
    }
    public String RandomEmailGen() {
        return RandomStringUtils.randomAlphabetic(8).toLowerCase() + "@" +
                RandomStringUtils.randomAlphabetic(5).toLowerCase()+ "." +
                RandomStringUtils.randomAlphabetic(3).toUpperCase();
    }

    public void AccesEmail_tab() {
        this.AccesEmail_tab.click();
    }

    public void ClickHybridButton() {
        Utils.scrollToElement(driver, HybridText);
        this.ClickHybridButton.click();
    }

    public void ClickGoTop() {
        Utils.scrollToElement(driver, TextCopyright);
        this.ClickGoTop.click();
    }

    public void ClickFundamentals() {
        Utils.scrollToElement(driver, TextFundamentals);
        this.ClickFundamentals.click();
    }

    public void ClickSelenium() {
        Utils.scrollToElement(driver, TextSelenium);
        this.ClickSelenium.click();
    }

    public void ClickJaneFacebook() {
        Utils.scrollToElement(driver, JaneDoeText);
        this.JaneFacebook.click();
    }

    public void ClickSaraInstagram() {
        Utils.scrollToElement(driver, SaraSmithText);
        this.SaraInstagram.click();
    }

    public void ClickQuestionsTab() {
        Utils.scrollToElement(driver, QuestionsText);
        this.QuestionsTabOpen.click();
        Utils.waitForElementToLoad(1);
        this.QuestionsTabClose.click();
    }

    public String VerifyEnrollmentEmail() {
        Utils.scrollToElement(driver, ContactInfoText);
        return this.EnrollmentEmail.getText();
    }

    public void ClickMenuButtons() {
        this.InstructorsButton.click();
        Assert.assertEquals(InstructorsText.getText(), Constants.INSTRUCTORS_TEXT);
        Utils.waitForElementToLoad(1);
        this.SoftwareTestingButton.click();
        Assert.assertEquals(HomePageText.getText(), Constants.HOME_PAGE_TEXT);
        Utils.waitForElementToLoad(1);
        this.QuestionsButton.click();
        Assert.assertEquals(QuestionsText.getText(), Constants.QUESTIONS_TEXT);
        Utils.waitForElementToLoad(1);
        this.SoftwareTestingButton.click();
        Assert.assertEquals(HomePageText.getText(), Constants.HOME_PAGE_TEXT);
        Utils.waitForElementToLoad(1);
        this.WhatYouLearnButton.click();
        Assert.assertEquals(WhatLearnText.getText(), Constants.WHAT_LEARN_TEXT);
        Utils.waitForElementToLoad(1);
        this.SoftwareTestingButton.click();
        Assert.assertEquals(HomePageText.getText(), Constants.HOME_PAGE_TEXT);
    }
}
