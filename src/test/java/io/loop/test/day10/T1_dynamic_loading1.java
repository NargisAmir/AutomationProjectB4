package io.loop.test.day10;

import io.loop.pages.LoopPracticeDynamicLoading1;
import io.loop.test.Utilities.BrowserUtils;
import io.loop.test.Utilities.ConfigurationReader;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class T1_dynamic_loading1 {
/*
    1. go to https://loopcamp.vercel.app/dynamic_loading/1.html
    2. click start
    3. wait loading bar disappears
    4. validate username is displayed
    5. enter username tomsmith
    6. enter password incorrectpassword
    7. click submit button
    8. validate "Your password is invalid!" is displayed
     */
LoopPracticeDynamicLoading1 loopPracticeDynamicLoading1;

@BeforeMethod
    public void setUpMethod() {
    loopPracticeDynamicLoading1 = new LoopPracticeDynamicLoading1();
    Driver.getDriver().get(ConfigurationReader.getProperties("loop.practice"));
}
@AfterMethod
    public void tearDownMethod() {
    Driver.getDriver().quit();

}

@Test
    public void dynamicLoading1() {
    BrowserUtils.loopLinkClick("Dynamic Loading");
    BrowserUtils.waitForClickable(loopPracticeDynamicLoading1.dynamicLoading1,10).click();
    BrowserUtils.waitForClickable(loopPracticeDynamicLoading1.startButton,10).click();
    BrowserUtils.waitForInvisiblity(loopPracticeDynamicLoading1.dynamicLoading1,10);
    assertTrue(loopPracticeDynamicLoading1.username.isDisplayed());
    loopPracticeDynamicLoading1.username.sendKeys(ConfigurationReader.getProperties("dynamicLoading.username"));
    loopPracticeDynamicLoading1.password.sendKeys(ConfigurationReader.getProperties("dynamicLoading.incorrectPassword"));
    loopPracticeDynamicLoading1.submitButton.click();
    BrowserUtils.waitForClickable(loopPracticeDynamicLoading1.errorMessage,10).isDisplayed();
    assertTrue(BrowserUtils.waitForVisible(loopPracticeDynamicLoading1.errorMessage, 10).isDisplayed(), "element is not visible");

}


}
