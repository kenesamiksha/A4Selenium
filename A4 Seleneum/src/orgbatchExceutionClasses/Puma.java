package orgbatchExceutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Puma {
	@Test
	public void launchOne8() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en?");
		Reporter.log("Puma is launched", true);
		driver.quit();
	}

}
