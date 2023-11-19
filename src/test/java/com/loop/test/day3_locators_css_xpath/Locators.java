package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    public static void main(String[] args) {

        //Set up driver OBJ
        WebDriver driver = WebDriverManager.chromedriver().create();

        //navigate to google
        driver.get("https://www.google.com/");

        //driver.manage().window().maximize();

        //Find Elements
        WebElement searchBoxID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxName = driver.findElement(By.name("q"));

        //Located "about" and click
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        //        aboutLink.click();

        //Clear input field, input text, then search
        searchBoxID.clear();
        searchBoxID.sendKeys("Loop Academy" + Keys.ENTER);

        //Get current URL and check that it contains "Loop"
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("Loop")) {
            System.out.println("Actual URL contains \"Loop\"");
        } else {
            System.err.println("Actual URL DOES NOT contain \"Loop\"");
        }

        //Get actual title and compare it with expected title "Loop Academy - Google Search"
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Loop Academy - Google Search")) {
            System.out.println("Actual Title contains \"Loop\"");
        } else {
            System.err.println("Actual Title DOES NOT contain \"Loop\"");
        }
    }
}