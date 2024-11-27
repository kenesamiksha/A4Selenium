import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnteraElementInDream11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.of(15, null));
		driver.get("https://www.dream11.com/");
		//1.frame(int index)
		//driver.switchTo().frame(0);
		//2.frame(String nameDrId)
		//driver.switchTo().frame("send.sms.iframe")
		//3.frame(WebElement frameElement)
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("regEmail")).sendKeys("7517062458");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Shamiksha")).click();
		
	
		
		
		
	}

}
