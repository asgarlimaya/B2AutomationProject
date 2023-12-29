package com.loop.test.day10_upload_download;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T3_drag_drop {
        /*
    1- Open a chrome browser
    2- Go to: https://demo.guru99.com/test/drag_drop.html
    3- Drag “BANK” and drop into Account area under Debit Side
    4- Drag “5000” and drop into Amount area under Debit Side
    5- Drag “SALES” and drop into Account area under Credit Side
    6- Drag “5000” and drop into Amount area under Credit Side
    7- Validate “Perfect!” text displayed.
     */

    @Test
    public void drag_drop_test (){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().get(ConfigurationReader.getProperty("guru.drag"));
        WebElement bank = Driver.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
        WebElement debitAccount = Driver.getDriver().findElement(By.id("bank"));
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(bank,debitAccount).perform();

        WebElement fiveK = Driver.getDriver().findElement(By.xpath("//a[.=' 5000 ']"));
        WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));

        action.dragAndDrop(fiveK,debitAmount).perform();

        WebElement sales = Driver.getDriver().findElement(By.xpath("//a[contains (text(),' SALES ')]"));
        WebElement creditAccount = Driver.getDriver().findElement(By.xpath("//*[@id='loan']/li"));
        action.dragAndDrop(sales , creditAccount).perform();

        WebElement creditAmount = Driver.getDriver().findElement(By.id("amt8"));

        action.dragAndDrop(fiveK,creditAmount).perform();

        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Perfect')]"));

        String expected = "Perfect!";
        String actual = successMessage.getText();
        Assert.assertEquals(actual,expected, "TEST FAILED => Actual does not match expected");


    }
}
