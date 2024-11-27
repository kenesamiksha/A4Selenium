import java.nio.file.FileSystemNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fechingSourcecodeusingetpagesource{ 
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-moter-india.com/");
		String Window = driver. getWindowHandle();
	    System.out.println(WindowId);
}
}
