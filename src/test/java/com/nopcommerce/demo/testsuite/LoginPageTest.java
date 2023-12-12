package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyErrorMessageWithInvalidCredentials() {
    //Click on login link
        homePage.clickOnLoginLink();
    // //Enter EmailId
        loginPage.enterEmailId("Max33@gmail.com");
    // Enter Password
        loginPage.enterPassword("Maximum123");
    // Click on Login Button
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
    }
    @Test(groups= {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
     //Click on login link
        homePage.clickOnLoginLink();
     //Enter EmailId
        loginPage.enterEmailId("Max32@gmail.com");
     //Enter Password
        loginPage.enterPassword("Maximum123");
     //Click on Login Button
        loginPage.clickOnLoginButton();
     //Verify that LogOut link is display
        String expectedErrorMessage = "LogOut";
        String actualErrorMessage = loginPage.getLogOutText();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage," message not displayed");
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        //Click on login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.enterEmailId("Max32@gmail.com");
        //Enter Password
        loginPage.enterPassword("Maximum123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
       // Click on LogOut Link
        loginPage. clickOnLogOut();
     //Verify that LogOut link is display
        String expectedErrorMessage = "LogIn link";
        String actualErrorMessage = loginPage.getLogInText();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage," message not displayed");
    }
}
