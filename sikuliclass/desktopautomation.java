package sikuliclass;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.App;


public class desktopautomation {
	Screen s = new Screen();
	WebDriver driver;
	
	
  @Test
  public void desktopauto() throws FindFailed, InterruptedException {
	  Thread.sleep(2000);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.seleniumlearn.com");
	  Thread.sleep(2000);
	 
	 
	  s.click("D:\\siikuli\\Jen.PNG");
	  
	/*  Pattern  p= new Pattern("D:\\siikuli\\S.PNG");

	    try {
	    	screen.click(p);
	    } catch (FindFailed e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace(); */
  }
}
