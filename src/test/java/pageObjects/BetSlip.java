package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Tonya on 2/18/2019.
 */
public class BetSlip extends BasePage {

    @FindBy(how = How.XPATH, using = "//input[contains(@class, 'betslip-selection__stake-input')]")
    public WebElement inputTextBetSlip;

    @FindBy(how = How.ID, using = "total-to-return-price")
    public static WebElement toReturn;

    @FindBy(id = "total-stake-price")
    public static WebElement totalStake;


    public BetSlip(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    public void enterBet(String bet) throws Exception {
        waitAndSendText(inputTextBetSlip, bet);
        Thread.sleep(1000);
    }

    public String ReturnStake() throws Exception{

        String returnStake = toReturn.getText();
        return returnStake;
    }

    public String TotalStake() throws Exception{

        String totalSt = totalStake.getText();
        return totalSt;
    }

}

