package com.example.demoqa_site.tests;

import com.example.demoqa_site.base.BaseTest;
import com.example.demoqa_site.pages.TextBoxPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextBoxPageTest extends BaseTest {



    @Test
    void fillForm_and_checkOutput() {
        TextBoxPage page = new TextBoxPage(driver)
                .open()
                .fillUserName("Ramis")
                .fillUserEmail("ramis@test.com")
                .fillCurrentAddress("Bishkek")
                .fillPermanentAddress("Bali")
                .submit();

        assertTrue(page.isOutputDisplayed());
        assertTrue(page.getOutputNameText().contains("Ramis"));
        assertTrue(page.getOutputEmailText().contains("ramis@test.com"));
    }
}
