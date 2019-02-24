package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Tonya on 2/18/2019.
 */
public class BasePage {

    public WebDriver wd;

    public BasePage(WebDriver wd) {
        this.wd = wd;
    }

    public void waitAndClick(WebElement element) throws InterruptedException {
        element.click();
        Thread.sleep(1000);
    }

    public void waitAndSendText(WebElement element, String text) throws InterruptedException {
        element.sendKeys(text);
    }

    public String waitAndRetrieveText(WebElement element) throws InterruptedException {
        String text = element.getText();
        Thread.sleep(1000);
        return text;
    }


}
