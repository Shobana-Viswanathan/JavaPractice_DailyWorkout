package com.expleo.javaSelenium.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> find=driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
		int cs=find.size();
		/*System.out.println(find.size());
		for(WebElement name:find) {
			System.out.println(name.getText());
		}*/
		List<WebElement> row=driver.findElements(By.xpath("//table[@id=\\\"table1\\\"]//tr"));
		int r=row.size();
		for(int i=1;i<r;i++) {
			for(int j=r;j<cs;j++) {
				if(i==1) {
				WebElement data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr[" + i +"]//th["+j+"]"));
				}
				else {
					
				}
			}
		}
    	}
	

}
