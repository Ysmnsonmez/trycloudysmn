package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li")
    public List<WebElement> leftHeader;

    @FindBy (xpath = "//div[@class='header-menu unified-search']")
    public WebElement searchIcon;

    @FindBy (xpath = "//div[@class='notifications-button menutoggle']")
    public WebElement notificationIcon;

    @FindBy (xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactsIcon;

    @FindBy (xpath = "//div[@id='settings']")
    public WebElement userOpenMenu;

    @FindBy (xpath = "//div[@id='settings']/nav/ul/li")
    public List<WebElement> dropDownUserOpenMenu;

}
