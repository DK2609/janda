package sikuliclass;

import org.testng.annotations.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class sikulidemo {
	Screen s = new Screen();
	
	
  @Test
  public void f() throws FindFailed {
  s.click("D:\\siikuli\\Start.PNG");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
