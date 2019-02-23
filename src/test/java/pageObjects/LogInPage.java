package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

/**
 * Created by Tonya on 2/18/2019.
 */
public class LogInPage extends BasePage{
    public WebDriver wd;
    public WebDriverWait wait;

    @FindBy(className = "account-tab__text -login")
    public static WebElement loginButton;

    @FindBy(id = "loginUsernameInput")
    public static WebElement usernameField;

    @FindBy(id = "loginPasswordInput")
    public static WebElement passwordField;

    @FindBy(id = "loginButton")
    public static WebElement submitLogin;

    public LogInPage(WebDriver wd, WebDriverWait wait, Logger logger) {
        super(wd,wait,logger);
        PageFactory.initElements(wd, this);
        logger.info("Login is successfully performed");
    }

    public void login(String username, String Password) throws Exception {
        waitAndClick(loginButton);
        logger.info("Opened LogIn form");

        waitAndSendText(usernameField, username);
        logger.info("UserName is entered");

        waitAndSendText(passwordField, Password);
        logger.info("Password is entered");

        waitAndClick(submitLogin);
        logger.info("Clicked on Submit button");

    }


}