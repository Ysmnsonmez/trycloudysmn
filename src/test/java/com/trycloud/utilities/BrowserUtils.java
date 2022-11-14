package com.trycloud.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BrowserUtils {

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method!");
        }
    }


    public static void verifyTitle(String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle,actualTitle, "Actual title is failed");
    }

    /**
     * This method will accept dropdown as a WebElement
     * and return all the options text in a List of String
     * @return List<String>
     */
    public static List<String> dropDownOptionAsAString (WebElement dropDownElement){
        Select select = new Select(dropDownElement);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();
        List<String> actualOptionAsString = new ArrayList<>();
        for(WebElement each : actualOptionsAsWebElement){
            actualOptionAsString.add(each.getText());
        }
        return actualOptionAsString;
    }

    /**
     * This method will accept a group of radio buttons as a List<WebElement>
     * it will loop through the List, and click to the radio button with provided attribute value
     * @param radioButtons
     * @param attributeValue
     */
    public static void clickRadioButton (List<WebElement> radioButtons, String attributeValue){
        for(WebElement each : radioButtons){
            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }
    }


    public static void waitForInvisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

}