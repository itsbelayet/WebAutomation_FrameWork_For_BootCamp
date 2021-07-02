package com.cigna.tests;

import com.cigna.pages.CignaHomePage;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class SearchTest extends TestBase {
    private static Logger LOGGER=Logger.getLogger(SearchTest.class);
    private CignaHomePage homePage;

    @BeforeMethod
    public void setUpPOM() {
        homePage = PageFactory.initElements(driver, CignaHomePage.class);
    }

    @Test(priority = 1)
    public void loginPage() {
        homePage.clickLogin();
        Set<String> newWindow = driver.getWindowHandles();
        String currentWindow = driver.getWindowHandle();
        for (String win : newWindow) {
            if (!win.equalsIgnoreCase(currentWindow)) {
                driver.switchTo().window(win);
            }
        }
        homePage.userID("Mohammed");
        homePage.userPass("Hossain");
        homePage.clickSubmit();
        homePage.errorMessage1();   // Too much login use Message2
        ExtentTestManager.log("Credential not match", LOGGER);
    }
    @Test(priority = 2)
    public void itemTest() {
        homePage.selectLink();
        homePage.setSelectLink1();
        homePage.linkResult();
        ExtentTestManager.log("Item Test Successful", LOGGER);
    }
    @Test(priority = 3)
    public void linkTest() {
        homePage.selectFromLink();
        homePage.linkText();
        ExtentTestManager.log("Link Test Successful", LOGGER);
    }

}
