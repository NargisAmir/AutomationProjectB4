package io.loop.test.day5;

import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

/*
  1. Open Chrome browser
  2. Go to https://demoqa.com/select-menu
  3. Select all the options from multiple select dropdown.
  4. Print out all selected values.
  5. Deselect all values.
   */
public class T5_multi_dropdown {
    WebDriver driver ;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void tearDownMethod() {
       // driver.quit();
    }

    @Test
    public void multiSelect() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
      //isMultile();
        Assert.assertNotEquals(dropdown.isMultiple(),"Dropdown is not multi select");

         dropdown.selectByValue("saab");
         Thread.sleep(3000);
         dropdown.selectByVisibleText("Opel");
         Thread.sleep(3000);
         dropdown.selectByContainsVisibleText("Au");
        Thread.sleep(3000);

        List<WebElement>options;
      options = dropdown.getOptions();

        for (WebElement option : options) {
            option.click();
            System.out.println("Selected option: " + option.getText());
        }


        options.forEach(option -> {
            option.click();
            System.out.println("Selected option: " + option.getText());
        });


        options.forEach(WebElement::click);

        dropdown.deselectAll();
        try{
           // dropdown.getFirstSelectedOption().getText();
            Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"");
        }catch (NoSuchElementException e){
            System.out.println("No options selected");
        }

        Assert.assertThrows(org.openqa.selenium.NoSuchElementException.class,dropdown::
            getFirstSelectedOption);

        Assert.assertTrue(dropdown.getAllSelectedOptions().isEmpty(), "The list is not empty");


    }

}
