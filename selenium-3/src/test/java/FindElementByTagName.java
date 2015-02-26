import static org.junit.Assert.*;

import java.awt.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindElementByTagName {
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		//Navigate to Google
		String url = "http://www.google.com";
		driver.get(url);
		System.out.print(url);
		java.util.List<WebElement> buttons = driver.findElements(By.tagName("button"));
		//Print the number of buttons found on Google
		System.out.println(buttons.size());
	}

}
