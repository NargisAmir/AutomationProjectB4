package io.loop.test.day9;

import io.loop.test.Utilities.ConfigurationReader;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_actions_hoverover {

@Test
    public void google_action_hover() throws InterruptedException {
    Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
    WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@data-ved='0ahUKEwivh5-BrLCLAxW7CTQIHToxAZkQ4dUDCB8']"));
    WebElement feelingLucky = Driver.getDriver().findElement(By.xpath("//input[@data-ved'0ahUKEwivh5-BrLCLAxW7CTQIHToxAZkQ19QECCA']"));

    Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(googleSearch).perform();

    Thread.sleep(3000);
    actions.moveToElement(feelingLucky).perform();
    actions.sendKeys(Keys.F12);

}




}
