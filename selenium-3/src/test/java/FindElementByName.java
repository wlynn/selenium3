import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindElementByName {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() {
		String url = "http://www.google.com";
		driver.get(url);
		System.out.println(url);
		WebElement searchBox = driver.findElement(By.name("btnK"));
	}

}
