package com.cnn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CNNHomePage {
    // For Login-out CNN
    @FindBy(xpath = "//div[@id='nav__plain-header']//div[6]//div[1]//*[local-name()='svg']")
    private WebElement searchLogin;
    @FindBy(xpath = "//input[@aria-label='Email address']")
    private WebElement userName;
    @FindBy(xpath = "//input[@aria-label='Password']")
    private WebElement userPassword;
    @FindBy(xpath = "//button[@id='login-form-button']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='Box-sc-1fet97o-0 hyVhvp']")
    private WebElement logoutButton;

    public void searchButton(){
        searchLogin.click();
    }
    public void enterName(String name){
        userName.sendKeys(name);
    }
    public void enterPassword(String password){
        userPassword.sendKeys(password);
    }
    public void submitButton(){
        loginButton.click();
    }
    public void closeButton(){
        logoutButton.click();
    }

//    public void findText(String expect){
//        Assert.assertTrue(actuText.getText().contains(expect), "Hi, Tex Not Match");
//    }

}
