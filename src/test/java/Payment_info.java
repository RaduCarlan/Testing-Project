import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_info extends PageObject {

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement CardHolderName;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement CardNumber;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement CardCVC;

    @FindBy (xpath = "//*[@id=\"month\"]")
    private WebElement CardMonth;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/div/div[2]/select[1]/option[6]")
    private WebElement MonthSelect;

    @FindBy (xpath = "//*[@id=\"year\"]")
    private WebElement CardYear;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/div/div[2]/select[2]/option[12]")
    private WebElement YearSelect;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[1]/div/div[2]/img")
    private WebElement ClickRandom;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement NextButton3;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[1]")
    private WebElement PrevButtonPayment;


    public Payment_info (WebDriver driver) { super(driver); }

    public void CardHolderName(String input) { this.CardHolderName.sendKeys(input); }

    public void CardNumber(String input) { this.CardNumber.sendKeys(input); }

    public void CardCVC(String input) { this.CardCVC.sendKeys(input); }

    public void CardMonth() { this.CardMonth.click(); }

    public void MonthSelect() { this.MonthSelect.click();}

    public void CardYear() { this.CardYear.click(); }

    public void YearSelect() { this.YearSelect.click(); }

    public void ClickRandom() { this.ClickRandom.click(); }

    public void NextButton3() { this.NextButton3.click(); }

    public void PrevButtonPayment() { this.PrevButtonPayment.click();}

}
