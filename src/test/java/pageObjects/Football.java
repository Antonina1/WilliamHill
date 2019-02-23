package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

/**
 * Created by Tonya on 2/21/2019.
 */
public class Football extends BasePage  {

    public Football(WebDriver wd) {
        super(wd);
    }

    @FindBy(xpath = "//a[@href='/betting/en-gb/football/competitions']")
    public static WebElement competitions;


}

