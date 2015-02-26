package TestNGOnePackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ClassTwo {
  @Test
  public void f(Integer n, String s) {
	  System.out.println("This is @Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is @AfterSuite");
  }

}
