package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends BasePage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div/a[.='2']")
    public WebElement secondPagination;

    @FindBy(xpath = "//span[@class='followBtn']")
    public List<WebElement> favouriteButton;


}
