package dkjunitpackAGE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junitlinkpartiallink {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	/*@Test
	void test1() throws InterruptedException {
		driver.get("http://www.hyderabadreport.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Entertainment")).click();
		Thread.sleep(2000);*/
	
	
	@Test
	void test2() throws InterruptedException {
		driver.get("https://www.ndtv.com/");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a"));
		System.out.println("Total links on NDTV Aplication:");
		

}
}