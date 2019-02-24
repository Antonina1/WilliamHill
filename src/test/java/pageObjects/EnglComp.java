package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;

/**
 * Created by Tonya on 2/21/2019.
 */
public class EnglComp extends BasePage{

    public EnglComp(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
        //       logger.info("Football form is opened");
    }

    @FindBy(xpath = "(//article[@class='sp-o-market sp-o-market--default'])[1]/main/a")
    public static WebElement FistActiveEvent;

    @FindBy(xpath = "(//div[@class='btmarket__selection'])[1]/button")
    public WebElement homeTeamOdds;

    @FindBy(xpath = "(//div[@class='btmarket__selection'])[2]/button")
    public static WebElement drawTeamOdds;

    @FindBy(xpath = "(//div[@class='btmarket__selection'])[3]/button")
    public static WebElement awayTeamOdds;

    WebDriverWait wait;

    public void SelectFirstActiveEvent() throws InterruptedException {
        // wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(1000);
        waitAndClick(FistActiveEvent);
        Thread.sleep(1000);
    }

    public void SelectHomeOdds() throws InterruptedException {
        // wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     //   wait.until(ExpectedConditions.elementToBeClickable(homeTeamOdds));
            waitAndClick(homeTeamOdds);
            Thread.sleep(1000);

    }

}
