package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
  WebDriver driver;
  By userName=By.xpath("//input[@name=\"username\"]");
  By password=By.xpath("//input[@name=\"password\"]");
  By titleText=By.xpath("//h5[text()=\"Login\"]");
  By login=By.xpath("//button[@type=\"submit\"]");
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
  }
  //set username in textbox
  public void setUserName(String strUserName) {
	  driver.findElement(userName).sendKeys(strUserName);
  }
  //set password
  public void setPassword(String strPassword) {
	  driver.findElement(password).sendKeys(strPassword);
  }
  //click login button
  public void clickLogin() {
	  driver.findElement(login).click();;
  }
  //get the title of login page(inner text)
  public String getLoginTitle() {
	  return driver.findElement(titleText).getText();
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
