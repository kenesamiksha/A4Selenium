import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LonchingBrowserInInCognitoMode {
	public static void main(String[] args) {
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(setting);
		driver.get("https://www.youtube.com/");
	}

}
