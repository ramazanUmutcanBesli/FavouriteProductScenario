package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage extends BasePage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div/a[.='2']")
    public WebElement secondPagination;

    @FindBy(xpath = "//li[3]/div/div/a/div/img[@class='lazy cardImage']")
    public WebElement thirdProduct;
    @FindBy(xpath = "//div[@class='close']")
    public WebElement closeButton;
    @FindBy(xpath = "//div[2]/div/div/button[@class='addBasketUnify']")
    public WebElement addCart;

    @FindBy(xpath = "//i[@class='iconsBasketWhite']")
    public  WebElement cartBox;

    @FindBy(xpath = "//span[@class='removeProd svgIcon svgIcon_trash']")
    public WebElement deleteButton;
    @FindBy(id = "deleteBtnDFLB")
    public WebElement deleteClick;

    @FindBy(xpath = "//span[@class='btn btnBlack']")
    public WebElement aydinlatmaMetni;
    @FindBy(xpath = "//h2[@class='title']")
    public WebElement pageIsEmptyMessage;


}
