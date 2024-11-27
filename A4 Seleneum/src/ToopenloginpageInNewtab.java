import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToopenloginpageInNewtab {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String ParentwindowId = driver.getWindowHandle();
	WebElement loginiLink = driver.findElement(By.linkText("Log in"));
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL).click(loginiLink).perform();
	
	//
	
	 Set<String> allWindowId = driver.getWindowHandles();
	 
	 
	 for(String windowId:allWindowId)
		 	 
	 {
		 driver.switchTo().window(windowId);
		 
	 }
		 
}
}
