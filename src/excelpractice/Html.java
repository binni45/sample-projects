package excelpractice;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Html {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://github.com/cbeust/testng/projects");
		WebElement link = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.sendKeys(Keys.CONTROL).click(link).build().perform();
		//String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(newTab.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(newTab.get(1));
		
		
		
		}

	}


	