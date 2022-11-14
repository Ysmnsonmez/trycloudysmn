package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.trycloud.utilities.ConfigReader;

import static org.junit.Assert.assertTrue;

public class Login_Page {
    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit-form")
    private WebElement loginBtn;

    @FindBy(xpath = "//p[normalize-space(text())='Wrong password.']")
     private WebElement warningMsg;
    @FindBy(xpath = "(//a[@href='http://qa3.trycloud.net/index.php/apps/spreed/'])[1]")
    public WebElement talkModule;

    @FindBy(css = ".warning.wrongPasswordMsg")
    private WebElement warningGeneral;

    public void userPassType(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void loginButtonClick() {
        loginBtn.click();
    }

    public void loginVerification() {
        assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }
    public void login() throws InterruptedException {
        usernameInput.sendKeys(ConfigReader.getProperty("username"));
        passwordInput.sendKeys(ConfigReader.getProperty("password"));
        loginBtn.click();
        assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
        //Thread.sleep(5000);
    }
}
