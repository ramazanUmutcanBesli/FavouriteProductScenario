package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className = "btnSignIn")
    public WebElement loginPageButton;

    @FindBy(xpath = "//a[@class='logo  home ']")
    public WebElement homePageButton;

    @FindBy(id = "searchData")
    public WebElement searchBox;

    @FindBy(className = "iconsSearch")
    public WebElement searchIcon;

    @FindBy(className = "logoutBtn")
    public WebElement logOutButton;


}
