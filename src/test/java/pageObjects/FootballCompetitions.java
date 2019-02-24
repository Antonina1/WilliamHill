package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tonya on 2/21/2019.
 */
public class FootballCompetitions extends BasePage{

    @FindBy(xpath = "//span[@class='grid-item__content___2XHih']/span[.='English Premier League']")
    public static WebElement englishPremierLeagueCompetition;


    public FootballCompetitions(WebDriver wd) {
        super(wd);

        PageFactory.initElements(wd, this);
 //       logger.info("Football form is opened");
    }

    public void OpenEnglishPremierLeagueCompetition() throws InterruptedException {
     //   wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        waitAndClick(englishPremierLeagueCompetition);
        Thread.sleep(1000);
  //      logger.info("Competitions form is opened");
    }



}
