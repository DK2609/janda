package dktextGN1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class textNG_alphabectical_1 {
	WebDriver driver;
	
 @Test(priority=3)
  public void selenium() {
	  driver.get("htpps://www.selenium.dev");
  }
  
  @Test(priority=2)
  public void google() {
	  driver.get("htpps://www.google.com");
  
  }  
  
  @Test(priority=1)
  public void facebook() {
	  driver.get("htpps://www.facebook.com");
  }
  
  @Test(priority=5)
  public void twitter() {
  driver.get("htpps://www.twitter.com");
  }
  
  @Test(priority=4)
  public void youtube() {
	  driver.get("htpps://www.youtube.com");
  }
  

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

	  
  }


