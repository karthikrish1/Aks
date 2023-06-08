package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {

	
	@Test(groups="Two")
	public void t3() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//create an object for chromedriver class
		 ChromeDriver c = new ChromeDriver();
		 c.get("https://www.seleniumeasy.com");
			
			
			
	c.executeScript("window.scrollBy(0,1000)");//down
			
			Thread.sleep(3000);
			c.executeScript("window.scrollBy(0,-1000)");//up
			Thread.sleep(3000);
			c.quit();
	}
}
