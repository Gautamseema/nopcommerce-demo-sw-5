package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement Processor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement Ram;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='HDD']")
    WebElement HDD;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='OS']")
    WebElement OS;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Software']")
    WebElement Software;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement AddToCart;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement AddedToYourShoppingCartText;


    public void selectProcessor(String processorName) {
        selectByVisibleTextFromDropDown(Processor, processorName);
    }

    public void selectRam(String RamOption) {
        selectByVisibleTextFromDropDown(Ram, RamOption);
    }

    public void clickOnHdd() {
        clickOnElement(HDD);
    }

    public void clickOnOs() {
        clickOnElement(OS);
    }

    public void clickOnSoftware() {
        clickOnElement(Software);
    }

    public void clickOnAddToCart() {
        clickOnElement(AddToCart);
    }

    public String getShoppingCartText() {
        String message = getTextFromElement(AddedToYourShoppingCartText);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;

    }
}