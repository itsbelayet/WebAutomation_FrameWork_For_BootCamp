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

    @Test(priority = 1)
    public void loginPage() {
        homePage.clickLogin();
        ExtentTestManager.log("Login Successfull", LOGGER);
        homePage.typeEmail("its.belayet@gmail.com");
        homePage.clickOnSignInButton();
        ExtentTestManager.log("Click on the Continue button", LOGGER);
        homePage.enterPassword("Miru@1964");
        ExtentTestManager.log("Entered Password", LOGGER);
        homePage.clickSignIn();
        ExtentTestManager.log("Click on the SignIn button", LOGGER);
    }

    @Test(priority = 2,enabled = false)
    public void logOutPage() {
        homePage.clkSignOut();
        ExtentTestManager.log("Click LogOut Successfull", LOGGER);
        homePage.clickSignOut();
        ExtentTestManager.log("LogOut Successfully", LOGGER);
    }

    @Test(priority = 3)
    public void checkBox() {
        homePage.typeOnSearchBar("dslr camera");
        ExtentTestManager.log("Searching for dslr camera", LOGGER);
        homePage.clickOnSearchButton();
        ExtentTestManager.log("Click Search Button", LOGGER);
        homePage.findText("dslr camera");
    }

}
