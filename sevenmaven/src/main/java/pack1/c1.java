package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="One")
	public void t1()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//create an object for chromedriver class
		 ChromeDriver c = new ChromeDriver();
		c.get("https://www.google.com");
		System.out.println(c.getTitle());
		c.quit();
	}

}
