import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NavigateToPage {
    public WebDriver driver;

    public NavigateToPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }

    enum Pages {
        Personal_Information,
        Contact_Information,
        Course_Option,
        Payment_Information,
        Success
    }

    public void NavigateToPage(Pages page) {
        switch (page) {
            case Personal_Information -> NavigateToPersonalInformation();
            case Contact_Information -> NavigateToContactInformation();
            case Course_Option -> NavigateToCourseOptiontion();
            case Payment_Information -> NavigateToPaymentInformation();
            case Success -> FillInSuccessPage();
        }
    }

    public void NavigateToPersonalInformation() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.StartTheEnrollment_button();
    }

    public void NavigateToContactInformation() {
        NavigateToPersonalInformation();
        Personal_Info webForm1 = new Personal_Info(driver);
        webForm1.SelectFirstName(Constants.VALID_TEST_TEXT_INPUT);
        webForm1.SelectLastName(Constants.VALID_TEST_TEXT_INPUT);
        webForm1.SelectUsername(Constants.VALID_TEST_TEXT_INPUT);
        webForm1.SelectPassword(Constants.VALID_TEST_NUMBER_INPUT);
        webForm1.SelectConPassword(Constants.VALID_TEST_NUMBER_INPUT);
        webForm1.nextButton();
    }

    public void NavigateToCourseOptiontion() {
        NavigateToContactInformation();
        Contact_Info webForm2 = new Contact_Info(driver);
        webForm2.SelectEmail(Constants.VALID_TEST_TEXT_INPUT);
        webForm2.SelectPhone(Constants.VALID_TEST_NUMBER_INPUT);
        webForm2.SelectCountry(Constants.VALID_TEST_TEXT_INPUT);
        webForm2.SelectCity(Constants.VALID_TEST_TEXT_INPUT);
        webForm2.SelectPostCode(Constants.VALID_TEST_NUMBER_INPUT);
        webForm2.nextButton2();
    }

    public void NavigateToPaymentInformation() {
        NavigateToCourseOptiontion();
        Course_opt webForm3 = new Course_opt(driver);
        webForm3.SelectSoftwareTesting();
        webForm3.nextButton3();

    }

    public void FillInSuccessPage() {
        NavigateToPaymentInformation();

        Payment_info webForm4 = new Payment_info(driver);
        webForm4.CardHolderName(Constants.VALID_CARD_HOLDER_INPUT);
        webForm4.CardNumber(Constants.VALID_CARD_NUMBER_INPUT);
        webForm4.CardCVC(Constants.VALID_CVC_INPUT);
        webForm4.CardMonth();
        webForm4.MonthSelect();
        webForm4.CardYear();
        webForm4.YearSelect();
        webForm4.ClickRandom();
        webForm4.NextButton3();

        Success webForm5 = new Success(driver);
        webForm5.ReturnHome();
    }
}
