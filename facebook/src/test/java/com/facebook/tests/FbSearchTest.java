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

    @Test(enabled = true)
    public void loginPage() {
        homePage.enterUserName("Labonyo Shahid");
        ExtentTestManager.log("Enter Login Name", LOGGER);
        homePage.enterUserPassword("google.com");
        ExtentTestManager.log("Entered Password", LOGGER);
        homePage.clickButton();
        ExtentTestManager.log("Login Successful", LOGGER);
        sleepFor(3);
        homePage.logOut();
        homePage.logOutButton();
        ExtentTestManager.log("LogOut Successful", LOGGER);
    }
    @Test(enabled = true)
    public void searchName() {
        homePage.enterUserName("Labonyo Shahid");
        homePage.enterUserPassword("google.com");
        homePage.clickButton();
        ExtentTestManager.log("Login Successful", LOGGER);
        sleepFor(2);
        homePage.searchName("hiru");
        homePage.clickSearch();
        homePage.findName("People");
        ExtentTestManager.log("Search Name Successful", LOGGER);
        homePage.logOut();
        homePage.logOutButton();
    }
    @Test(enabled = true)
    public void uploadPic() {
        homePage.enterUserName("Labonyo Shahid");
        homePage.enterUserPassword("google.com");
        homePage.clickButton();
        ExtentTestManager.log("Login Successful", LOGGER);
        sleepFor(2);

        //homePage.uploadPic();
        homePage.uploadClick();
        //homePage.sendText();
        //homePage.sendPic();

        ExtentTestManager.log("Image Upload Successful", LOGGER);
        homePage.logOut();
        homePage.logOutButton();
    }
}
