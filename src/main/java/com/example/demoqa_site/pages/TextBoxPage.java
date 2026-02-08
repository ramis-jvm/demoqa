package com.example.demoqa_site.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }


    private static final String URL = "https://demoqa.com/text-box";

    @FindBy(id = "userName")
    private WebElement userNameInput;

    @FindBy(id = "userEmail")
    private WebElement userEmailInput;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressInput;

    @FindBy(id = "submit")
    private WebElement submitBtn;

    @FindBy(id = "output")
    private WebElement outputBlock;

    @FindBy(id = "name")
    private WebElement outputName;

    @FindBy(id = "email")
    private WebElement outputEmail;

    public TextBoxPage open() {
        com.example.demoqa_site.driver.DriverFactory.getDriver().get(URL);
        return this;
    }

    public TextBoxPage fillUserName(String userName) {
        elementActions.inputText(userNameInput, userName);
        return this;
    }

    public TextBoxPage fillUserEmail(String userEmail) {
        elementActions.inputText(userEmailInput, userEmail);
        return this;
    }

    public TextBoxPage fillCurrentAddress(String currentAddress) {
        elementActions.inputText(currentAddressInput, currentAddress);
        return this;
    }

    public TextBoxPage fillPermanentAddress(String permanentAddress) {
        elementActions.inputText(permanentAddressInput, permanentAddress);
        return this;
    }

    public TextBoxPage submit() {
        // обычный клик
        elementActions.click(submitBtn);
        // если иногда не кликается — замени строку выше на:
        // elementActions.jsClick(submitBtn);
        return this;
    }

    public boolean isOutputDisplayed() {
        return elementActions.isDisplayed(outputBlock);
    }

    public String getOutputNameText() {
        return elementActions.getText(outputName);
    }

    public String getOutputEmailText() {
        return elementActions.getText(outputEmail);
    }
}
