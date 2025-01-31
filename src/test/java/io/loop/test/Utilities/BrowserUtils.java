package io.loop.test.Utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class BrowserUtils {
    /**
     * validate if driver switched to expected url or title
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author NSH
     * implement assertion
     */
    public static void switchWindowAndValidate(WebDriver driver,String expectedUrl,String expectedTitle) {
        //to lowercase the params in order to avoiw miss type
        expectedTitle=expectedTitle.toLowerCase();
        expectedUrl=expectedUrl.toLowerCase();

        //get all window handles,switch one by one and eachTime check if url matches expected to stop
        Set<String> windowHandles=driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if(driver.getCurrentUrl().toLowerCase().contains(expectedUrl)) {
                break;
            }
        }
        //after stopping on expected url ,validate the title
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));

    }

    /**
     * param driver
     * @param targetTitle
     * @author NA
     *
     */
    public static void switchToWindow(WebDriver driver,String targerTitle) {
        String origin= driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if(driver.getTitle().contains(targerTitle)) {
                return;
            }
        }
        driver.switchTo().window(origin);
    }
}
