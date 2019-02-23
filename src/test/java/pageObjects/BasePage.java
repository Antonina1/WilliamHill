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
    public WebDriverWait wait;
    public Logger logger;

    public BasePage(WebDriver wd, WebDriverWait wait, Logger logger) {
        this.wd = wd;
        this.wait = wait;
        this.logger = logger;
        PageFactory.initElements(wd, this);
    }

    public void waitAndClick(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public void waitAndSendText(WebElement webElement, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
        webElement.clear();
        webElement.sendKeys(text);
    }


    public boolean isWebElementDisplayed(WebElement webElement) {
        try {
            webElement.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}