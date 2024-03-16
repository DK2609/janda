package dktextGN1;


import org.testng.annotations.Test;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testNG_skip {
	WebDriver driver;
  @Test(priority=4
		  )
  public void gmail() {
	 driver.get("https://www.gmail.com");
  }
  
  @Test(priority=5)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test(priority=2)
  public void youtube() {
	  driver.get("https://www.youtube.com");
  }
  
  @Test(priority=1)
  public void seleniumlearn() {
	  driver.get("https://www.seleniumlearn.com");
  }
  
  @Test(priority=3)
  public void google() {
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }

}
