package com.example.demoqa_site.tests;

import com.example.demoqa_site.base.BaseTest;
import com.example.demoqa_site.pages.ButtonsPage;
import org.junit.jupiter.api.Test;

public class ButtonsPageTest extends BaseTest {
    @Test
    void buttonsPageTest() {
        driver.get("https://demoqa.com/buttons");
        buttonsPage = new ButtonsPage(driver);
        buttonsPage.doubleClick();
        buttonsPage.rightClick();
        buttonsPage.clickMe();

    }
}
