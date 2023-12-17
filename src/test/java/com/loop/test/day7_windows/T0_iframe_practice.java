package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T0_iframe_practice extends TestBase {
 /*
    go to https://loopcamp.vercel.app/nested-frames.html
    validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"

     */

    @Test
    public void left () {
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement left = driver.findElement(By.xpath("//*[contains(text(), 'LEFT')]"));
        String actual = left.getText();

//        driver.switchTo().defaultContent();
//        driver.switchTo().frame("frame-bottom");
    }
        @Test
    public void right (){

        }

        @Test
    public  void  middle(){

    }

    @Test
    public void  bottom(){

    }
}
