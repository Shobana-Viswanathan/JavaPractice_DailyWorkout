package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
WebDriverWait wait;
    public LoginPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signup;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement email;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginbtn;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    WebElement errmsg;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    WebElement loggeduser;

    public void clicksignup() {
        wait.until(ExpectedConditions.elementToBeClickable(signup));
        signup.click();
    }

    public void login(String useremail, String userpassword) {
    	wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(useremail);
        password.sendKeys(userpassword);
        loginbtn.click();
    }

    public String getLoggedUser() {
        
        wait .until(ExpectedConditions.visibilityOf(loggeduser));
        return loggeduser.getText();
    }

    public String getErrorMessage() {
        
        wait.until(ExpectedConditions.visibilityOf(errmsg));
        return errmsg.getText();
    }
}