package newproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class All {
	public WebDriver driver;
	 
	  @Test
	   public void main() {
		  java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.size());
	 
			for (int i = 1; i<=links.size(); i=i+1)
	 
			{		
	 System.out.println(links.get(i).getAttribute("href"));
			}
	 
	  }

		public static void verifyLink(String urlLink) {
	       
	        try {
				
				URL link = new URL(urlLink);
				
				HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
				
				httpConn.setConnectTimeout(2000);
				
				httpConn.connect();
				
					if(httpConn.getResponseCode()== 200) {	
						System.out.println(urlLink+" - "+httpConn.getResponseMessage());
					}
					if(httpConn.getResponseCode()== 404) {
						System.out.println(urlLink+" - "+httpConn.getResponseMessage());
					}
				}
				 
			catch (Exception e) {
				
			}
				//sse.printStackTrace();
			}
	  @BeforeMethod
	 
	  public void beforeMethod() {
	
		  System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	      driver = new ChromeDriver();
	 
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 
	      driver.get("https://www.housingman.com/real-estate-in-bangalore");
	 
	  }
	 
	  @AfterMethod
	 
	  public void afterMethod() {
	 
		 
	      driver.quit();
	 
	  }
	 
	}
	  



