package com.example.demoqa_site.pages.alertsFrameWindow;

import com.example.demoqa_site.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframePage extends BasePage {

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeading;

    public IframePage(WebDriver driver) {
        super(driver);
    }

    public String getSampleHeadingText(){
        return sampleHeading.getText();
    }


}
