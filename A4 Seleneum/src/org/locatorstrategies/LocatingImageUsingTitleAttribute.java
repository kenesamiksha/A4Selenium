package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingImageUsingTitleAttribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		driver.findElement(By.cssSelector("img[title=show products in category cell phones")).click();
		driver.findElement(By.cssSelector("img[title='show details for smartphone']")).click();
		
		
		
		
		
		
	}

}
