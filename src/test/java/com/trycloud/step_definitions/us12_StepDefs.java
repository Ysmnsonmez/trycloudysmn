package com.trycloud.step_definitions;

import com.trycloud.pages.Login_Page;
import com.trycloud.pages.US12_LoginPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class us12_StepDefs extends TestBase {
 Login_Page login_page =new Login_Page();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() throws InterruptedException {
        login =new Login_Page();
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        login.login();

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String talk) throws InterruptedException {

       login_page.talkModule.click();
       Thread.sleep(3000);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(" Trycloud"));

    }
}

