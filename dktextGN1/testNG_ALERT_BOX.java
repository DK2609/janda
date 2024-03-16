package dktextGN1;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testNG_ALERT_BOX {
	WebDriver driver;
	
  /*@Test
  public void f() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
  }*/
  
  
 /* @Test
  public void f1() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
  }*/
	
	 @Test
	  public void f2() throws InterruptedException {
		 driver.get("https://seleniumlearn.com/prompt-dialog-box");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.sendKeys("dhanush");
		Thread.sleep(3000);
		a.accept();
	 }
	  
  
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

}
