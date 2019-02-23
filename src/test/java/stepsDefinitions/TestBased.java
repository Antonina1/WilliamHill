package stepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tonya on 2/17/2019.
 */

public class TestBased {

    private String browser;
    WebDriver wd;

    public TestBased(String browser) {
        this.browser = browser;
    }

    @BeforeSuite
    public void init() {
        if (browser == BrowserType.FIREFOX) {
            wd = new FirefoxDriver();
        }else if(browser == BrowserType.CHROME){
            wd = new ChromeDriver();
        }else if (browser == BrowserType.IE){
            wd = new InternetExplorerDriver();
        } else if (browser == BrowserType.ANDROID){
            wd = new InternetExplorerDriver();
        }
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        System.out.printf("yyyyeeeeee");

    }

    @AfterSuite
        public void stop() {
            wd.quit();
        }


}
