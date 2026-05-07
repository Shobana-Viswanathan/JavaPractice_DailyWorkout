package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddedWishlistPage extends BasePage {

    public AddedWishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td[@class='cart_description']/h4/a")
    WebElement cartProduct;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    WebElement proceedCheckout;

    @FindBy(xpath = "//u[contains(text(),'Register / Login')]")
    WebElement registerLogin;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement email;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement password;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    WebElement checkoutAgain;

    public String getCartProductName() {
        return cartProduct.getText();
    }

    public void checkoutLogin(String mail, String pass) {

        proceedCheckout.click();
        registerLogin.click();

        email.sendKeys(mail);
        password.sendKeys(pass);
        loginBtn.click();

        checkoutAgain.click();
    }
}