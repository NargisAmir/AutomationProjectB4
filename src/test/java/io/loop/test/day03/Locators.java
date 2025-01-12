package io.loop.test.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

      driver.get("https://www.google.com");
      driver.manage().window().maximize();

        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));

        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        aboutLink.click();

        String textToSearch ="Feyruz is the King of Java";


        searchBoxWithID.sendKeys(textToSearch);
        searchBoxWithID.clear();
        searchBoxWithID.sendKeys("Nadir is smart" + Keys.ENTER);

        driver.quit();
    }
}
