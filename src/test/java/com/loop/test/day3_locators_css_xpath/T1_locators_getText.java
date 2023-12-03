package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {
        /*
         * go to docuport
         * enter username
         * do NOT enter password
         * click om login button
         * verify error message - please enter password
         */
    // go to url
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement errorMessageForEmptyPassword = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessage = errorMessageForEmptyPassword.getText();

        if(actualErrorMessage.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMessage + ". Test PASSED");
        } else {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", DOES NOT match actual error message: " + actualErrorMessage);
            System.err.println("TEST FAILED");
        }

         driver.quit();



    }
}
