package systest.net.saisoft.selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementFile {
  
  WebDriver driver = new FirefoxDriver();

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }

  @Test
  public void firstName() throws IOException{
    //Create Object of Properties Class.
      Properties obj = new Properties();   
      //Create object of the FileInputStream class and tell where to find the file
      FileInputStream objfile = new FileInputStream("elements.properties");
      //Load elements 
      obj.load(objfile); 
      
    //This test works but seems to move to fast to track
      String url = "http://localhost:8080/add";
      driver.get(url);
      System.out.print(url);
      String myName = "Brooke";
      
      //Accessing element locators of all web elements using obj.getProperty(key)
      driver.findElement(By.xpath(obj.getProperty("firstName"))).sendKeys(myName);
      System.out.print(myName);
      
      
      
      }
  }
