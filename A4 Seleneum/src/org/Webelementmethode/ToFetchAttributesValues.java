package org.Webelementmethode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchAttributesValues {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/login/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		String email = "harshaqspwak@gmail.com";
		emailTextBox.sendKeys(email);
	
	}

}