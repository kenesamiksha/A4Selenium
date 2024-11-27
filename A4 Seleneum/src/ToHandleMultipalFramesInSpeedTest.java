import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleMultipalFramesInSpeedTest {

	public static void main(String[] args, String FrameElement) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.of(15, null));
		driver.get("https://www.speedtest.net/");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		WebElement frameElement = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(FrameElement);
	
	
		
	}

}
