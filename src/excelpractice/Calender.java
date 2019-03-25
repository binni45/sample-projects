package excelpractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calender {
	public static void main(String[] args) throws InterruptedException {
			String month="March 2019";
			String date="11";
			System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.trivago.in/");
			Thread.sleep(2000);
			driver.findElement(By.id("horus-querytext")).sendKeys("Goa");
			driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/div[2]/form/div/div[1]/div/div/div/div[2]/button/span/span")).click();
			WebElement mon=driver.findElement(By.xpath("//*[@id=\"cal-heading-month\"]/span"));
			
			while(true) {
				if(mon.getText().equals(month)) {
					break;
				}
				else {
					driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/div[2]/form/div[2]/div[2]/button/span[1]")).click();
					Thread.sleep(2000);
				}
				
			}
			driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/div[2]/form/div[2]/div[2]/div/table/tbody/tr[3]/td[1]/time")).click();	

	}
	}
	//


	
	     

