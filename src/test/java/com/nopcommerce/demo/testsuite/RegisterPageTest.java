package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //Click on Register Link
        homePage.clickOnRegisterLink();
        //Verify "Register" text
        String expectedErrorMessage = "RegisterText";
        String actualErrorMessage = registerPage.getRegisterText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, " message not displayed");
    }

    @Test(groups={"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        //Click on Register Link
        homePage.clickOnRegisterLink();
        //Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
//   //Verify the error message "First name is required."
        String expectedErrorMessage = "First name is required.";
        String actualErrorMessage = registerPage.getFirstNameRequiredText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, " message not displayed");
//  // Verify the error message "Last name is required."
        String expectedErrorMessage1 = "Last name is required.";
        String actualErrorMessage1 = registerPage.getLastNameRequiredText();
        Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1, " message not displayed");
//        Verify the error message "Email is required."
        String expectedErrorMessage2 = "Email is required.";
        String actualErrorMessage2 = registerPage.getEmailIsRequiredText();
        Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2, " message not displayed");
//        Verify the error message "Password is required."
        String expectedErrorMessage3 = "Password is required.";
        String actualErrorMessage3 = registerPage.getPasswordIsRequiredText();
        Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3, " message not displayed");
//        Verify the error message "Password is required."
        String expectedErrorMessage4 = "Password is required.";
        String actualErrorMessage4 = registerPage.getConfirmPasswordIsRequiredText();
        Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4, " message not displayed");
    }
 @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
     //Click on Register Link
     homePage.clickOnRegisterLink();
     //Click on "Female" button
     registerPage.clickOnFemaleRadioButton();
     //Enter firstname
     registerPage.sendTextToFirstNameField("Max")  ;
     //Enter lastname
     registerPage.sendTextToFirstNameField1("Smith");
   //Select day
     registerPage.selectDayFromDateOfBirth("16");
     //Select month
     registerPage.selectMonthFromDateOfBirth("march");
     //Select year
     registerPage.selectYearFromDateOfBirth("1993");
     //Enter email,Enter password,Enter Confirm Password,Click on "REGISTER" button
//    registerPage. EmailField("Max33@gmail.com");
//     registerPage.PasswordField("Maximum123");
//     registerPage.clickOnRegisterButton();
     registerPage.registerToApplication("Max33@gmail.com","Maximum123","Maximum123");
     //Verify text
     String expectedErrorMessage4 = "Your registration completed";
     String actualErrorMessage4 = registerPage.getRegistrationCompletedText();
     Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4, " message not displayed");
 }
 }
