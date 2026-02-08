package com.example.demoqa_site.base;

import com.example.demoqa_site.driver.DriverFactory;
import com.example.demoqa_site.pages.ButtonsPage;
import com.example.demoqa_site.pages.PracticeFormPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected PracticeFormPage page;

    protected static WebDriver driver;
    protected  static ButtonsPage buttonsPage;


    @BeforeAll
    static void setUp() {
        driver = DriverFactory.getDriver();
    }

    @AfterAll
    static void tearDown() {
        DriverFactory.quitDriver();
    }
}
