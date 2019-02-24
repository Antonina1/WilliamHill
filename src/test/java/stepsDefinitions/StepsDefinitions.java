package stepsDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.decimal4j.util.DoubleRounder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pageObjects.*;

import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class StepsDefinitions {


    private WebDriver wd;

    public StepsDefinitions() throws InterruptedException {
    }

    @Before
    public void init() {
        // Select ChromeDriver for your OS
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")){
            System.setProperty("webdriver.chrome.driver", "chromedriver");}
        else {System.setProperty("webdriver.chrome.driver", "chromedriver.exe");}
    }

    @Given("^User open WilliamHill Page from \\\"([^\\\"]*)\\\"$")
    public void openWilliamHillPage(String device) {

        // logic for running on desktop or on Mobile depends on <device>
        if (device.equals("desktop")) {
            wd = new ChromeDriver();
            wd.manage().deleteAllCookies();
            wd.manage().window().maximize();

        }
        else if (device.equals("mobile")) {

            Map<String, String> mobileEmulation = new HashMap<String, String>();
            mobileEmulation.put("deviceName", "iPhone 7");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            wd = new ChromeDriver(chromeOptions);
            wd.manage().deleteAllCookies();
            wd.manage().window().maximize();

        }
        wd.get("https://sports.williamhill.com/betting/en-gb");

    }

    @When("^User logIn as user with login as \\\"([^\\\"]*)\\\" and password as \\\"([^\\\"]*)\\\"$")
    public void userLogInToWilliamHill(String login, String password) throws Exception {
        LogInPage logInPage= new LogInPage(wd);
        logInPage.login(login,password);
        Thread.sleep(1000);

    }

    @And("^User go to page English Premier League events$")
    public void UserGoToEnglishPremierLeagueEvents() throws InterruptedException {
        HomePage homePage = new HomePage(wd);
        Football football= new Football(wd);
        FootballCompetitions footballCompetitions= new FootballCompetitions(wd);

        homePage.OpenOddsForm();
        Thread.sleep(1000);
        homePage.SelectDecimalFormat();
        Thread.sleep(1000);
        homePage.OpenFootballPage();
        Thread.sleep(1000);
        football.OpenFootballCompetitionsPage();
        Thread.sleep(1000);
        footballCompetitions.OpenEnglishPremierLeagueCompetition();

    }

    @Then("^User place a bet \"([^\"]*)\" for home team to 'Win'$")
    public void userPlaceBetForHomeTeamToWin(String bet) throws Exception {
        EnglComp englComp= new EnglComp(wd);
        BetSlip betSlip= new BetSlip(wd);
        Thread.sleep(1000);
        englComp.SelectFirstActiveEvent();
        Thread.sleep(10000);
        englComp.SelectHomeOdds();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        betSlip.enterBet(bet);

    }

        @And("^User see returns based on bet \"([^\"]*)\" and odds$")
        public void userSeeReturnStakeAndTotalStake(String bet) throws Exception {

            EnglComp englComp= new EnglComp(wd);
            BetSlip betSlip= new BetSlip(wd);
            Double odds =Double.parseDouble(englComp.homeTeamOdds.getText());

            Double actualTotalStake = Double.parseDouble(betSlip.TotalStake());
            Double expectedTotalStake = Double.parseDouble(bet);

            Double actualReturnStake = (Double.parseDouble(betSlip.ReturnStake()));
            Double expectedReturnStake = DoubleRounder.round((Double.parseDouble(bet)* odds),2, RoundingMode.DOWN);

            Assert.assertEquals(actualTotalStake, expectedTotalStake);
            Assert.assertEquals(actualReturnStake, expectedReturnStake);
    }

    @After
    public void stop() {
        wd.quit();
    }

}
