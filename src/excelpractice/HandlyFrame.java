package excelpractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlyFrame {
	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/login.html");
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.switchTo().frame("zohoiam");
		Thread.sleep(2000);
		driver.findElement(By.id("lid")).sendKeys("amit");
		Thread.sleep(2000);
		driver.close();
		

		}

	}

