import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingImplictwaitInReliancedigital {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.id("wzrk-cancel")).click();
		WebElement homeAppliances = driver.findElement(By.xpath("//div[text()='Home Appliances]"));
		Actions action = new Actions(driver);
		action.moveToElement(homeAppliances).perform();
		
	}

}
