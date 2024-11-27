import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOHandleMultipalFrameInSpeedtex {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoqa.com/nestedframes");
		 driver.switchTo().frame("frame1");
		 WebElement parentFrameTex = driver.findElement(By.tagName("body"));
		String text1=parentFrameTex.getText();
		System.out.println(text1);
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc="))
		
		 
		 
		 
		
	}

}
