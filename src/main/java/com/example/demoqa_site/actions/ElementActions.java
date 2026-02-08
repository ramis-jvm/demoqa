package com.example.demoqa_site.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementActions {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;

    public ElementActions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public ElementActions waitVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public ElementActions waitClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions scrollTo(WebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", element);
        return this;
    }

    public ElementActions click(WebElement element) {
        try {
            scrollTo(element);
            waitClickable(element);
            element.click();
        } catch (ElementNotInteractableException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
        return this;
    }

    public ElementActions inputText(WebElement element, String text) {
        scrollTo(element);
        waitVisible(element);
        element.clear();
        element.sendKeys(text);
        return this;
    }

    public ElementActions typeAndEnter(WebElement element, String text) {
        inputText(element, text);
        element.sendKeys(Keys.ENTER);
        return this;
    }

    public boolean isDisplayed(WebElement element) {
        try {
            waitVisible(element);
            return element.isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public String getText(WebElement element) {
        waitVisible(element);
        return element.getText();
    }

    public ElementActions doubleClick(WebElement element) {
        waitVisible(element);
        waitClickable(element);
        actions.doubleClick(element).perform();
        return this;
    }

    public ElementActions rightClick(WebElement element) {
        waitVisible(element);
        waitClickable(element);
        actions.contextClick(element).perform();
        return this;
    }

    public ElementActions clickMe(WebElement element) {
        waitVisible(element);
        waitClickable(element);
        actions.click(element).perform();
        return this;
    }
}
