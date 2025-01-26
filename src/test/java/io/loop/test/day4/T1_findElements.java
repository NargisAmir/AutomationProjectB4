package io.loop.test.day4;

import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

/*
        1- Open a chrome browser
        2- Go to: https://www.nba.com
        3- Locate all the links in the page.
         */
public class T1_findElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://www.nba.com");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//wait 10 second//will wait 10 second but checked every second if the page download it stops waiting,but thread still wait 10 second


        List<WebElement>nbaLinks = driver.findElements(By.tagName("a"));
        System.out.println("nbaLinks.size()" + nbaLinks.size());

        List<WebElement>nbaLinksWithXpath = driver.findElements(By.xpath("//a"));
        System.out.println("nbaLinksWithXpath.size()" + nbaLinksWithXpath.size());

        for (WebElement nbaLink : nbaLinks) {
            if(!nbaLink.getText().equals(""))
            System.out.println("nbaLink.getText()" +nbaLink.getText());
            System.out.println("nbaLink.getText(\"href\")" +nbaLink.getDomAttribute("href"));

        }
        for (int i = 0; i < nbaLinks.size(); i++) {
            if(!nbaLinks.get(i).getText().equals("")){
                System.out.println("nbaLinks.get(i).getText()" +nbaLinks.get(i).getText());
                System.out.println("nbaLinks.get(i).getText(\"href\")" +nbaLinks.get(i).getDomAttribute("href"));
            }

        }


    }
}
