package newproject;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
import org.testng.annotations.BeforeMethod;
 
import org.testng.annotations.AfterMethod;
 
public class TestNG {
 
	public WebDriver driver;
 
  @Test
 
  public void main() {
 
     // driver.findElement(By.id("form-control")).click();
      driver.findElement(By.id("form-control")).sendKeys("Koushik@housingman.com");
      driver.findElement(By.id("user[password]")).sendKeys("Hman@123");
  	driver.findElement(By.xpath("//button[@type='submit']")).click();

      //driver.findElement(By.id("login")).click();
 System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 //driver.findElement(By.id("account_logout"));
 
  }
 
  @BeforeMethod
 
  public void beforeMethod() {
 
      driver = new ChromeDriver();
 
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
 
      driver.get("http://192.168.1.127/leads?lead_status=1");
 
  }
 
  @AfterMethod
 
  public void afterMethod() {
 
 
      driver.quit();
 
  }
 
}


