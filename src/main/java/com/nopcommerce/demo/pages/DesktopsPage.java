package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(linkText = " Desktops ")
    WebElement Desktop;
    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement BuildYourOwnComputer;


    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement Ram;

    public void clickOnDesktop() {
        clickOnElement(Desktop);
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(BuildYourOwnComputer);
    }
}