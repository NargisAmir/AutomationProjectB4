package io.loop.test.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class T2_new_methods_window extends TestBase {

    @Test
    public void test() {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.loopcamp.io");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.Amazon.ca");
    }
    @Test
    public void test2() {
        driver.get("https://www.google.com");
        driver.switchTo().newWindow(WindowType.TAB);


    }
}
