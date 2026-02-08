package com.example.demoqa_site.pages;

import com.example.demoqa_site.actions.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    protected ElementActions elementActions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.elementActions = new ElementActions(driver);
        PageFactory.initElements(driver, this);
    }
}
