package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tonya on 2/18/2019.
 */

public class HomePage extends BasePage {

    @FindBy(xpath = "(//*[@id='nav-football'])[1]")
    public static WebElement FootballFrom;

    @FindBy(className = "account-tab__text -account")
    public static WebElement AccountForm;

    @FindBy(xpath = "//span[contains(@class,'-account')]")
    public static WebElement AccountBalance;

    @FindBy(xpath = "(//ul[@class='betslip-navigation__menu']/li/a)[1]")
    public static WebElement BetSlipForm;

    @FindBy(xpath = ("//a[@data-toggle-send='odds-format']"))
    public static WebElement OddsForm;

    @FindBy(xpath = ("(//a[@data-odds-format='decimal'])[1]"))
    public static WebElement DecimalFormat;


    public HomePage(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    public void OpenFootballPage() throws InterruptedException {
        waitAndClick(FootballFrom);
        Thread.sleep(1000);
    }

    public void OpenOddsForm() throws InterruptedException {
        waitAndClick(OddsForm);
        Thread.sleep(1000);
    }

    public void SelectDecimalFormat() throws InterruptedException {
        waitAndClick(DecimalFormat);
        Thread.sleep(1000);
    }

}
