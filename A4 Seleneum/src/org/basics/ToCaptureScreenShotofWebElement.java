package org.basics;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;

import org.openqa.selenium.chrome.ChromeDriver;


public class ToCaptureScreenShotofWebElement {
	public static void main(String[] args) {
		LocalDateTime  ldt =  LocalDateTime.now();
		String timeStamp=ldt.toString().replaceAll(":","_");
		
		webDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://cadburygifting.in/personalised-gifts.html?");
		
		
		
			
	}

}
