package com.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath="//a[normalize-space()='Signup / Login']")
    WebElement signup;

    @FindBy(xpath="//input[@placeholder='Name']")
    WebElement name;

    @FindBy(xpath="//input[@data-qa='signup-email']")
    WebElement email;

    @FindBy(xpath="//button[normalize-space()='Signup']")
    WebElement signupbtn;

    @FindBy(xpath="//label[@for='id_gender2']")
    WebElement title;

    @FindBy(id="password")
    WebElement password;


    @FindBy(id="first_name")
    WebElement firstName;

    @FindBy(id="last_name")
    WebElement lastName;

    @FindBy(id="address1")
    WebElement address;

    @FindBy(id="state")
    WebElement state;

    @FindBy(id="city")
    WebElement city;

    @FindBy(id="zipcode")
    WebElement zipcode;

    @FindBy(id="mobile_number")
    WebElement mobilenumber;

    @FindBy(xpath="//button[normalize-space()='Create Account']")
    WebElement createacc;

    @FindBy(xpath="//b[text()='Account Created!']")
    WebElement created;

    @FindBy(xpath="//p[contains(text(),'Email Address already exist')]")
    WebElement errmsg;

    public void clicksignup() {
        wait.until(ExpectedConditions.elementToBeClickable(signup));
        signup.click();

        
    }

    public void signUp(String username, String useremail) {
        name.sendKeys(username);
        email.sendKeys(useremail);
        signupbtn.click();
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOf(password),
                ExpectedConditions.visibilityOf(errmsg)
            ));
    }

    public void fillDetails(String pwd, String firstname, String lastname,
                            String addr, String State, String City,
                            String zip, String mobile) {

        title.click();
        password.sendKeys(pwd);

      

        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        address.sendKeys(addr);
        state.sendKeys(State);
        city.sendKeys(City);
        zipcode.sendKeys(zip);
        mobilenumber.sendKeys(mobile);
    }

    public void clickcreatebtn() {
        createacc.click();
        wait.until(ExpectedConditions.visibilityOf(created));
    }

    public String createdacc() {
               wait.until(ExpectedConditions.visibilityOf(created));
        return created.getText().trim();
    }

    public String errMessage() {
              wait.until(ExpectedConditions.visibilityOf(errmsg));
        return errmsg.getText().trim();
    }
}