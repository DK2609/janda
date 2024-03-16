package dktextGN1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class textNG_doubledrag {
	WebDriver driver;
	
	
 /* @Test
  public void rigthclick() throws Exception {
	  driver.get("https://seleniumlearn.com/");
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-386-1\"]"))).build().perform();
  }*/
	
	
	
	/*@Test
	  public void doubleclick() throws Exception {
		driver.get("https://seleniumlearn.com/double-click");
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}*/
	
	
	/*@Test
	  public void draganddrop() throws Exception {
		driver.get("https://seleniumlearn.com/drag-and-drop");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droptarget\"]"));
		act.dragAndDrop(source, target).build().perform(); 
	}*/
	
	
	
	/*@Test
	  public void mouseover() throws Exception {
		driver.get("https://seleniumlearn.com/");
		Thread.sleep(3000);
		Actions ms = new Actions(driver);
		ms.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a"))).build().perform();
		Thread.sleep(3000);
		ms.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-366-1\"]/a"))).click().build().perform();
		
	}*/
	
	
	@Test
	  public void keyboardkeys() throws Exception {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		Actions keys = new Actions(driver);
		keys.sendKeys(Keys.TAB).build().perform();
	}
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
