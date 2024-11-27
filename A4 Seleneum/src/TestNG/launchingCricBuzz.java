package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class launchingCricBuzz {
	@Test(invocationCount = 5)
	public void launchingApplication() {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Brouser is lounched",true);
		driver.manage().window().maximize();
		Reporter.log("Brouser maximized ",true);
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Navigated to cricBuzz application",true);
		//driver.quit();
		Reporter.log("Browser is closed ",true);
		
		
	
	}

}
