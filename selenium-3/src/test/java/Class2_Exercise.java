import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Class2_Exercise {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
		
	}

	@Test
	public void test() {
		driver.get("http://localhost:8080/add");
		driver.findElement(By.id("firstName")).sendKeys("lynn");
		driver.findElement(By.name("lastName")).sendKeys("wang");
		
		
	}

}
