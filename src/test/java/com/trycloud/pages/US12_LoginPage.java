package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12_LoginPage {
    public US12_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement username;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
        public WebElement file;


    @FindBy (xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actions;

    @FindBy (xpath = "//a[@class='menuitem action action-details permanent']")
    public WebElement details;

    @FindBy (id = "commentsTabView")
    public WebElement comments;

    @FindBy (xpath = "//div[@class='message']")
    public WebElement message;

    @FindBy (xpath = "(//input[@type='submit'])[2]")
    public WebElement postButton;

    @FindBy (xpath = "(//div[@class='message'])[2]")
    public WebElement commentMessage;

}
