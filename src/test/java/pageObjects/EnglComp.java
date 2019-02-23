package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Tonya on 2/21/2019.
 */
public class EnglComp {

    @FindBy(xpath = "(//article[@class='sp-o-market sp-o-market--default'])[1]/main")
    public static WebElement FistActiveEvent;

    @FindBy(xpath = "(//div[@class='btmarket__selection'])[1]/button")
    public static WebElement homeTeamOdds;

    @FindBy(xpath = "(//div[@class='btmarket__selection'])[2]/button")
    public static WebElement drawTeamOdds;

    @FindBy(xpath = "(//div[@class='btmarket__selection'])[3]/button")
    public static WebElement awayTeamOdds;



}
