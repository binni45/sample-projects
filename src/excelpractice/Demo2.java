package excelpractice;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo2 {

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.toolsqa.com/selenium-webdriver/data-driven-testing-excel-poi/");
					Thread.sleep(3000);
					TakesScreenshot t = (TakesScreenshot)driver;
					File srcfile=t.getScreenshotAs(OutputType.FILE);
					File destfile=new File("D:\\Screenshot\\testfilename.png");
					FileUtils.copyFile(srcfile, destfile);
					//System.out.println("test");
					driver.close();
					
					
		}
}
