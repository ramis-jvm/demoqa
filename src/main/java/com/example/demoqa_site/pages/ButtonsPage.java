package com.example.demoqa_site.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#doubleClickBtn")
    WebElement doubleCLickBtn;

    @FindBy(css = "#rightClickBtn")
    WebElement rightClickBtn;

    @FindBy(xpath = "//button[text()  = 'Click Me']")
    WebElement clickMeBtn;


    public ButtonsPage doubleClick() {
        elementActions.doubleClick(doubleCLickBtn);
        return this;
    }

    public ButtonsPage rightClick() {
        elementActions.rightClick(rightClickBtn);
        return this;
    }

    public ButtonsPage clickMe() {
        elementActions.clickMe(clickMeBtn);
        return this;
    }
}
