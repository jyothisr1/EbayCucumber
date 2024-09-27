package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CartSteps {


    CartPage cartpage = new CartPage();
    HomePage homePage=new HomePage();

    @Then("verify the user is on element1 searched page")
    public void verify_the_user_is_on_element1_searched_page() {
//        Assert.assertTrue();

    }

    @Then("Click the first element of element1")
    public void click_the_first_element_of_element1() {
        cartpage.clickFirstElement();
    }

    @Then("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        cartpage.clickAddToBtnForElement1();


    }

    @Then("user switch to previous window")
    public void user_switch_to_previous_window() {

    }

    @Then("user navigate back to home page")
    public void user_navigate_back_to_home_page() {

    }

    @When("user search for element2 {string}")
    public void user_search_for_element2(String elem2) {
        cartpage.searchElement2(ConfigReader.getConfigValue(elem2));
        cartpage.clickFirstElement();
    }

    @Then("verify the user is on element2 searched page")
    public void verify_the_user_is_on_element2_searched_page() {

    }

    @Then("Click the first element of element2")
    public void click_the_first_element_of_element2() {
        cartpage.clickAddToBtnForElement1();

    }

    @Then("verify item information on cart page")
    public void verify_item_information_on_cart_page() {
        Assert.assertTrue(cartpage.ElementCount());

    }

    @Then("verify item prices display correctly on cart page")
    public void verify_item_prices_display_correctly_on_cart_page() {
        Assert.assertTrue(cartpage.totalPrice());

    }
}
