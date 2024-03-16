package dktextGN1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class textNG_priortydemo1 {
	WebDriver driver;
 @Test
  public void selenium() {
  driver.get("htpps://www.selenium.dev");
  }
  
  @Test
  public void google() {
  driver.get("htpps://www.google.com");
  
  }  
  
  @Test
  public void facebook() {
  driver.get("htpps://www.facebook.com");
  }
  
  @Test
  public void twitter() {
  driver.get("htpps://www.twitter.com");
  }
  
  @Test
  public void youtube() {
  driver.get("htpps://www.youtube.com");
  }
  

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

 
}
