import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TestRemote {



	@Test
	
		public void test() throws Exception {
			DesiredCapabilities capabilites = new DesiredCapabilities();
			capabilites.setPlatform(Platform.WIN8_1);
			capabilites.setBrowserName("chrome");
				RemoteWebDriver remoteWD = null;
				try {
					remoteWD = new RemoteWebDriver(new URL("http://127.0.0.1:1111/wd/hub"), capabilites);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				//navigate to Google using a remote Firefox driver
				remoteWD.get("http://www.google.com");
				WebElement element = remoteWD.findElement(By.name("q"));
				element.sendKeys("selenium server");
				remoteWD = (RemoteWebDriver) new Augmenter().augment(remoteWD);
				File srcFile = ((TakesScreenshot)remoteWD).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile,new File("remoteScreenshot.jpg"));
				
				remoteWD.close();
				remoteWD.quit();
		}
	}


