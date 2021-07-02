package com.citibank.tests;

import com.citibank.pages.CitibankHomePage;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class SearchTest extends TestBase {
    private static Logger LOGGER=Logger.getLogger(SearchTest.class);
    private CitibankHomePage homePage;

    @BeforeMethod
    public void setUpPOM() {
        homePage = PageFactory.initElements(driver, CitibankHomePage.class);
    }

    @Test(priority = 1)
    public void itemTest() {
        homePage.userID("Belayet");
        homePage.pserPass("Hossain");
        homePage.submit();
        homePage.displayMsg();
        ExtentTestManager.log("Login Test Successful", LOGGER);
    }
    @Test(priority = 2)
    public void selectItemTest() {
        homePage.selectItem();
        homePage.selectFromItem();
        ExtentTestManager.log("Select Item Successful", LOGGER);
    }
}
