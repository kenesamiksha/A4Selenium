package TestNG;
 

import org.testng.annotations.Test;

public class UnderstandingTestNg {
	@Test  
	public void test() {
		System.out.println("hello");
			
	}
   @Test(priority = 5)
   public void test2() {
	   System.out.println("samiksha");
      
   }
   @Test(priority = - 1)
   public void test3() {
	   System.out.println("Kene");
   }
}
//priority is a helper attribute it priorities execution of test methods
