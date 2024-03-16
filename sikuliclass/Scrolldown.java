package sikuliclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Scrolldown { 
	WebDriver driver; 
	
	
  @Test
  public void scrolldown() throws InterruptedException {
	  driver.get("https://www.selenium.dev/");
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("scroll(0, 3200)");
      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"previous-releases\"]/div/div/div[1]/button/span")).click();
	  
  }
  @Test
  public void scrollup() throws InterruptedException {
	  Thread.sleep(3000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("scroll(3200,0)");
      Thread.sleep(2000);
      driver.findElement(By.xpath(" //*[@id=\"main_navbar\"]/ul/li[4]/a/span")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
