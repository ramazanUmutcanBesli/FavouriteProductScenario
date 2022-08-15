package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FavouritePage extends BasePage{
    public FavouritePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='https://www.n11.com/hesabim/istek-listelerim']")
    public WebElement favouriteListButton;

    @FindBy(xpath = "//a[@href='https://www.n11.com/hesabim/favorilerim']/h4[@class='listItemTitle']")
    public WebElement favouriteList;

    @FindBy(xpath = "//div[@class='group listingGroup wishListGroup wishListFavorite']//ins")
    public List<WebElement> listOfProduct;
    @FindBy(xpath = "//span[@class='deleteProFromFavorites']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[@class='btn btnBlack confirm']")
    public WebElement okButton;

}
