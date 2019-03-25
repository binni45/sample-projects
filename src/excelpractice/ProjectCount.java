package excelpractice;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProjectCount {
	public static void main(String[] args) throws InterruptedException, IOException {
		        System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//1 Navigate URL
				driver.get("https://www.housingman.com/projects?utf8=%E2%9C%93&city_id=mumbai");
				Thread.sleep(7000);
				
				//2. Click on the paricular ciity
				
				driver.findElement(By.xpath(("//div[@id='city-selection']/div/aside/ul/li[3]/a"))).click();
				Thread.sleep(5000);
				
				// 3. Reset 
				driver.findElement(By.xpath("//button[@type='reset']")).click();
				Thread.sleep(5000);
				
	       	    //driver.findElement(By.xpath("//div[@class='search-results ']/div/article/aside/h3/a"));   
				//Thread.sleep(5000);
				
				//4. geting the total leads count in header of the page
				
				String text= driver.findElement(By.xpath("//span[contains(@class,'total_project_count')]")).getText();
				
				System.out.println(text);
				
				String arrayfirst = text.split("Properties")[0];
				
				System.out.println(arrayfirst);
				
				int totalcountproject=Integer.parseInt(arrayfirst.replace("(", "").trim());
				
				System.out.println(totalcountproject);
				
				// 5. Get the list of projects in particular page
				
				List<WebElement> listofprojectelement = driver.findElements(By.xpath("//div[@class='search-results ']/div/article/aside/h3/a"));
				
				System.out.println(listofprojectelement.size());
				
				int initialpageprojectcount = listofprojectelement.size();
				
				Actions act = new Actions(driver);
				
				while(initialpageprojectcount!=totalcountproject) {
					
					act.moveToElement(driver.findElement(By.xpath("//div[@class='pagination']/a"))).click().build().perform();
					
					Thread.sleep(2000);
					
					listofprojectelement = driver.findElements(By.xpath("//div[@class='search-results ']/div/article/aside/h3/a"));
					
					initialpageprojectcount = listofprojectelement.size();
					
					System.out.println(initialpageprojectcount);
					
				}
				
				System.out.println(initialpageprojectcount +"---"+totalcountproject);
				
	}
}


/*

ArrayList<String> rtabs = new ArrayList<>(driver.getWindowHandles());
System.out.println(rtabs.size());
driver.switchTo().window(rtabs.get(1));
Thread.sleep(5000);
driver.switchTo().window(driver.getWindowHandles().iterator().next());
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
	     driver.findElement(By.className("overview")).click();
			Dimension elementCount1 = driver.findElement(By.xpath("//input[@name='keywords']")).getSize();
			  while(total_count!=initial_projectcount)
			   driver.findElement(By.xpath("//div[@class='pagination']/a")).click();
	     List<WebElement> str2=driver.findElements(By.xpath("//div[@class='search-results ']/div/article/aside/h3/a\r\n"+""));
			for(WebElement ele1 : str2){
		    System.out.println(ele1.getText());



}
        }
}*/