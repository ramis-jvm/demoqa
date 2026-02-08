package com.example.demoqa_site.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage extends BasePage {

    public static final String URL = "https://demoqa.com/automation-practice-form";

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#firstName")
    private WebElement firstName;

    @FindBy(css = "#lastName")
    private WebElement lastName;

    @FindBy(css = "#userEmail")
    private WebElement userEmail;


    @FindBy(css = "label[for='gender-radio-1']")
    private WebElement genderMale;

    @FindBy(css = "label[for='gender-radio-2']")
    private WebElement genderFemale;

    @FindBy(css = "label[for='gender-radio-3']")
    private WebElement genderOther;

    @FindBy(css = "#userNumber")
    private WebElement userNumber;

    @FindBy(css = "#dateOfBirthInput")
    private WebElement dateOfBirth;

    @FindBy(css = "#subjectsInput")
    private WebElement subjectInput;

    @FindBy(css = "#submit")
    private WebElement submitBtn;

    public PracticeFormPage open() {
        driver.get(URL);
        return this;
    }

    public PracticeFormPage fillFirstName(String value) {
        elementActions.inputText(firstName, value);
        return this;
    }

    public PracticeFormPage fillLastName(String value) {
        elementActions.inputText(lastName, value);
        return this;
    }

    public PracticeFormPage fillEmail(String value) {
        elementActions.inputText(userEmail, value);
        return this;
    }

    public PracticeFormPage selectGenderMale() {
        elementActions.click(genderMale);
        return this;
    }

    public PracticeFormPage selectGenderFemale() {
        elementActions.click(genderFemale);
        return this;
    }

    public PracticeFormPage selectGenderOther() {
        elementActions.click(genderOther);
        return this;
    }

    public PracticeFormPage fillUserNumber(String value) {
        elementActions.inputText(userNumber, value);
        return this;
    }

    public PracticeFormPage fillDateOfBirth(String value) {
        elementActions.inputText(dateOfBirth, value);
        return this;
    }

    public PracticeFormPage addSubject(String subject) {
        elementActions.inputText(subjectInput, subject);
        subjectInput.sendKeys(Keys.ENTER);
        return this;
    }

    public PracticeFormPage clickSubmit() {
        elementActions.click(submitBtn);
        return this;
    }
}
