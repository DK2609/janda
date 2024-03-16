package dkjunitpackAGE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Lactorsdemo {
    static WebDriver driver;
    
    
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://seleniumlearn.com/user");
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("dhanush");
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-pass")).sendKeys("janda123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("op")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("kavya");
		Thread.sleep(2000);
		
	}

}
