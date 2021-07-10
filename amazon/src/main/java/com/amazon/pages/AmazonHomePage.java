package com.amazon.pages;

import com.pnt.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AmazonHomePage extends TestBase {
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
        WebElement item = searchSignOut;
        Actions actions= new Actions(driver);
        actions.moveToElement(item).build().perform();
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

    // Browse products & use shooping cart
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement checkBox;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement checkButton;
    @FindBy(xpath = "//*[@id='search']/div[1]/div/div[1]/div/span[3]/div[2]/div[5]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")
    private WebElement product;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCart;
    @FindBy(xpath = "//input[@aria-labelledby='attachSiNoCoverage-announce']")
    private WebElement noThanks;
    @FindBy(xpath = "//*[@id='attach-sidesheet-checkout-button']/span/input")
    private WebElement checkOut;

    public void checkBox(String item){
        checkBox.sendKeys(item);
    }
    public void checkButton(){
        checkButton.click();
    }
    public void product(){
        product.click();
    }
    public void addToCart(){
        addToCart.click();
    }
    public void noThanks(){
        noThanks.click();
    }
    public void checkOut(){
        checkOut.click();
    }
}
