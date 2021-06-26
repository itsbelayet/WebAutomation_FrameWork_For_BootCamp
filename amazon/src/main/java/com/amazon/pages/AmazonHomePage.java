package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AmazonHomePage {
    //**** For Sign IN
    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement searchLogin;
    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement searchBox;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement signInButton;
    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInClick;

    public void clickLogin() {
        searchLogin.click();
    }
    public void typeEmail(String email) {
        searchBox.sendKeys(email);
    }
    public void clickOnSignInButton() {
        signInButton.click();
    }
    public void enterPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void clickSignIn(){
        signInClick.click();
    }

    // Sign Out
    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    private WebElement searchSignOut;
    @FindBy(xpath = "//*[@id='nav-item-signout']")
    private WebElement signOutClick;

    public void clkSignOut(){
        searchSignOut.click();
    }
    public void clickSignOut(){
        signOutClick.click();
    }
    // Search Item and Verify
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(xpath ="//span[@class='a-color-state a-text-bold']" )
    private WebElement actuText;

    public void typeOnSearchBar(String text) {
        searchTextBox.sendKeys(text);
    }
    public void clickOnSearchButton() {
        searchButton.click();
    }
    public void findText(String expect){
        Assert.assertTrue(actuText.getText().contains(expect), "Hi, Tex Not Match");
    }
}
