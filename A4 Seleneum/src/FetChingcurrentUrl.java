import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetChingcurrentUrl {
	public static void main(String[]args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
	
	}
}
