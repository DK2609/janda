package dkjunitpackAGE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitcssSelector {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://seleniumlearn.com/user");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("dhanush");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("janda110");
		Thread.sleep(2000);
	//	driver.findElement(By.name("op")).click();
		driver.findElement(By.cssSelector("#edit-submit")).click();
	}

	
		
	

	@Test
	void test() {
		
	}

}
