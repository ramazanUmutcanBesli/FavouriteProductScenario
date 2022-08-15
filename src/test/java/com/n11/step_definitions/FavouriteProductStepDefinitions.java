package com.n11.step_definitions;

import com.n11.pages.BasePage;
import com.n11.pages.FavouritePage;
import com.n11.pages.LoginPage;
import com.n11.pages.SearchPage;


import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.n11.utilities.BrowserUtils.*;
import static org.junit.Assert.*;

public class FavouriteProductStepDefinitions {
    FavouritePage favouritePage = new FavouritePage();
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();
    BasePage basePage = new BasePage();
    JavascriptExecutor scriptExecutor = (JavascriptExecutor) Driver.getDriver();

    Actions actions = new Actions(Driver.getDriver());


    @Given("user is on the login page of n11.com")
    public void user_is_on_the_login_page_of_n11_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        basePage.loginPageButton.click();
    }

    @Given("user enters username")
    public void user_enters_username() {
        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @Given("user enters password")
    public void user_enters_password() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

    }

    @Given("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.loginButton.click();
    }

    @Then("verify that user log in successfully")
    public void verify_that_user_log_in_successfully() {
        assertTrue(basePage.loginVerifyButton.isEnabled());
    }

    @Given("user see home page of N11.com")
    public void user_see_home_page_of_n11_com() {
        basePage.homePageButton.click();
    }

    @Given("verify that user should see home page of N11 website")
    public void verify_that_user_should_see_home_page_of_n11_website() {
        verifyURLContains(ConfigurationReader.getProperty("url"));
    }

    @Given("user search {string} on the search button")
    public void user_search_on_the_search_button(String string) {
        basePage.searchBox.sendKeys(string);
        basePage.searchIcon.click();
    }

    @Given("verify that {string} word is searched")
    public void verify_that_word_is_searched(String string) {
        verifyTitleContains(string);
    }

    @Given("user click second page of Search page")
    public void user_click_second_page_of_search_page() {
        scriptExecutor.executeScript("arguments[0].click();", searchPage.secondPagination);
    }

    @Given("verify that {int} nd page is opened")
    public void verify_that_second_page_is_opened(Integer int1) {
        verifyURLContains(String.valueOf(int1));
    }

    @Given("user put first {int} products in favourite")
    public void user_put_first_products_in_favourite(Integer int2) {
        listOfProducts(searchPage.favouriteButton, int2);
    }

    @Given("user click My Account button")
    public void user_click_my_account_button() {
        basePage.loginVerifyButton.click();
    }

    @Given("user click My Favourite button")
    public void user_click_my_favourite_button() {
        favouritePage.favouriteListButton.click();
    }

    @Given("user click My List button")
    public void user_click_my_list_button() {
        favouritePage.favouriteList.click();
    }

    @Given("verify that My Favourite page is opened")
    public void verify_that_my_favourite_page_is_opened() {
        verifyURLContains(favouritePage.favouriteList.getAttribute("href"));
    }

    @Given("user delete {int} of favourite products which are cheaper than others from List page")
    public void user_delete_of_favourite_products_which_are_cheaper_than_others_from_list_page(Integer int1) {
        List<WebElement> product= cheaperProductList(favouritePage.listOfProduct);

    }

    @Given("verify that product is deleted")
    public void verify_that_product_is_deleted() {

    }

    @Then("user log out from Page")
    public void user_log_out_from_page() {

    }
}
