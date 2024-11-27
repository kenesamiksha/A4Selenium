package org.basics;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToperFormMouseHoverAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.reliancedigital.in/?");
        Thread.sleep(3000);
        driver.findElement(By.id("wzrk-cancel")).click();
        WebElement homeApliances = driver.findElement(By.xpath("//div[text()='Home Appliances]"));
        Actions actions = new Actions(driver);
        actions .moveToElement(homeApliances).perform();
        
        
        
		
		
		
	}

}
