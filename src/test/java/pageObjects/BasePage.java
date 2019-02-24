package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import java.util.NoSuchElementException;

/**
 * Created by Tonya on 2/18/2019.
 */
public class BasePage {

    public WebDriver wd;
 //   public WebDriverWait wait;
  //  public Logger logger;

    public BasePage(WebDriver wd) {
        this.wd = wd;
 //       this.wait = wait;
  //      this.logger = logger;
       // PageFactory.initElements(wd, this);
    }

        public void waitAndClick(WebElement element) throws InterruptedException {
            element.click();
            Thread.sleep(1000);
        }

    public void waitAndSendText(WebElement element, String text) throws InterruptedException {
        element.sendKeys(text);
       //Thread.sleep(1000);
    }
    public String waitAndRetrieveText(WebElement element) throws InterruptedException {
        String text = element.getText();
        Thread.sleep(1000);
        return text;
    }


}
