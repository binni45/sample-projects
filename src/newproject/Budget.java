package newproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Budget {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.housingman.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath(("//div[@id='city-selection']/div/aside/ul/li/a"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type='reset']")).click();
			Thread.sleep(5000);
			driver.findElement(By.className(("home-page"))).click();
			Thread.sleep(5000);
			driver.findElement(By.className(("overview"))).click();
			Thread.sleep(5000);
			ArrayList<String> rtabs = new ArrayList<>(driver.getWindowHandles());
			System.out.println(rtabs.size());
			driver.switchTo().window(rtabs.get(1));
			Thread.sleep(5000);
			//driver.switchTo().window(driver.getWindowHandles().iterator().next());
			driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("Bangalore");
			driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys(Keys.ENTER);
		    List<WebElement> str=driver.findElements(By.xpath("//div[@class='search-results ']/div/article/aside/h3/a\r\n"+""));
			for(WebElement ele : str){
		    System.out.println(ele.getText());
		       JavascriptExecutor js=(JavascriptExecutor)driver;
		       
		       
		       
		       int initial_projectcount = str.size();
		       String text = driver.findElement(By.xpath("//span[@class='total_project_count']")).getText().replace(" Properties Available)", "").trim();
		       
		       String text1 = text.split("(")[1].trim();
		       int total_count = Integer.parseInt(text1);
		       
		         for(int i=1;i<10;i++)
		            {
		    	   js.executeScript("window.scrollBy(0,300)");
		    	     Thread.sleep(2000);
		 			Dimension elementCount1 = driver.findElement(By.xpath("//input[@name='keywords']")).getSize();
		 			  while(total_count!=initial_projectcount)
		 			   driver.findElement(By.xpath("//div[@class='pagination']/a")).click();
		    	     List<WebElement> str2=driver.findElements(By.xpath("//div[@class='search-results ']/div/article/aside/h3/a\r\n"+""));
		 			for(WebElement ele1 : str2){
		 		    System.out.println(ele1.getText());
		       }
		       }
		      
	}
			}
	
}

	



					
	


