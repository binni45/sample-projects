package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{

		public static void main(String[] args) throws InterruptedException
		{
	       System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.navigate().refresh();
			 String actualTitle=driver.getTitle();
			 System.out.println("Actual Title:"+actualTitle);
			driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Shoes for mens");
			driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\"result_3\"]/div/div[2]/div/a/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("rakhik373@gmail.com");
		    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("urmiladevi1234");
		    driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		  
		  

		}

	}



