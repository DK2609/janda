package dkjunitpackAGE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junitdemodk {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	void test() throws InterruptedException {
		driver.get("http://www.hyderabadreport.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Andhra Pradesh")).click();
		
		
		
	}

}
