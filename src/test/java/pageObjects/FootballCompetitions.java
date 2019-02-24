package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tonya on 2/21/2019.
 */
public class FootballCompetitions extends BasePage {

    @FindBy(xpath = "//span[@class='grid-item__content___2XHih']/span[.='English Premier League']")
    public static WebElement englishPremierLeagueCompetition;

    public FootballCompetitions(WebDriver wd) {
        super(wd);

        PageFactory.initElements(wd, this);
    }

    public void OpenEnglishPremierLeagueCompetition() throws InterruptedException {
        waitAndClick(englishPremierLeagueCompetition);
        Thread.sleep(1000);
    }


}
