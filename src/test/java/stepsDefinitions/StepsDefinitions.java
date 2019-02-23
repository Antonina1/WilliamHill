package stepsDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

import static pageObjects.BasePage.waitAndClick;
import static pageObjects.BasePage.waitAndEnterText;


public class StepsDefinitions {

    public WebDriverWait wait;
    public WebDriver wd;

    private TestBased testBased= new TestBased(System.getProperty("browser",BrowserType.CHROME));

    @Before
    public void init() {

        testBased.init();
    }


    @Given("^User logIn as user with login \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userLogInToWilliamHill(String login, String password) throws Exception {
       // wd.manage().deleteAllCookies();
        wd.get("http://sports.williamhill.com/betting/en-gb");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        LogInPage logInPage = PageFactory.initElements(wd, LogInPage.class);
        waitAndClick(logInPage.loginButton, wait);
        waitAndEnterText(logInPage.passwordField, password, wait);
        waitAndEnterText(logInPage.usernameField, login, wait);
        waitAndClick(logInPage.submitLogin, wait);

    }

    @Then("^User go to English Premier League events$")
    public void userGoToEnglishPremierLeagueEvents() throws InterruptedException {

        PageFactory.initElements(wd, HomePage.class);
        PageFactory.initElements(wd, Football.class);
        PageFactory.initElements(wd, FootballCompetitions.class);

        waitAndClick(HomePage.FootballFromAllSports, wait);
        waitAndClick(Football.competitions, wait);
        waitAndClick(FootballCompetitions.englishPremierLeagueCompetition, wait);
    }


    @After
    public void stop() {
        testBased.stop();
    }
}
