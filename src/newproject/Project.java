package newproject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Project {

	public WebDriver driver;
	File file = new File("D:\\rax.html");
	FileWriter filewritter = null;
	BufferedWriter bwritter = null;

	@Test(priority=1)
	public void set() throws InterruptedException {
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='sr-left-section']/div[2]/div/div/div/div/div/div/div[2]/div[2]/a\r\n" +""));
		for(WebElement ele : links){
		    System.out.println(ele.getText());
		
		} 
		
			
			}
		
     @BeforeClass
        public void play() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.housingman.com/");
		Thread.sleep(7000);
		driver.findElement(By.xpath(("//div[@id='city-selection']/div/aside/ul/li/a"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className(("home-page"))).click();
		Thread.sleep(7000);
		driver.findElement(By.className(("overview"))).click();
		Thread.sleep(2000);
		filewritter = new FileWriter(file, true);
		bwritter = new BufferedWriter(filewritter);
		bwritter.write("<!DOCTYPE html>" + "\n");
		bwritter.write("<html>" + "\n");
		bwritter.write("<head>" + "\n");
		bwritter.write("<style>" + "\n");
		bwritter.write("table { font-family: arial, sans-serif;  border-collapse: collapse; width: 100%;\r\n}" + "\n");
		bwritter.write("td, th {\r\border: 1px solid #dddddd;\r\n" + " text-align: left;\r\n" + "padding: 8px;\r\n"+ "}\r\n" + "}" + "\n");
		bwritter.write("td, th {\r\n" + " border: 1px solid #dddddd;\r\n" + "text-align: left;\r\n"+"padding: 8px;\r\n" + "}" + "\n");
		bwritter.write("tr:nth-child(even) {\r\n" + " background-color: #dddddd;\r\n" + "\r\n" + "}" + "\n");
		bwritter.write("</style>" + "\n");
		bwritter.write("</head>" + "\n");
		bwritter.write("<body>");
		bwritter.write("<h2>PROJECT TABLE</h2>" + "\n");
		bwritter.write("\r\n" + "<table>" + "\n");
		bwritter.write("<tr>" + "\n");
		bwritter.write("<th>SERIAL NO</th>" + "\n");
		bwritter.write("<th>PROJECT NAME</th>" + "\n");
		bwritter.write("<th>BUDGET</th>" + "\n");
		bwritter.write("<th>CONFIGERATION DETAILS</th>" + "\n");
	}

	@AfterClass

	public void end() throws IOException {
		bwritter.write("</tr>" + "\n");
		bwritter.write("<tr>" + "\n");
		bwritter.write("<td></td>" + "\n");
		bwritter.write("<td></td>" + "\n");
		bwritter.write("<td></td>" + "\n");
		bwritter.write("<td></td>" + "\n");
		bwritter.write("</tr>" + "\n");
		bwritter.write("</table>" + "\n");
		bwritter.write("</body>" + "\n");
		bwritter.write("</html>" + "\n");
		bwritter.flush();
		bwritter.close();
        System.out.println("File is successfully written and saved!!!");

	}
}



