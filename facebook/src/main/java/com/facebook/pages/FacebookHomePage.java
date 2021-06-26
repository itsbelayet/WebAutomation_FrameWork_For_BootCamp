package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookHomePage {
    //**** For Sign IN

    @FindBy(xpath = "//input[@aria-label='Email or Phone Number']")
    private WebElement userName;

    @FindBy(xpath = "//input[@aria-label='Password']")
    private WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clicksubmit;

    public void enterUserName(String name) {
        userName.sendKeys(name);
    }
    public void enterUserPassword(String password) {
        userPassword.sendKeys(password);
    }
    public void clickButton() {
        clicksubmit.click();
    }
}
