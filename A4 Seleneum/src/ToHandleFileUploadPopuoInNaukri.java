import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopuoInNaukri {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.xpath("//h2[contains()text(),'experienced')]")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume,]")).clear();
		Runtime.getRuntime().exec("")
		
		
		
	}

}
