package com.example.demoqa_site.helpers;

import com.example.demoqa_site.driver.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementActions {

    private WebDriverWait getwait() {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(15));
    }

    public ElementActions waitElementToBeClickable(WebElement element) {
        getwait().until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions waitElementToBeVisible(WebElement element) {
        getwait().until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public ElementActions inputText(WebElement element, String text) {
        waitElementToBeVisible(element);
        element.clear();
        element.sendKeys(text);
        return this;
    }

    public ElementActions click(WebElement element) {
        waitElementToBeClickable(element);
        element.click();
        return this;
    }

    // Иногда demoqa перекрывает кнопку футером — тогда помогает JS-click
    public ElementActions jsClick(WebElement element) {
        waitElementToBeClickable(element);
        ((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", element);
        return this;
    }

    public String getText(WebElement element) {
        waitElementToBeVisible(element);
        return element.getText();
    }

    public boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
