package io.loop.pages;

import io.loop.test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDynamicLoading1 {
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
    public LoopPracticeDynamicLoading1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(id = "loading")
    public WebElement loadingBar;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "pwd")
    public WebElement password;

    @FindBy(xpath = "  //button[@type='submit']")
    public WebElement submitButton;

    @FindBy(id = "flash-messages")
    public WebElement errorMessage;

    @FindBy(xpath = "  //a[@href='dynamic_loading/1.html']")
    public WebElement dynamicLoading1;
}