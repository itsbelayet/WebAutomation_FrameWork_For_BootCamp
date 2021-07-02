package com.citibank.pages;

import com.pnt.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CitibankHomePage extends TestBase {
    //Login
    @FindBy(xpath = "//input[@id='username']")
    private WebElement userID;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement userPass;
    @FindBy(xpath = "//button[@id='signInBtn']")
    private WebElement submit;
    @FindBy(xpath = "//*[@id='logInForm']/form/div/citi-errors/div/div/div/span[1]")
    private WebElement displayMsg;

    //--------------
    @FindBy(linkText = "Credit Cards")
    private WebElement selectItem;
    @FindBy(linkText = "Travel Credit Cards")
    private WebElement selectFromItem;
    @FindBy(xpath = "//*[@id='ca-DD-mppTitle']/h1")
    private WebElement itemText;

    //--------------------------
    public void userID(String name) {
        userID.sendKeys(name);
    }

    public void pserPass(String pass) {
        userPass.sendKeys(pass);
    }

    public void submit() {
        submit.click();
    }

    public void displayMsg() {
        Assert.assertTrue(displayMsg.getText().contains("Trouble signing on?"), "Result not match");
    }

    //------------
    public void selectItem() {
        WebElement item = selectItem;
        Actions actions = new Actions(driver);
        actions.moveToElement(item).build().perform();
    }

    public void selectFromItem() {
        selectFromItem.click();
        sleepFor(2);
        Assert.assertTrue(itemText.getText().contains("Travel Rewards Credit Cards"), "Result not match");
    }

}
