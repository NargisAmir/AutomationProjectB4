package io.loop.test.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaOrderWebTableUtil {
    /**
     *returns any field from table by given email address
     * @param driver
     * @param name
     * @param field
     * @return
     */
    public static String returnAnyFields(WebDriver driver, String name, String field) throws InterruptedException {
        WebElement element = null;
        String xpath = "";
        switch (field.toString()) {

            case "Pizza Type":
                xpath = "//*[contains(text(),'"+ name +"')]/following-sibling::td[1]" ;
                element= driver.findElement(By.xpath(xpath));
                break;

            case "Amount":
                xpath = "//*[contains(text(),'"+ name +"')]/following-sibling::td[2]";
                element= driver.findElement(By.xpath(xpath));
                break;

            case "Date":
                xpath = "//*[contains(text(),'"+ name +"')]/following-sibling::td[3]";
                element= driver.findElement(By.xpath(xpath));
                break;
            case "Street":
                xpath =  "//*[contains(text(),'"+ name +"')]/following-sibling::td[4]";
                element= driver.findElement(By.xpath(xpath));
                break;

            case "City":
                xpath = "//*[contains(text(),'"+ name +"')]/following-sibling::td[5]";;
                element= driver.findElement(By.xpath(xpath));
                break;
            case "State":
                xpath = "//*[contains(text(),'"+ name +"')]/following-sibling::td[6]";;
                element= driver.findElement(By.xpath(xpath));
                break;
            case "Zip":
                xpath = "//*[contains(text(),'"+ name +"')]/following-sibling::td[7]";;
                element= driver.findElement(By.xpath(xpath));
                break;
            case "Card":
                xpath = "//*[contains(text(),'"+ name +"')]/following-sibling::td[8]";;
                element= driver.findElement(By.xpath(xpath));
                break;
            case "Card Number":
                xpath = "//*[contains(text(),'"+ name +"')]/following-sibling::td[9]";
                element= driver.findElement(By.xpath(xpath));
                break;
            case "Exp":
                xpath = "//*[contains(text(),'"+ name +"')]/following-sibling::td[10]";;
                element= driver.findElement(By.xpath(xpath));
                break;


            default:throw new InterruptedException("There is not syc a field: +" + field);

        }
        return element.getText();
    }
}

