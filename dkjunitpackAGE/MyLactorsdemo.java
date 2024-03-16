package dkjunitpackAGE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MyLactorsdemo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("jandadhanush@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("janda@2609");
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);
         driver.switchTo().alert().accept();
	}


	}

