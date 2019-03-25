package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Web 
{
 
		 public static void main(String args[]) throws InterruptedException
		 {
			 System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			 
			 
			 WebDriver driver=new ChromeDriver();
			 
			 driver.get("https://www.google.com");
			 Thread.sleep(3000);
			 
			 driver.close();
		 }
	 
		
	}


