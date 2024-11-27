import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPooUp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/samu%20%20r/Desktop/popup.html");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("Popup")).click();
		
		
		
		
		
		
	}

}
