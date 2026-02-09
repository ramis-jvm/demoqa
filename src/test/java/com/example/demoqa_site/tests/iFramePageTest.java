package com.example.demoqa_site.tests;

import com.example.demoqa_site.base.BaseTest;
import org.junit.jupiter.api.Test;

public class iFramePageTest extends BaseTest {

    @Test
    void iframeTest(){
        driver.get("https://demoqa.com/frames");
        iframeHelper.switchToFrame("frame1");
        String txt = iframePage.getSampleHeadingText();
        System.out.println(txt);

        driver.get("https://demoqa.com/frames");
        iframeHelper.switchToFrame("frame2");
        String txt2 = iframePage.getSampleHeadingText();
        System.out.println(txt2);
    }
}
