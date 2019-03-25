package excelpractice;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Atomate {
			@Test(dataProvider="wordpressdata")
			public void logintowordpress(String username , String password) throws InterruptedException
			{
			System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_Cj0KCQiAvqDiBRDAARIsADWh5TcVouXdToTigYSv_AItwpv72YhbT7tAMThvkcqtiD8h6Fv5o-FSbxEaAulNEALw_wcB_k_&gclid=Cj0KCQiAvqDiBRDAARIsADWh5TcVouXdToTigYSv_AItwpv72YhbT7tAMThvkcqtiD8h6Fv5o-FSbxEaAulNEALw_wcB");
			WebElement menu = driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]"));
			Actions action= new Actions(driver);
			action.moveToElement(menu).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(username);
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys(password);
			driver.findElement(By.id("signInSubmit")).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.quit();
		}	
		
	@DataProvider(name="wordpressdata")	
	public Object[][] getdata()
	{

	Object [][] data=new Object[3][2];
	data[0][0]="abc@gmail.com";
	data[0][1]="rakhi123";
	data[1][0]="xyz@gmail.com";
	data[1][1]="Rinku@1234";
	data[2][0]="pqr@gmail.com";
	data[2][1]="Val@1234";

	return data;
	}

	}


