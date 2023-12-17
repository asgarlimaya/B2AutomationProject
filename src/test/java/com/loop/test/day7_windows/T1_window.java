package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_window extends TestBase {
    /*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
     */
    @Test
    public void test_window_handle(){
        driver.get("http://the-internet.herokuapp.com/windows");
        Assert.assertEquals(driver.getTitle(), "The Internet", "Results aren't matching!");
        // System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        WebElement clickHere = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            System.out.println("each window's handle = " + each);
            driver.switchTo().window(each);
        }

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());

        WebElement newWindow = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
        System.out.println("newWindow.getText() = " + newWindow.getText());



    }

}
