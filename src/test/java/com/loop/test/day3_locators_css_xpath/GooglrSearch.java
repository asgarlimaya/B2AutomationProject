package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglrSearch {
    /**
     * Navigate to Google search
     * maximize the page
     * get title of the page
     * get url of the page
     * validate the title, expected title is "Google"
     * validate the url of the page, expected url is "https://www.google.com/"
     * close the brower
     */

    public static void main(String[] args) {
        //set up the driver
        WebDriverManager.chromedriver().setup();

        // create driver object
        WebDriver driver = new ChromeDriver();

        //navigate to google
        driver.get("https://www.google.com");

        //maximize the window
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " +actualTitle+ ", matches expected title: "+ expectedTitle + ". => TEST PASS");
        }else {
            System.err.println("Actual title: " +actualTitle + ",DOES NOT match expected title: " + expectedTitle + ", => TEST FAIL");
        }

        String expectedURL = "https://www.google.com";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("Actual url: " +actualURL+ ", matches expected url: "+ expectedURL + ". => TEST PASS");
        }else {
            System.err.println("Actual url: " +actualURL + ",DOES NOT match expected url: " + actualURL + ", => TEST FAIL");
        }

        driver.close();

    }
}
