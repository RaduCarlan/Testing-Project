import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageTests {
    protected static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Verification menu buttons for navigating on the website")
        public void ClickMenuButtons() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickMenuButtons();
        Utils.waitForElementToLoad(1);
    }

    @Test(testName = "Select email tab and enter an email address")
    public void SelectTab() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.SelectEmail_tab();
        Utils.waitForElementToLoad(3);
    }

    @Test(testName = "Select email tab and click Submit button with no email address")
    public void ClickSubmit() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.AccesEmail_tab();
        Utils.waitForElementToLoad(3);
    }

    @Test(testName = "Select email tab and submit a valid email")
    public void SelectTabAndInsert() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        for (int i = 0; i< 2; i++) {
            webForm.SelectEmail_tab();
            webForm.AccesEmail_tab();
            Utils.waitForElementToLoad(1);
            driver.switchTo().alert().accept();
            Utils.waitForElementToLoad(1);
        }
    }

    @Test(testName = "Verification 'Read More' buttons from Hybrid")
    public void ClickHybridButton() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickHybridButton();
        Hybrid h = new Hybrid(driver);
        Assert.assertEquals(h.HybridPageText(), Constants.HYBRID_PAGE);
        Utils.waitForElementToLoad(1);

    }

    @Test(testName = "Verification 'Read More' buttons from Hybrid and return button")
        public void ClickHybridButtonReturn() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickHybridButton();
        Hybrid hybridInfo = new Hybrid(driver);
        Assert.assertEquals(hybridInfo.HybridPageText(), Constants.HYBRID_PAGE);
        Utils.waitForElementToLoad(1);
        hybridInfo.ClickReturnButton();
        Utils.waitForElementToLoad(1);
        Homepage homeText = new Homepage(driver);
        Assert.assertEquals(homeText.HomePageText(), Constants.HOME_PAGE_TEXT);
    }

    @Test(testName = "Select Read More from Learn The Fundamentals")
    public void ClickFundamentals() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickFundamentals();
        Utils.waitForElementToLoad(1);
        Fundamentals textFund = new Fundamentals(driver);
        Assert.assertEquals(textFund.FundText(), Constants.FUNDAM_TEXT);
    }

    @Test(testName = "Select Read More from Learn Selenium")
    public void ClickSelenium() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickSelenium();
        Utils.waitForElementToLoad(1);

        Selenium selenium = new Selenium(driver);
        Assert.assertEquals(selenium.getTextSelenium(), Constants.SELENIUM_PAGE);
        Utils.waitForElementToLoad(1);
    }

    @Test(testName = "Verify Frequently Asked Questions tab function")
    public void QuestionsTab() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickQuestionsTab();
        Utils.waitForElementToLoad(1);
    }

    @Test(testName = "Verify Jane facebook button")
    public void JaneFacebook() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickJaneFacebook();
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
    }

    @Test(testName = "Verify Sara instagram button")
    public void SaraInstagram() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickSaraInstagram();
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(driver.getTitle(), "Instagram");
    }

    @Test(testName = "Verification Enrollment email from the Contact info section")
    public void ContactInfoSection() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        Assert.assertEquals(webForm.VerifyEnrollmentEmail(),Constants.CONTACT_INFO);
    }

    @Test(testName = "Verification the 'go to top' button")
    public void ClickGoUpButton() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickGoTop();
        Assert.assertEquals(webForm.HomePageText(), Constants.HOME_PAGE_TEXT);
        Utils.waitForElementToLoad(1);
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
