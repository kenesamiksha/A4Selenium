package org.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetichingTittalIInPurplle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Purplle.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
        driver.findElement("nav-search-submit-button")).sendkays();
}
}
