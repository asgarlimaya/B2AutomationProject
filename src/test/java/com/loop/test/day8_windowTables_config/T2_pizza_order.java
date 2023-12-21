package com.loop.test.day8_windowTables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T2_pizza_order extends TestBase {

   /*
    1. go to https://loopcamp.vercel.app/web-tables.html
    2. create a method to test given field for a given name
    3. test type
    4. test amount
    5. test date
    6. test street
    7. test city
    8. test state
    9. test zip
    10. test card
    11. test card number
    12. test exp
     */

    @Test
    public void test_pizza_type() {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";
        String actualPizzaType = PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Pizza type");
        assertEquals(actualPizzaType, expectedPizzaType, "actual does not match expected");
    }


}