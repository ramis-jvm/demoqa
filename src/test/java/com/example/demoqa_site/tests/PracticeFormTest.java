package com.example.demoqa_site.tests;

import com.example.demoqa_site.base.BaseTest;
import com.example.demoqa_site.pages.PracticeFormPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeFormTest extends BaseTest {

    @Test
    void shouldSubmitPracticeFormWithRequiredFields() {


        page.open()
                .fillFirstName("Ramis")
                .fillLastName("Almazbekov")
                .selectGenderMale()
                .fillUserNumber("7001234564464")
                .clickSubmit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String title = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("example-modal-sizes-title-lg"))
        ).getText();

        assertEquals("Thanks for submitting the form", title);
    }
}
