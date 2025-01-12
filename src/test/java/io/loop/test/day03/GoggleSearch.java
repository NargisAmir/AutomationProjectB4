package io.loop.test.day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the browser
 */
public class GoggleSearch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Navigate to Google search
        driver.navigate().to("https://www.google.com/");

        // maximize the page
        driver.manage().window().maximize();

       //get title of the page
       String expectedTitle = "Google";
      // System.out.println(driver.getTitle());

       String actualTitle = driver.getTitle();

       if(actualTitle.contains(expectedTitle)){
           System.out.println("Actual title: " + actualTitle + ", matches expected title " + expectedTitle + ".==> TEST PASS!");
       }else{
           System.out.println("Actual title: " + actualTitle + ", Does not match expected title " + expectedTitle + ".==> TEST FAIL!");
       }

       String expectedUrl = "https://www.google.com";
       String actualUrl = driver.getCurrentUrl();
       
        if(actualTitle.contains(expectedUrl)){
            System.out.println("Actual url: " + actualUrl + ", matches expected url " + expectedUrl + ".==> TEST PASS!");
        }else{
            System.out.println("Actual url: " + actualUrl + ", Does not match expectedUrl " + expectedUrl + ".==> TEST FAIL!");
        }

    }
}
