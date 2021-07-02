package com.citibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CitibankHomePage {
    @FindBy(xpath = "//input[@id='username']")
    private WebElement userID;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement userPass;
    @FindBy(xpath = "//button[@id='signInBtn']")
    private WebElement submit;
    @FindBy(xpath = "//*[@id='logInForm']/form/div/citi-errors/div/div/div/span[1]")
    private WebElement displayMsg;

    public void userID(String name) {
        userID.sendKeys(name);
    }
    public void pserPass(String pass) {
        userPass.sendKeys(pass);
    }
    public void submit() {
        submit.click();
    }
    public void displayMsg(){
        Assert.assertTrue(displayMsg.getText().contains("Trouble signing on?"), "Result not match");
    }

    /*
    @Test(enabled = true)
    public static void mouseHover() {
        setupBrowser("chrome", "https://www.citibank.com");
        WebElement item = driver.findElement(By.linkText("Credit Cards"));
        Actions actions = new Actions(driver);
        actions.moveToElement(item).build().perform();
        driver.findElement(By.linkText("Travel Credit Cards")).click();
        String searchText = driver.findElement(By.xpath(" //*[@id='ca-DD-mppTitle']/h1")).getText();
        Assert.assertTrue(searchText.contains("Travel Rewards Credit Cards"), "Result not match");
        logger.info("Hi, Successfully Click Link Text");
        closeBrowser();
    }
     */
}
