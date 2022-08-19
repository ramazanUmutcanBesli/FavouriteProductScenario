package com.n11.step_definitions;

import com.n11.pages.BasePage;
import com.n11.pages.LoginPage;
import com.n11.pages.SearchPage;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

import static com.n11.utilities.BrowserUtils.*;
import static org.junit.Assert.*;

public class ProductInShoppingCartStepDefinitions {
    SearchPage searchPage = new SearchPage();
    LoginPage loginPage=new LoginPage();
    BasePage basePage = new BasePage();
    JavascriptExecutor scriptExecutor = (JavascriptExecutor) Driver.getDriver();
    @Given("user is on Home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        basePage.textButton.click();
        loginPage.acceptButton.click();
    }
    @Given("user search {string} on search box")
    public void user_search_on_search_box(String string) {
        basePage.searchBox.sendKeys(string);
        basePage.searchIcon.click();
    }
    @Given("verify {string} word is displayed")
    public void verify_word_is_displayed(String string) {
        verifyTitleContains(string);
    }
    @Given("user click second page of iphone page")
    public void user_click_second_page_of_iphone_page() {
        scriptExecutor.executeScript("arguments[0].click();", searchPage.secondPagination);
    }
    @Given("verify {int} nd page is opened")
    public void verify_nd_page_is_opened(Integer int1) {
        verifyURLContains(String.valueOf(int1));
    }
    @Given("user put {int} rd product in shopping cart")
    public void user_put_rd_product_in_shopping_cart() {
        searchPage.thirdProduct.click();
        searchPage.closeButton.click();
        sleep(3);
        searchPage.addCart.click();
    }
    @Given("user move to shopping cart page")
    public void user_move_to_shopping_cart_page() {
        searchPage.cartBox.click();
    }
    @Then("user delete this product from shopping cart")
    public void user_delete_this_product_from_shopping_cart() {
        searchPage.aydinlatmaMetni.click();
        searchPage.deleteButton.click();
        sleep(3);
        searchPage.deleteClick.click();
        assertEquals("Sepetin Boş Görünüyor",searchPage.pageIsEmptyMessage.getText());
        sleep(4);
        basePage.homePageButton.click();

    }


}
