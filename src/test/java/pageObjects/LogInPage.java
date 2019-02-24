package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Tonya on 2/18/2019.
 */
public class LogInPage extends BasePage{
    public WebDriver wd;
    public WebDriverWait wait;

    @FindBy(xpath = "//a[@id='accountTabButton']//span[text()='Login']")
    public static WebElement loginButton;

    @FindBy(id = "loginUsernameInput")
    public static WebElement usernameField;

    @FindBy(id = "loginPasswordInput")
    public static WebElement passwordField;

    @FindBy(id = "loginButton")
    public static WebElement submitLogin;

    public LogInPage(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    public void login(String login, String Password) throws InterruptedException {
        waitAndClick(loginButton);
  //      logger.info("Opened LogIn form");
        Thread.sleep(1000);

        waitAndSendText(usernameField, login);
  //      logger.info("UserName is entered");
        Thread.sleep(1000);

        waitAndSendText(passwordField, Password);
 //       logger.info("Password is entered");
        Thread.sleep(1000);

        waitAndClick(submitLogin);
  //      logger.info("Clicked on Submit button");
        Thread.sleep(1000);

    }


}