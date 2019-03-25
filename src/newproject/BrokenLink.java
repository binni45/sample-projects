package newproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLink {

		public static void main(String[] args) throws InterruptedException 
		
		{
			System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.housingman.com/real-estate-in-bangalore");
			
			//Thread.sleep(3000);
			//driver.close();
			
			
			List<WebElement> links=driver.findElements(By.tagName("a"));
			
			System.out.println("Total links are "+links.size());
			
			for(int i=0;i<links.size();i++)
			{
				
				System.out.println("1. "+links.get(i).getAttribute("href"));
				WebElement ele= links.get(i);
				
				if(links.get(i).getAttribute("href")!=null) {
					String url=ele.getAttribute("href");
					verifyLinkActive(url);
				
				}
						
			}
			
		}
		
		public static void verifyLinkActive(String linkUrl)
		{
	        try 
	        {
	           URL url = new URL(linkUrl);
	           
	           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	           
	           httpURLConnect.setConnectTimeout(2000);
	           
	           httpURLConnect.connect();
	           
	           if(httpURLConnect.getResponseCode()==200)
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkUrl+" -- "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (Exception e) {
	        	
	        	
	        	
	       
	           
	        }
	    } 			
		
		
		 

	

}

