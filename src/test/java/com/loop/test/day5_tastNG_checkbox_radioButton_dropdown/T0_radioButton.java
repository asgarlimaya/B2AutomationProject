package com.loop.test.day5_tastNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class T0_radioButton {
    /*
        https://demoqa.com/radio-button
        wait implicitly 10 seconds
         */
    public static void main(String[] args) throws Exception{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");
        //wait the whole page loads - selenium 3
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // wait the whole page loads - selenium 4
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement red = driver.findElement(By.xpath("//input[@id='red']"));
        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));

        //isSelected()

        System.out.println(red.isSelected() + " before clicking");
        red.click();
        Thread.sleep(5000);
        System.out.println(red.isSelected() + " after clicking");
        green.click();

        //isEnabled
        System.out.println(red.isEnabled() + " checking if enabled");
        System.out.println(green.isEnabled() + " checking if enabled");
    }
}
