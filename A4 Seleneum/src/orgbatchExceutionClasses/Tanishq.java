package orgbatchExceutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tanishq {
	@Test
	public void launchOne8() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tanishq.co.in/shop/jewellery?");
		Reporter.log("Tanishq is launched", true);
		driver.quit();
	

}

}
