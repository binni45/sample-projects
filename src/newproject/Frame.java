package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

    public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
         driver.get("http://192.168.1.127/leads?lead_status=1");
         String alertMessage = "";
         // driver.get("http://192.168.1.127/all_leads?team=housingman");
         driver.findElement(By.className("form-control")).sendKeys("Koushik@housingman.com");
		 driver.findElement(By.name("user[password]")).sendKeys("Hman@123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
         driver.findElement(By.className("enlarged")).click();
         driver.findElement(By.className("enlarged")).click();
         driver.findElement(By.className("enlarged")).click();
         driver.findElement(By.className("enlarged")).click();
         driver.findElement(By.className("enlarged")).click();
         driver.findElement(By.className("enlarged")).click();
         driver.findElement(By.className("enlarged modal-open")).click();
        
       // alertMessage = driver.switchTo().alert().getText();
        //driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        
        
    }
}
       