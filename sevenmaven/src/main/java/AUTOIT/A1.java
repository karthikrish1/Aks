package AUTOIT;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(3000);
		ob.findElementByCssSelector("#addBtn").click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\akash.exe");

	}

}
