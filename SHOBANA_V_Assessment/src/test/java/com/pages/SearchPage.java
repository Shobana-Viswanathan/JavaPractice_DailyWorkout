package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Products')]")
    WebElement products;

    @FindBy(id = "search_product")
    WebElement searchBox;

    @FindBy(id = "submit_search")
    WebElement searchBtn;

    @FindBy(xpath = "(//div[@class='productinfo text-center']/p)[1]")
    WebElement firstProductName;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    WebElement addCart;

    @FindBy(xpath = "//u[contains(text(),'View Cart')]")
    WebElement viewCart;

    public void searchProduct(String item) {
        products.click();
        searchBox.sendKeys(item);
        searchBtn.click();
    }

    public String getProductName() {
        return firstProductName.getText();
    }

    public void addToCart() {
        addCart.click();
    }

    public void clickViewCart() {
        viewCart.click();
    }
}