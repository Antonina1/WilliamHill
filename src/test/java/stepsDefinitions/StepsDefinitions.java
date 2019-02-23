package stepsDefinitions;


        import cucumber.api.java.After;
        import cucumber.api.java.Before;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
   //     import org.decimal4j.util.DoubleRounder;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.ie.InternetExplorerDriver;
        import org.openqa.selenium.remote.BrowserType;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.math.RoundingMode;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.concurrent.TimeUnit;

        import org.testng.log4testng.Logger;
        import pageObjects.BasePage;
        import pageObjects.LogInPage;
        import pageObjects.HomePage;
        import pageObjects.Football;
        import pageObjects.FootballCompetitions;
        import pageObjects.EnglComp;
        import pageObjects.BetSlip;

        import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;



public class StepsDefinitions {

    public WebDriver driver;
    public WebDriverWait wait;
    public Logger logger;

    // Quick approach to use such variables to pass them from one method to another
    String odds;
    String betGiven;
    String deviceGiven;

  //  private TestBased testBased;

    TestBased testBased= new TestBased(System.getProperty("browser",BrowserType.CHROME));

    private LogInPage logInPage;
    private HomePage homePage;
    private Football football;
    private FootballCompetitions footballCompetitions;
    private EnglComp englComp;
    private BetSlip betSlip;

    WebDriver wd;


    @Before
    public void init() {

        testBased.init();
    }

    @After
    public void stop() {
        testBased.stop();
    }

  /*  @Given("^User open WilliamHill Page \"([^\"]*)\"$")
    public void openWilliamHillPage(String url) {
        testBased.wd.get("http://sports.williamhill.com/betting/en-gb");
    }*/

    @When("^User logIn as user with login \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLogInToWilliamHill(String login, String password) throws Exception {
        LogInPage logInPage= new LogInPage(wd,wait,logger);
        logInPage.login(login,password);

    }

    @Then("^User go to English Premier League events$")
    public void iGoToEnglishPremierLeagueEvents()  {
        homePage.OpenFootballPage();
        football.OpenFootballCompetitionsPage();
        footballCompetitions.OpenEnglishPremierLeagueCompetition();

    }

}
