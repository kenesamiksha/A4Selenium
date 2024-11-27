package org.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementUsingpartialLinkTextlocater {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotercycle.co.in/product-details/hayabusa");
		driver.findElement(By.partialLinkText("ACCESSORIES")).click();
		
	}

}
