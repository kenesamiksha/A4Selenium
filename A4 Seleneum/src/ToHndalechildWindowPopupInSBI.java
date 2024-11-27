import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHndalechildWindowPopupInSBI {
	private static Object allwindowIds;
	private static Object parentwindowId;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		String parantwindoId = driver.getWindowHandle();
		System.out.println(allwindowIds);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Set<String> allwindowIds = driver.getWindowHandles() ;
		
		// login to switch for window pop 
           allwindowIds.remove(parentwindowId);
		
			 
		 }
		
		driver.findElement(By.id("nextStep")).click();
		
		
		
	}
	

}
