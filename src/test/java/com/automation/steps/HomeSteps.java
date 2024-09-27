package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage=new HomePage();

    @Given("user opens the website")
    public void user_opens_the_website() {
        homePage.openWebSite();
    }

    @When("user search for element1 {string}")
    public void user_search_for_element1(String elem1) {
        homePage.sendElement1(ConfigReader.getConfigValue(elem1));
    }


    @Then("verify user is on home page again")
    public void verify_user_is_on_home_page_again() {

    }

}
