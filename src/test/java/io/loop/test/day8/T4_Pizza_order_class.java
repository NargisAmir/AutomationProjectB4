package io.loop.test.day8;

import io.loop.test.Utilities.PizzaOderWebTableUtilClass;
import io.loop.test.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Pizza_order_class extends TestBase {

    @Test
    public void test_pizza_type() {
        driver.get("https://loopcamp.vercel.app/web-tables.html");

        String name = "Samuel Jackson";
        String expectedPizzaType = "Italian";
       String actualPizzaType= PizzaOderWebTableUtilClass.returnFieldValue(driver,name,"pizza type");
        Assert.assertEquals(actualPizzaType,expectedPizzaType,"Actual does not match expected pizza type");
        System.out.println("actualPizzaType = "+ actualPizzaType);




    }
}
