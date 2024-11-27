import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingWebDriverwaitInShopperstack {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/products_page/23");
		WebElement checkDeliveryTextBox = driver.findElement(By.id("check Delivery"));
		WebElement chectButton = driver.findElement(By.id("Check"));
		checkDeliveryTextBox.sendKeys("411033");
		explicitWait.until(ExpectedConditions.elementToBeClickable(chectButton));
		chectButton.click();
	
	
		
	}
}
