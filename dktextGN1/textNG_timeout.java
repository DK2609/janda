package dktextGN1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class textNG_timeout {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/div/div[1]/div[1]/a/div/span")).click();
	  driver.navigate().forward();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }

}
