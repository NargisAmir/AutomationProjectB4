package io.loop.test.day4;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

/*
    1. open chrome
    2. go to docuport
    3. click on forgot password
    4. validate url contains: reset-password
    5. validate - Enter the email address associated with yor account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate send button is displayed
    8. validate cancel button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
     */
public class T000_xpath_getText {
    public static void main(String[] args) throws InterruptedException {
        //1.2open chrome and go to docuport
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);

      //3.click on forget password
        WebElement forgotPassword = driver.findElement(By.xpath("//a[@href= '/reset-password']"));
        forgotPassword.click();

        //4.validate url contains: reset-password
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(DocuportConstants.RESET_PASSWORD_URL)){
            System.out.println("Test pass");

        }else{
            System.out.println("Test fail");
        }
        //5. validate - Enter the email address associated with yor account
        WebElement validateMessage = driver.findElement(By.xpath("//div[contains(text(),'Enter')]"));
        String actualValidateMessage = validateMessage.getText();
                if(actualValidateMessage.equals(DocuportConstants.RESET_PASSWORD_MESSAGE)){
                    System.out.println("Test pass");
                }else{
                    System.out.println("Test fail");
                }

        //6. enter forgotpasswordg1@gmail.com to email box

        WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id,'input')]"));
                emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);


                //7. validate send button is displayed
               //8.validate cancel button is displayed
        WebElement cancelButton = driver.findElement(By.xpath("//span[contains(.,'Cancel')]"));
        WebElement sendButton = driver.findElement(By.xpath("//span[normalize-space()='Send']"));
       if(cancelButton.isDisplayed()){
           System.out.println("Test pass- cancel is displayed");
       }else{
           System.out.println("Test fail _cancel is not displayed");
       }

        if(sendButton.isDisplayed()){
            System.out.println("Test pass- send is displayed");
        }else{
            System.out.println("Test fail -send is not displayed");
        }
        //9. click send button
        sendButton.click();

        Thread.sleep(5000);
        //10. validate - We've sent you an email with a link to reset your password. Please check your email
        WebElement succesMessage = driver.findElement(By.xpath("//span[@class='body-1']"));

        Thread.sleep(10000);
        System.out.println("succesMessage.getText()" + succesMessage.getText());
       try{
           System.out.println(succesMessage.getText());
       }catch (StaleElementReferenceException e){
           System.out.println("Element is not there anymore");
       }

       
    }
}
