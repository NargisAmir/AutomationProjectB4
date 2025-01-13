package io.loop.test.day03;
/*go to url: https://loopcamp.vercel.app/registration_form.html
        verify header text expected:  Registration form
        verify placeholder attribute value for first name expected - first name
        */
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.LoopCampConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
      //go to the url "https://loopcamp.vercel.app/registration_form.html"
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.navigate().to(LoopCampConstants.REGISTRATION_FORM_URL);
       //locate the element header
        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        //Use getText method-returns string
        String actualHeaderForForm = headerForForm.getText();
        if(actualHeaderForForm.equals(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected header for form: " + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + ", matches actual header: " + actualHeaderForForm + " => TEST PASSED");
        } else {
            System.err.println("Expected header for form: " + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + ", DOES NOT MATCH actual header: " + actualHeaderForForm + "=> TEST FAILED");
        }
       //use get attribute method,which returns the value of the attribute, not the text
       WebElement firstNamePlaceHolder = driver.findElement(By.name("firstname"));
        String actualPlaceHolderForFirstName = firstNamePlaceHolder.getAttribute("placeholder");

         if(actualPlaceHolderForFirstName.equals(LoopCampConstants.EXPECTED_PLACE_HOLDER_FIRSTNAME)){
             System.out.println("Expected placeholder matches with actual.TEST PASSED");
         }else{
             System.out.println("Expected placeholder does not match with actual.TEST FAILED");
         }
        }



    }

