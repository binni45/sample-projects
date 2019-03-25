package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://192.168.1.127/leads?lead_status=1");
		 driver.findElement(By.className("form-control")).sendKeys("Koushik@housingman.com");
		driver.findElement(By.name("user[password]")).sendKeys("Hman@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();


	
	}
	}					
	