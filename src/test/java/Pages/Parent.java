package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parent {

    WebDriver driver;
    WebDriverWait wait;


    public Parent() {

        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,10);
    }


    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        //scrollToElement();
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        //scrollToElement();
        element.clear();
        element.sendKeys(value);
    }



    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

