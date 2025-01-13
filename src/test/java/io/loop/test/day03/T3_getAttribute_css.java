package io.loop.test.day03;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */
public class T3_getAttribute_css {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);
        //locate the element with CSS
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));

     //get the value of the attribute
        String docuport= logo.getDomAttribute("alt");
        System.out.println(docuport + "docuport");
      if(DocuportConstants.LOGO_DOCUPORT.equals(docuport)){
          System.out.println("Expected results matches with actual.Test PASSES");
      }else{
          System.out.println("Expected result does NOT  match with the actual.Test FAILED");
      }

      /*TODO:Homework
          locate:
         username
         password
         login
         with css
         login to docuport
         locate home icon of docuport after login or any other element after login
         validated that you logged in
       */
    }
}
