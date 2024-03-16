package dktextGN1;

import org.testng.annotations.Test;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class textNG_DropdownValues {
	WebDriver driver;
	
	
	
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517501");
	  
	  driver.findElement(By.xpath("//*[@id=\"text-13263966988\"]")).sendKeys("dhanush");
	  driver.findElement(By.xpath("//*[@id=\"text-241482569216\"]")).sendKeys("janda");
	  driver.findElement(By.xpath("//*[@id=\"text-23732060291\"]")).sendKeys("jdhanush10@gmail.com");
	  Thread.sleep(3000); 
	  driver.findElement(By.xpath("//*[@id=\"field-DVYLZM9QELAAq8K\"]")).sendKeys("9989969892");
	  }
  
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
