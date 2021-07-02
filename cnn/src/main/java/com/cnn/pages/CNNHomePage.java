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

    // Navigation Tab
    @FindBy(xpath = "//a[@type='collapsed'][normalize-space()='Entertainment']")
    private WebElement newsItem;
    @FindBy(xpath = "//div[@class='Cell-i0zvfi-0 sc-kgAjT jYQwPK']//a[@aria-label='Entertainment']//*[local-name()='svg']")
    private WebElement displayItem;

    //
    @FindBy(xpath = "//*[@id='homepage2-zone-1']/div[2]/div/div[2]/ul/li[1]/article/div/div[2]/h3/a/span[2]/strong")
    private WebElement newsHead;
    @FindBy(xpath = "/html/body/div[6]/article/div[1]/h1")
    private WebElement newsText;

    //
    @FindBy(xpath = "//div[@class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN']//button[@class='sc-jhAzac sc-gisBJw hioqcg']//*[local-name()='svg']")
    private WebElement findNews;
    @FindBy(xpath = "//input[@id='header-search-bar']")
    private WebElement sendItem;
    @FindBy(xpath = "//*[@id='header-nav-container']/div/div[2]/div/div[1]/form/button/div[1]")
    private WebElement clickSearch;
    @FindBy(xpath = "//strong[normalize-space()='politics']")
    private WebElement displaySearch;

    // =======================================
    public void searchButton() {
        searchLogin.click();
    }

    public void enterName(String name) {
        userName.sendKeys(name);
    }

    public void enterPassword(String password) {
        userPassword.sendKeys(password);
    }

    public void submitButton() {
        loginButton.click();
    }

    public void closeButton() {
        logoutButton.click();
    }

    //----------------------------------
    public void searchItem() {
        newsItem.click();
    }

    public void searchResult() {
        boolean chkDisplay = displayItem.isDisplayed();
        Assert.assertTrue(chkDisplay, "Logo not Display");
    }

    //------------------------------------
    public void searchNews() {
        newsHead.click();
    }

    public void showNews(String newsBody) {
        Assert.assertTrue(newsText.getText().contains(newsBody), "Text not match");
    }

    //-------------------------------
    public void findNews() {
        findNews.click();
    }

    public void sendItem(String news) {
        sendItem.sendKeys(news);
    }

    public void clickSearch() {
        clickSearch.click();
    }

    public void displaySearch(String aspectedResult) {
        Assert.assertTrue(displaySearch.getText().contains(aspectedResult), "Resust not match");
    }

}
