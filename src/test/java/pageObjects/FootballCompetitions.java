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
public class FootballCompetitions extends BasePage{

    @FindBy(xpath = "//span[@class='grid-item__content___2XHih']/span[.='English Premier League']")
    public static WebElement englishPremierLeagueCompetition;


    public FootballCompetitions(WebDriver wd, WebDriverWait wait, Logger logger) {
        super(wd, wait, logger);
        PageFactory.initElements(wd, this);
        logger.info("Football form is opened");
    }

    public void OpenEnglishPremierLeagueCompetition() {
        waitAndClick(englishPremierLeagueCompetition);
        logger.info("Competitions form is opened");
    }



}
