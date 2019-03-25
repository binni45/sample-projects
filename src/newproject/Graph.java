package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Graph {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://developers.google.com/chart/interactive/docs/gallery/combochart");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		WebElement str1=driver.findElement(By.xpath("//*[local-name()='svg']/*[local-name()='g']/*[local-name()='text']"));
		System.out.println(str1.getText());
			
		
	}
}
		
		
		
		
			

	
