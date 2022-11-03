package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearchDefinition {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();



    @When("user types apple clicks enter")
    public void userTypesClicksEnter2() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }


    @When("user types {string} clicks enter")
    public void userTypesClicksEnter(String searchKeyWord) {
        googleSearchPage.searchBox.sendKeys(searchKeyWord + Keys.ENTER);
    }

    @Then("user sees apple in the google title")
    public void user_sees_in_the_google_title() {
        String expectedTitle =  "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected, second arg as actual for result
        Assert.assertEquals("Title is not as expected", expectedTitle, actualTitle);


    }


    @Then("user sees {string} in the google title")
    public void user_sees_apple_in_the_google_title(String word) {
        String expectedTitle = word + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected, second arg as actual for result
        Assert.assertEquals("Title is not as expected", expectedTitle, actualTitle);

        //Since we will get boolean return type, that's why the order does not matter.
        //Assert.assertTrue(actualTitle.equals(expectedTitle) );

    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle="Google";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();
    }



}
