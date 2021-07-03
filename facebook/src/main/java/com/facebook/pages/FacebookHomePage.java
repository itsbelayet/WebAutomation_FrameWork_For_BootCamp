package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FacebookHomePage {
    //**** For Sign IN
    @FindBy(xpath = "//input[@aria-label='Email or Phone Number']")
    private WebElement userName;
    @FindBy(xpath = "//input[@aria-label='Password']")
    private WebElement userPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clicksubmit;
    @FindBy(xpath = "//div[@aria-label='Account']")
    private WebElement logOut;
    @FindBy(xpath = "//span[normalize-space()='Log Out']")
    private WebElement logOutButton;

    //-- Search for a name
    @FindBy(xpath = "//input[@placeholder='Search Facebook']")
    private WebElement searchName;
    @FindBy(xpath = "//div[@class='thwo4zme taijpn5t tv7at329 j83agx80 k77z8yql qs9ysxi8 arfg74bv n00je7tq is6700om bp9cbjyn']")
    private WebElement clickSearch;
    @FindBy(xpath = "//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 r8blr3vg']")
    private WebElement findName;

    //---- Upload Image
    @FindBy(xpath = "//span[contains(text(),'Photo/Video')]")
    private WebElement uploadPic;
    @FindBy(xpath = "//span[normalize-space()='What's on your mind, Labonyo?']")
    private WebElement uploadClick;
    @FindBy(xpath = "//div[@aria-label='What's on your mind, Labonyo?']")
    private WebElement sendText;
    @FindBy(xpath = "//div[@aria-label='Photo/Video']//div//div//i[@class='hu5pjgll bixrwtb6']")
    private WebElement sendPic;

    public void uploadPic(){
        uploadPic.sendKeys("D:/Belayet/My Photo/view.jpg");
    }
    public void uploadClick(){
        uploadClick.sendKeys("Hi, this is me");
    }
    public void sendText(){
        sendText.sendKeys("Hi, this is me");
    }
    public void sendPic(){
        sendPic.sendKeys("D:/Belayet/My Photo/view.jpg");
    }
    //--
    public void enterUserName(String name) {
        userName.sendKeys(name);
    }
    public void enterUserPassword(String password) {
        userPassword.sendKeys(password);
    }
    public void clickButton() {
        clicksubmit.click();
    }
    public void logOut(){
        logOut.click();
    }
    public void logOutButton(){
        logOutButton.click();
    }
    //--
    public void searchName(String name){
        searchName.sendKeys(name);
    }
    public void clickSearch(){
        clickSearch.click();
    }
    public void findName(String display){
        Assert.assertTrue(findName.getText().contains(display),"Search not match");
    }

}
