package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2 {

	@Test(groups="One")
	public void t2() throws InterruptedException, IOException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//create an object for chromedriver class
		 ChromeDriver c = new ChromeDriver();
		 c.get("https://jqueryui.com/droppable/");
			
			//webelements: present insde a frame: switch your control to that frame
			//id, name or index
			c.switchTo().frame(0);
			Actions ac= new Actions(c);
			
			WebElement ele1 = c.findElementById("draggable");
			WebElement ele2 = c.findElementById("droppable");
			
			ac.dragAndDrop(ele1, ele2).build().perform();
			File f = c.getScreenshotAs(OutputType.FILE);
			//FileUtils=> apache directory studio common io
			FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\sevenmaven\\src\\main\\java\\pack1\\a.png"));
			Thread.sleep(2000);
			c.quit();
	}
}
