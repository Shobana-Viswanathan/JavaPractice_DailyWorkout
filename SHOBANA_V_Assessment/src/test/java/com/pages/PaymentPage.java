package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//textarea[@name='message']")
    WebElement commentBox;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    WebElement placeOrder;

    @FindBy(name = "name_on_card")
    WebElement cardName;

    @FindBy(name = "card_number")
    WebElement cardNumber;

    @FindBy(name = "cvc")
    WebElement cvc;

    @FindBy(name = "expiry_month")
    WebElement month;

    @FindBy(name = "expiry_year")
    WebElement year;

    @FindBy(id = "submit")
    WebElement payBtn;

    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your order has been confirmed!')]")
    WebElement orderMsg;

    public void placeOrderFlow() {

        commentBox.sendKeys("order placed successfully");
        placeOrder.click();
    }

    public void payment(String name, String card, String cvcNum, String mon, String yr) {

        cardName.sendKeys(name);
        cardNumber.sendKeys(card);
        cvc.sendKeys(cvcNum);
        month.sendKeys(mon);
        year.sendKeys(yr);

        payBtn.click();
    }

    public String confirmationMessage() {
        return orderMsg.getText();
    }
}