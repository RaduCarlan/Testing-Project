import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EnrollmentPageTests {
    protected static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Click button for Start The Enrollment")
    public void ClickButton() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.StartTheEnrollment_button();

        Enrollment textForm = new Enrollment(driver);
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(textForm.getTextSign(), Constants.SIGN_UP_HEADER);
    }

    @Test(testName = "Click next button on Enrollment page with no data")
    public void ClickNextEnrollment() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.StartTheEnrollment_button();
        Utils.waitForElementToLoad(1);

        Enrollment clickForm = new Enrollment(driver);
        clickForm.nextButton();
        Utils.waitForElementToLoad(2);
    }

    @Test(testName = "Complete all data on Enrollment pages with correct information")
    public void CompleteEnrollmentAll() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        Utils.waitForElementToLoad(1);
        webForm.StartTheEnrollment_button();

        Personal_Info webForm1 = new Personal_Info(driver);
        webForm1.SelectFirstName(Constants.VALID_FIRST_NAME_INPUT);
        Utils.waitForElementToLoad(1);
        webForm1.SelectLastName(Constants.VALID_LAST_NAME_INPUT);
        Utils.waitForElementToLoad(1);
        webForm1.SelectUsername(Constants.VALID_USER_NAME_INPUT);
        Utils.waitForElementToLoad(1);
        webForm1.SelectPassword(Constants.VALID_PASSORD_INPUT);
        Utils.waitForElementToLoad(1);
        webForm1.SelectConPassword(Constants.VALID_CON_PASSWORD_INPUT);
        Utils.waitForElementToLoad(1);
        webForm1.nextButton();

        Contact_Info webForm2 = new Contact_Info(driver);
        webForm2.SelectEmail(Constants.VALID_EMAIL_INPUT);
        Utils.waitForElementToLoad(1);
        webForm2.SelectPhone(Constants.VALID_PHONE_INPUT);
        Utils.waitForElementToLoad(1);
        webForm2.SelectCountry(Constants.VALID_COUNTRY_INPUT);
        Utils.waitForElementToLoad(1);
        webForm2.SelectCity(Constants.VALID_CITY_INPUT);
        Utils.waitForElementToLoad(1);
        webForm2.SelectPostCode(Constants.VALID_POST_COD_INPUT);
        Utils.waitForElementToLoad(1);
        webForm2.nextButton2();

        Course_opt webForm3 = new Course_opt(driver);
        webForm3.SelectSoftwareTesting();
        Utils.waitForElementToLoad(1);
        webForm3.nextButton3();
        Utils.waitForElementToLoad(1);

        Payment_info webForm4 = new Payment_info(driver);
        webForm4.CardHolderName(Constants.VALID_CARD_HOLDER_INPUT);
        Utils.waitForElementToLoad(1);
        webForm4.CardNumber(Constants.VALID_CARD_NUMBER_INPUT);
        Utils.waitForElementToLoad(1);
        webForm4.CardCVC(Constants.VALID_CVC_INPUT);
        Utils.waitForElementToLoad(1);
        webForm4.CardMonth();
        webForm4.MonthSelect();
        Utils.waitForElementToLoad(1);
        webForm4.CardYear();
        webForm4.YearSelect();
        Utils.waitForElementToLoad(1);
        webForm4.ClickRandom();
        Utils.waitForElementToLoad(1);
        webForm4.NextButton3();
        Utils.waitForElementToLoad(2);
    }

    @Test(testName = "Verification all enrollment pages")
    public void CompleteAllPagesEnrollment(){
        driver.get(Utils.BASE_URL);
        NavigateToPage navigation = new NavigateToPage(driver);
        navigation.NavigateToPage(NavigateToPage.Pages.Success);
        Utils.waitForElementToLoad(3);
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
