
import java.lang.annotation.Target;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingonpositionofwindow {
public static void main(String[]args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https:/www.one8.com/");
Point position = driver.manage().window().getPosition();
System.out.println(position);
System.out.println("X coordinate :" +position.getX());
System.out.println("Y coordinate :" +position.getY());
Point tergetposition = new Point(300,100);
Thread.sleep(500);
//changinh position usind setposition() by passing point object
driver.manage().window().setPosition(tergetposition);



}

}
		
		
		


 