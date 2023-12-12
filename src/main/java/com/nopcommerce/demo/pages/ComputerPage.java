package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility  {
    @CacheLookup
    @FindBy(linkText = "Computers ")
    WebElement Computer;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement ComputerText;

    public void clickOnComputerTab(){
        clickOnElement(Computer);
    }
    public String getComputerText() {
        String message = getTextFromElement(ComputerText);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;
    }
}
