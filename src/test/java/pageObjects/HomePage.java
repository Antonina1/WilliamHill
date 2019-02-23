package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

/**
 * Created by Tonya on 2/18/2019.
 */

public class HomePage extends BasePage {

    @FindBy(xpath = "(//a[@title='Football'])[2]")
    public static WebElement FootballFromAllSports;

    @FindBy(className = "account-tab__text -account")
    public static WebElement AccountForm;

    @FindBy(xpath = "//span[contains(@class,'-account')]")
    public static WebElement AccountBalance;

    @FindBy(xpath ="(//ul[@class='betslip-navigation__menu']/li/a)[1]")
    public static WebElement BetSlipForm;


    public HomePage(WebDriver wd, WebDriverWait wait, Logger logger) {
        super(wd, wait, logger);
        PageFactory.initElements(wd, this);
        logger.info("Login is successfully performed");
    }
    public void OpenFootballPage() {
        waitAndClick(FootballFromAllSports);
        logger.info("Football form is opened");
    }

}
