package io.loop.test.day7;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.DocuportUtils;
import io.loop.test.Utilities.DocuportWebTableUtils;
import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_webTables extends TestBase {
/*
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */

    @Test
    public void test_webTables() throws InterruptedException {
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement user = driver.findElement(By.xpath("//*[contains(text(),'Users')]"));
        user.click();
        String expectedFullName = "Alex De Souza";
        String actualFullName = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com","Full name");
        Assert.assertEquals(actualFullName, expectedFullName,"Actual does not match expected");
        System.out.println(actualFullName + " = actualFullName");

        String expectedUserName = "alexdesouze";
        String actualUserName = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com","username");
        Assert.assertEquals(actualUserName, expectedUserName,"Actual does not match expected");
        System.out.println(actualUserName + " = actualUserName");

        String expectedPhoneNum = "+994512060042";
        String actualPhoneNum = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com","phone number");
       Assert.assertEquals(actualPhoneNum, expectedPhoneNum,"Actual does not match expected");
       System.out.println(actualPhoneNum + " = actualPhoneNum");

       String expectedRole = "Client";
        String actualRole = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com","role");
        Assert.assertEquals(actualRole, expectedRole,"Actual does not match expected");
        System.out.println(actualRole + " = actualRole");

        String expectedAdvisor = "Batch1 Group1";
        String actualAdvisor = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com","advisor");
        Assert.assertEquals(actualAdvisor, expectedAdvisor,"Actual does not match expected");
        System.out.println(actualAdvisor + " = actualAdvisor");


    }
}
