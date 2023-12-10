package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import  static  org.testng.Assert.*;

public class T2_iframe extends TestBase {
          /*
    1- Open a chrome browser
    2- Go to: https://loopcamp.vercel.app/iframe.html
    3- Clear text from comment body
    4- Type "Loop Academy" in comment body
    5- Verify "Loop Academy" text is written in comment body
    6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed

     */

    @Test
    public void iframeTest() {
        driver.get("https://loopcamp.vercel.app/iframe.html");
        ;
//        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")); // by xpath
//        driver.switchTo().frame(iframe);

        // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        // driver.switchTo().frame("mce_0_ifr");  // by id or name
        driver.switchTo().frame(0); // by index

        WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
        textBox.clear();
        textBox.sendKeys("Loop Academy");
        driver.switchTo().defaultContent(); // will take us directly to the main html
        // driver.switchTo().parentFrame(); // this will take us to the parent frame
        //WebElement poweredBy = driver.findElement(By.xpath("//div[text()='Powered by ']"));

        WebElement heading = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame containing')]"));
        String actual = heading.getText();
        String expected = "An iFrame containing the TinyMCE WYSIWYG Editor";
        assertEquals(actual, expected, "actual does not match expected");

    }


    }
