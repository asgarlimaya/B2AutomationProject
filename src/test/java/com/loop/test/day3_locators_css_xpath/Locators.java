package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        // locate the element
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));

        //aboutLink.click();

        //create a String what you want to search
        searchBoxWithID.sendKeys("Feyruz is handsome");
        searchBoxWithID.clear();
        String textToSearch = "Loop Academy";
        searchBoxWithID.sendKeys(textToSearch + Keys.ENTER);

        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains("Loop")) {
            System.out.println("Actual url contains \"Loop\"");
        } else {
            System.err.println("Actual url DOES NOT contains \"Loop\"");
        }

        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Loop Academy - Google Search")) {
            System.out.println("Actual Title contains \"Loop\"");
        } else {
            System.err.println("Actual Title DOES NOT contains \"Loop\"");
        }
    }
}
