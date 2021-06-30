package com.facebook.tests;

import com.facebook.pages.FacebookHomePage;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FbSearchTest extends TestBase {
    private static Logger LOGGER=Logger.getLogger(FbSearchTest.class);

    private FacebookHomePage homePage;

    @BeforeMethod
    public void setUpPOM() {
        homePage = PageFactory.initElements(driver, FacebookHomePage.class);
    }

    @Test(priority = 1)
    public void loginPage() {
        homePage.enterUserName("Labonyo Shahid");
        ExtentTestManager.log("Enter Login Name", LOGGER);
        homePage.enterUserPassword("google.com");
        ExtentTestManager.log("Entered Password", LOGGER);
        homePage.clickButton();
        ExtentTestManager.log("Click on the SignIn button", LOGGER);
        sleepFor(2);
    }

}
