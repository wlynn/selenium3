import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Class1_Exercise {
	
	WebDriver driver = new FirefoxDriver();
	

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("http://www.amazon.com");
	}

}
