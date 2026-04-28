package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;



public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
  @FindBy(name="username")
  public WebElement userName;
  @FindBy(name="password")
  public WebElement password;
  
  @FindBy(xpath="//h5[text()='Login']")
  public WebElement login_text;
  
  @FindBy(xpath="//button[@type='submit']")
  public WebElement login;
 @FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
 public WebElement invaliderr;
  //set username in textbox
  public void setUserName(String strUserName) {
	  userName.sendKeys(strUserName);
   }
  //set password
  public void setPassword(String strPassword) {
	  password.sendKeys(strPassword);
  }
  //click login button
  public void clickLogin() {
	  login.click();
  }
  //get the title of login page(inner text)
  public String getLoginTitle() {
	  return login_text.getText();
  }
  public String getErrText() {
	return invaliderr.getText();
  }
  public void login(String strUserName,String strPassword) {
	  //fill username
	  this.setUserName(strUserName);
	  //fill password
	  this.setPassword(strPassword);
	  //click login button
	  this.clickLogin();
  }
 
}
