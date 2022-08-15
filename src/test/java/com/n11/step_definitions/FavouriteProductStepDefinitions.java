package com.n11.step_definitions;

import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FavouriteProductStepDefinitions {
    @Given("user is on the login page of n11.com")
    public void user_is_on_the_login_page_of_n11_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("user enters username")
    public void user_enters_username() {

    }
    @Given("user enters password")
    public void user_enters_password() {

    }
    @Given("user clicks to login button")
    public void user_clicks_to_login_button() {

    }
    @Then("verify that user log in successfully")
    public void verify_that_user_log_in_succesfully() {

    }
    @Given("user see home page of N11.com")
    public void user_see_home_page_of_n11_com() {

    }
    @Given("verify that user should see home page of N11 website")
    public void verify_that_user_should_see_home_page_of_n11_website() {

    }
    @Given("user search {string} on the search button")
    public void user_search_on_the_search_button(String string) {

    }
    @Given("verify that {string} word is searched")
    public void verify_that_word_is_searched(String string) {

    }
    @Given("user click second page of Search page")
    public void user_click_second_page_of_search_page() {

    }
    @Given("verify that second page is opened")
    public void verify_that_second_page_is_opened() {

    }
    @Given("user put first {int} products in favourite")
    public void user_put_first_products_in_favourite(Integer int1) {

    }
    @Given("user click My Account button")
    public void user_click_my_account_button() {

    }
    @Given("user click My Favourite button")
    public void user_click_my_favourite_button() {

    }
    @Given("user click My List button")
    public void user_click_my_list_button() {

    }
    @Given("verify that My Favourite page is opened")
    public void verify_that_my_favourite_page_is_opened() {

    }
    @Given("user delete {int} of favourite products which are cheaper than others from List page")
    public void user_delete_of_favourite_products_which_are_cheaper_than_others_from_list_page(Integer int1) {

    }
    @Given("verify that product is deleted")
    public void verify_that_product_is_deleted() {

    }
    @Then("user log out from Page")
    public void user_log_out_from_page() {

    }
}
