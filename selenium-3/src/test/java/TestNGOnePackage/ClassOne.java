package TestNGOnePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClassOne {
	
	WebDriver driver = new FirefoxDriver();
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		driver.quit();
	}
	
	
  @Test
  public void SkipTest() {
	  driver.get("http://localhost:8080/test");
	  String title = driver.getTitle();
	  
	  if(title.equals("Selenium Test Page")){
		  //Skipping this test
		  throw new SkipException("Skip Test is skipped because title doesn not match");
	  }else{
		  System.out.println("Check the checkbox");
		  driver.findElement(By.name("greenpeppers")).click();
	  }
	  
	  
  }
 
}
