package io.loop.test.day5;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class T2_testNG_with_selenium {


    WebDriver driver;
    String Expected;
    String Actual;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
    }

    @Test
    public void googleTitle() {
        driver.get("https://www.google.com");
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        Expected = "Google";
        Actual = driver.getTitle();
        assertEquals(Actual, Expected,"Actual: " + Actual + " does not matcg expected: " + Expected);
    }

    @Test
    public void docuportTitle() {
        driver.get(DocuportConstants.DOCUPORT_TEST);
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        Expected = "Docuport";
        Actual = driver.getTitle();
        assertTrue(Actual.equals(Expected),"Actual does not match expected");
}
}
