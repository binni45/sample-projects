package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Milmila {
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.milmila.com/");
Thread.sleep(2000);
driver.findElement(By.linkText("Shoes")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"prodList\"]/ul/li[1]/div/a/div[1]/span/img")).click();
String str=driver.getWindowHandle();
driver.switchTo().window("str");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"div_qty_06050002006\"]/input[3]"));
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"div_addtocart\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/header/div[1]/div[3]/div[1]/div[3]/a/div/span[2]")).click();;
				
driver.findElement(By.xpath("//*[@id=\"spnPayNow\"]")).click();
}

}
