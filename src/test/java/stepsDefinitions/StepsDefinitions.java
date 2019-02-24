package stepsDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.decimal4j.util.DoubleRounder;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.*;

import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class StepsDefinitions {


  //  TestBased testBased= new TestBased(System.getProperty("browser",BrowserType.CHROME));

    private WebDriver wd;
    private String deviceGiven;
    private WebDriverWait wait;

    public StepsDefinitions() throws InterruptedException {
    }

    @Before
    public void init() {
        // Choosing ChromeDriver for your OS
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")){
            System.setProperty("webdriver.chrome.driver", "chromedriver");}
        else {System.setProperty("webdriver.chrome.driver", "chromedriver.exe");}
    }

    @Given("^User open WilliamHill Page from \\\"([^\\\"]*)\\\"$")
    public void openWilliamHillPage(String device) {
     //   wd = wd;
    //    wait = new WebDriverWait(wd, 15);

        // Logic for running on DesKtop or on Mobile (using emulation)
        if (device.equals("desktop")) {
            wd = new ChromeDriver();
            wd.manage().deleteAllCookies();
            wd.manage().window().maximize();
            wait = new WebDriverWait(wd, 15);

            deviceGiven = device;
        }
        else if (device.equals("mobile")) {

            Map<String, String> mobileEmulation = new HashMap<String, String>();
            mobileEmulation.put("deviceName", "iPhone 7");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            wd = new ChromeDriver(chromeOptions);
            wd.manage().deleteAllCookies();
            wd.manage().window().maximize();
            wait = new WebDriverWait(wd, 15);

            deviceGiven = device;
        }
        wd.get("https://sports.williamhill.com/betting/en-gb");
 //       wait = new WebDriverWait(wd, 60);
 //       wd.manage().deleteAllCookies();
 //       wd.manage().window().maximize();
 //       wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
        //Thread.sleep(10000);
      //  wait.until((ExpectedCondition<Boolean>) wd -> (betSlip.inputTextBetSlip.isEnabled()));
       // wait.until(ExpectedConditions.elementToBeClickable(betSlip.inputTextBetSlip));
       // Thread.sleep(10000);
        betSlip.enterBet(bet);

    }

        @And("^User see returns based on bet \"([^\"]*)\" and odds$")
        public void userSeeReturnStakeAndTotalStake(String bet) throws Exception {

            EnglComp englComp= new EnglComp(wd);
            BetSlip betSlip= new BetSlip(wd);
            Double odds =Double.parseDouble(englComp.homeTeamOdds.getText());

            Double actualTotalStake = Double.parseDouble(betSlip.TotalStake());
            Double expectedTotalStake = Double.parseDouble(bet);

            System.out.println("bet oooods " +bet);
            System.out.println("aaactual actualTotalStake "+ actualTotalStake);
            System.out.println("expected yyeee expectedTotalStake " +expectedTotalStake);


            Double actualReturnStake = (Double.parseDouble(betSlip.ReturnStake()));
            Double expectedReturnStake = DoubleRounder.round((Double.parseDouble(bet)* odds),2, RoundingMode.DOWN);
            System.out.println("oooods " +odds);
            System.out.println("aaactual "+ actualReturnStake);
            System.out.println("expected yyeee  " +expectedReturnStake);


            //SoftAssert softAssert = new SoftAssert();
            Assert.assertEquals(actualTotalStake, expectedTotalStake);
            Assert.assertEquals(actualReturnStake, expectedReturnStake);
    }

    @After
    public void stop() {
 //       wd.quit();
    }

}
