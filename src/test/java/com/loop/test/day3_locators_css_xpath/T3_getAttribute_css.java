package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_css {
    public static void main(String[] args) {
        /*
         * go to docuport application
         * identify docuport with css
         * get value of the attribute
         * Validate if  it is "Docuport"
         */

        //go to the url

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        //identify logo with css

        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String docuport = logo.getAttribute("alt");

        if (DocuportConstants.LOGO_DOCUPORT.equalsIgnoreCase(docuport)){
            System.out.println("Expected logo text: " + DocuportConstants.LOGO_DOCUPORT + ", matches actual logo text: "  + docuport);
        } else {
            System.out.println("Expected logo text: " + DocuportConstants.LOGO_DOCUPORT + ", DOES NOT MATCH actual logo text: "  + docuport);
        }

        // locate username with css

        // locate password with css

        // locate login with css

        // login to docuport

        // locate home icon of docuport after login or any element after login

        // validate that you logged in



    }
}
