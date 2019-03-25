package newproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rax {


	 
		public WebDriver driver;
	 
	  @Test
	   public void main() {
	    driver.findElement(By.className("form-control")).sendKeys("Koushik@housingman.com");
		driver.findElement(By.name("user[password]")).sendKeys("Hman@123");
	  	driver.findElement(By.xpath("//button[@type='submit']")).click();
	 System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	  }
	 
	  @BeforeMethod
	 
	  public void beforeMethod() {
	
		  System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	      driver = new ChromeDriver();
	 
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 
	      driver.get("http://192.168.1.127/leads?lead_status=1");
	 
	  }
	 
	  @AfterMethod
	 
	  public void afterMethod() {
	 
		  System.out.println("34567");
	      driver.quit();
	 
	  }
	 
	}



