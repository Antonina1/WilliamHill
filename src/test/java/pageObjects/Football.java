package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tonya on 2/21/2019.
 */
public class Football extends BasePage {
    public WebDriver wd;

    public Football(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    @FindBy(id = "nav-football-competitions")
    public static WebElement competitions;

    public void OpenFootballCompetitionsPage() throws InterruptedException {
        waitAndClick(competitions);
        Thread.sleep(1000);
    }

}

