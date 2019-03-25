import java.util.concurrent.TimeUnit;
  import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class Move{
 
	public static WebDriver driver;
 
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
 
        driver = new ChromeDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("http://192.168.1.127:9000/real-estate-in-bangalore");
 
        WebElement element = driver.findElement(By.className("overview"));
 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
 
        driver.findElement(By.className("overview")).click();
 
        }
 
}
