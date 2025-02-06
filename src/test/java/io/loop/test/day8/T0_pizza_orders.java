package io.loop.test.day8;

import io.loop.test.Utilities.DocuportWebTableUtils;
import io.loop.test.Utilities.Driver;
import io.loop.test.Utilities.PizzaOrderWebTableUtil;
import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class T0_pizza_orders extends TestBase {
/*
go to https://loopcamp.vercel.app/web-tables.html
create a method to test given field for a given name
test type
test amount
test date
test street
test city
test state
test zip
test card
test card number
test exp

 */

    @Test
    public void pizza_order() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String name = "John Doe";
        String expectedPizzaType= "Pepperoni";
        String actualPizzaType = PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","Pizza Type");
        Assert.assertEquals(actualPizzaType, expectedPizzaType,"Actual does not match expected");
        System.out.println(actualPizzaType  + " = actualPizzaType");
        //Amount
        String expectedAmount = "3";
        String actualAmount= PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","Amount");
        Assert.assertEquals(actualAmount, expectedAmount,"Actual does not match expected");
        System.out.println(actualAmount  + " = actualAmount");
        //Date
        String expectedDate = "01/08/2021";
        String actualDate= PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","Date");
        Assert.assertEquals(actualDate, expectedDate,"Actual does not match expected");
        System.out.println(actualDate  + " = actualDate");
        //Street
        String expectedStreet = "12, Cherry Ave";
        String actualStreet= PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","Street");
        Assert.assertEquals(actualStreet, expectedStreet,"Actual does not match expected");
        System.out.println(actualStreet  + " = actualStreet");
       //City
        String expectedCity = "Arlington, VA";
        String actualCity= PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","City");
        Assert.assertEquals(actualCity, expectedCity,"Actual does not match expected");
        System.out.println(actualCity  + " = actualCity");
        //State
        String expectedState = "Canada";
        String actualState= PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","State");
        Assert.assertEquals(actualState, expectedState,"Actual does not match expected");
        System.out.println(actualState  + " = actualState");
        //Zip
        String expectedZip = "76743";
        String actualZip= PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","Zip");
        Assert.assertEquals(actualZip, expectedZip,"Actual does not match expected");
        System.out.println(actualZip  + " = actualZip");
        //Card
        String expectedCard = "MasterCard";
        String actualCard= PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","Card");
        Assert.assertEquals(actualCard, expectedCard,"Actual does not match expected");
        System.out.println(actualCard  + " = actualCard");
        //Card Number
        String expectedCardNumber = "980077987700";
        String actualCardNumber= PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","Card Number");
        Assert.assertEquals(actualCardNumber, expectedCardNumber,"Actual does not match expected");
        System.out.println(actualCardNumber  + " = actualCardNumber");
        //Exp
        String expectedExp = "01/23";
        String actualExp= PizzaOrderWebTableUtil.returnAnyFields(driver,"John Doe","Exp");
        Assert.assertEquals(actualExp, expectedExp,"Actual does not match expected");
        System.out.println(actualExp  + " = actualCardNumber");






    }




}

