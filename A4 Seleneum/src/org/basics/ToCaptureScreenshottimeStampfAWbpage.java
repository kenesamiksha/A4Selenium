package org.basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureScreenshottimeStampfAWbpage {
		public static void main(String[] args) throws IOException {
			LocalDateTime ldt = LocalDateTime.now();
			String timestamp = ldt.toString().replaceAll(":","_");					
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.yamaha-motor-india.com/");
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File Screenshot = ts.getScreenshotAs(OutputType.FILE);
			 
			String timeStamp = null;
			File dest = new File(".\\errorshote\\"+timeStamp+"creenshort.png");
			
			FileHandler.copy(Screenshot, dest);
			
			
			
		
	}

}
i