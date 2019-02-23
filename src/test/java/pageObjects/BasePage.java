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

    public BasePage(WebDriver wd) {
        this.wd = wd;
    }


    public static void waitAndClick(WebElement element, WebDriverWait wait) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
        Thread.sleep(1000);
    }
    public static void waitAndEnterText(WebElement element, String text, WebDriverWait wait) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
        Thread.sleep(1000);
    }
    public static String waitAndGetText(WebElement element, WebDriverWait wait) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOf(element));
        String text = element.getText();
        Thread.sleep(1000);
        return text;
    }
}
