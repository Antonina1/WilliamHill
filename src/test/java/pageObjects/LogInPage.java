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

    public LogInPage(WebDriver wd) {
        super(wd);
    }
    @FindBy(xpath = "//a[@id='accountTabButton']//span[text()='Login']")
    public static WebElement loginButton;

    @FindBy(id = "loginUsernameInput")
    public static WebElement usernameField;

    @FindBy(id = "loginPasswordInput")
    public static WebElement passwordField;

    @FindBy(id = "loginButton")
    public static WebElement submitLogin;


}