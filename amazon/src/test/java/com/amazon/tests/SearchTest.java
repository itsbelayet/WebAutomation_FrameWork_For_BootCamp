package com.amazon.tests;

import com.amazon.pages.AmazonHomePage;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    private static Logger LOGGER=Logger.getLogger(SearchTest.class);

    private AmazonHomePage homePage;

    @BeforeMethod
    public void setUpPOM() {
        homePage = PageFactory.initElements(driver, AmazonHomePage.class);
    }

    @Test(enabled = true)
    public void loginPage() {
        homePage.clickLogin();
        ExtentTestManager.log("Login click Successful", LOGGER);
        homePage.typeEmail("its.belayet@gmail.com");
        homePage.clickOnSignInButton();
        ExtentTestManager.log("Click on the Continue button", LOGGER);
        homePage.enterPassword("Miru@1964");
        ExtentTestManager.log("Entered Password", LOGGER);
        homePage.clickSignIn();
        ExtentTestManager.log("SignIn Successful", LOGGER);
        homePage.clkSignOut();
        homePage.clickSignOut();
        ExtentTestManager.log("LogOut Successfully", LOGGER);
    }
    @Test(enabled = true)
    public void checkBox() {
        homePage.typeOnSearchBar("dslr camera");
        ExtentTestManager.log("Searching for dslr camera", LOGGER);
        homePage.clickOnSearchButton();
        ExtentTestManager.log("Click Search Button", LOGGER);
        homePage.findText("dslr camera");
    }
    @Test(enabled = true)
    public void shopping() {
        homePage.checkBox("nikon 7500 camera");
        ExtentTestManager.log("Searching for dslr camera", LOGGER);
        homePage.checkButton();
        ExtentTestManager.log("Click Search Button", LOGGER);
        homePage.product();
        homePage.addToCart();
        homePage.noThanks();
        homePage.checkOut();
        ExtentTestManager.log("Check Out Successful", LOGGER);
    }
}
