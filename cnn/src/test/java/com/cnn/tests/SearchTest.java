package com.cnn.tests;

import com.cnn.pages.CNNHomePage;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    private static Logger LOGGER=Logger.getLogger(SearchTest.class);

    private CNNHomePage homePage;

    @BeforeMethod
    public void setUpPOM() {
        homePage = PageFactory.initElements(driver, CNNHomePage.class);
    }

    @Test(priority = 1)
    public void loginPage() {
        homePage.searchButton();
        homePage.enterName("its.belayet@gmail.com");
        homePage.enterPassword("Miru@1964");
        homePage.submitButton();
        ExtentTestManager.log("Login Successfull", LOGGER);
        homePage.closeButton();
        ExtentTestManager.log("Logout Successfull", LOGGER);
    }

}
