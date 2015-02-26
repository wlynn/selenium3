package TestNGTwoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestOne {
	
	WebDriver driver = new FirefoxDriver();
	
	 @AfterTest
	  public void afterTest() {
		  driver.close();
		  driver.quit();
	  }

	
  @Test
  public void f() {
	  driver.get("http://www.amazon.com");
	  System.out.println("www.amazon.com");
  }

 
}
