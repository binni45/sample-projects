package excelpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	@Test(dataProvider="testdata")
	
	
	public void Test(String uname,String password) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com");
    driver.findElement(By.id("identifierId")).sendKeys(uname);
    Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys(password);
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
	 
	 
	Object [][] facebookdata=new Object[2][2];
    facebookdata[0][0]="Selenium1@gmail.com";
	facebookdata[0][1]="Password1";
	 facebookdata[1][0]="Selenium2@gmail.com";
	 
	facebookdata[1][1]="Password2";
	return facebookdata;
	}
	 	
	}
