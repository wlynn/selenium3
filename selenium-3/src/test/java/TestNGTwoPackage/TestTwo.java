package TestNGTwoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestTwo {
	
	WebDriver driver = new FirefoxDriver();
	
	@AfterTest
	public void close() {
		driver.close();
		driver.quit();
	}
	
  @Test (priority=4)
  public void Test1() {
	  System.out.println("Test1");
  }
  
  @Test (priority=3)
  public void Test2() {
	  System.out.println("Test2");
  }
  
  @Test (priority=2)
  public void Test3() {
	  System.out.println("Test3");
  }
  
  @Test (priority=1)
  public void Test4() {
	  System.out.println("Test4");
  }
}
