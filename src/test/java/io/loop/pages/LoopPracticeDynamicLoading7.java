package io.loop.pages;

import io.loop.test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDynamicLoading7 {
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
    public LoopPracticeDynamicLoading7(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "alert")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@src='/img/a-few-moments.jpg']")
    public WebElement image;

    @FindBy(xpath = "//a[@href='dynamic_loading/7.html']")
    public WebElement getDynamicLoading7;

}