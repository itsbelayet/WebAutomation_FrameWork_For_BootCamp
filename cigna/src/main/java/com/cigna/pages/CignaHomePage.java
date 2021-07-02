package com.cigna.pages;

import com.pnt.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Set;

public class CignaHomePage extends TestBase {
    //**** For Sign IN
    @FindBy(xpath = "//li[@class='list-inline-item']//a[@class='btn btn-sm btn-primary'][normalize-space()='Log in to myCigna']")
    private WebElement signInClick;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement userName;
    @FindBy(xpath = "//*[@id='password']")
    private WebElement userPass;
    @FindBy(xpath = "//input[@id='loginbutton']")
    private WebElement submit;
    @FindBy(xpath = "//div[@id='alertmessage']")
    private WebElement errorMsg1;
    @FindBy(xpath = "/html/body/main/div/h2")
    private WebElement errorMsg2;

    // Select Item
    @FindBy(linkText = "Individuals and Families")
    private WebElement selectLink;
    @FindBy(linkText = "Health and Wellness")
    private WebElement selectLink1;
    @FindBy(xpath = "//*[@id='scroll-hero']/div[2]/div/div[2]/h1")
    private WebElement linkResult;

    // Select from Link
    @FindBy(linkText = "Find a Form")
    private WebElement selectFromLink;
    @FindBy(xpath = "//*[@id='contact-us-ct']/h1")
    private WebElement linkText;

    public void clickLogin() {
        signInClick.click();
    }
    public void userID(String name){
        userName.sendKeys(name);
    }
    public void userPass(String password){
        userPass.sendKeys(password);
    }
    public void clickSubmit(){
        submit.click();
    }
    public void errorMessage1(){
        errorMsg1.getText();
        Assert.assertTrue(errorMsg1.getText().contains("The username and password combination you entered does not match"), "Result not match");
    }
    public void errorMessage2(){
        errorMsg2.getText();
        Assert.assertTrue(errorMsg2.getText().contains("Are you human?"), "Result not match");
    }

    //----
    public void selectLink(){
        WebElement item = selectLink;
        Actions actions = new Actions(driver);
        actions.moveToElement(item).build().perform();
    }
    public void setSelectLink1(){
        selectLink1.click();
    }
    public void linkResult(){
        Assert.assertTrue(linkResult.getText().contains("The Better Health Challenge. Accepted"), "Result not match");
    }

    //----------
    public void selectFromLink(){
        selectFromLink.click();
    }
    public void linkText(){
        Assert.assertTrue(linkText.getText().contains("CUSTOMER FORMS"),"Result not match");
    }

}
