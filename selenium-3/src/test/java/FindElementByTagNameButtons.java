import static org.junit.Assert.*;

import java.awt.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindElementByTagNameButtons {

	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		  String url = "http://google.com";
		  driver.get(url);
		  java.util.List<WebElement> buttons =  driver.findElements(By.tagName("button"));
		  // click the 2nd button
		  buttons.get(2).click();

		  
		 
	}

}
