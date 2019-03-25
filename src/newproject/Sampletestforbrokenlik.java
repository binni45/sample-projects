
package newproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Sampletestforbrokenlik {

	public WebDriver driver;
	File file = new File("D:\\jakay.html");
	FileWriter filewritter = null;
	BufferedWriter bwritter = null;

	@Test(priority=1)
	public void set() throws InterruptedException {
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 1; i < links.size(); i++)

		{
			if(links.get(i).getAttribute("href")!=null) {
				Thread.sleep(1000);
				System.out.println(links.get(i).getAttribute("href"));
				verifyLink(links.get(i).getAttribute("href"),i);
			}
			
		}

	}

	public void verifyLink(String urlLink,int i) {

		try {

			URL link = new URL(urlLink);

			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();

			httpConn.setConnectTimeout(2000);

			httpConn.connect();

			if (httpConn.getResponseCode() == 200) {
				System.out.println(urlLink + " - " + httpConn.getResponseMessage());
				bwritter.write("</tr>" + "\n");
				bwritter.write("<tr>" + "\n");
				bwritter.write("<td>"+i+"</td>" + "\n");
				bwritter.write("<td>"+urlLink+"</td>" + "\n");
				bwritter.write("<td>"+httpConn.getResponseCode()+"</td>" + "\n");
				bwritter.write("<td>"+httpConn.getResponseMessage()+"</td>" + "\n");
				bwritter.write("</tr>" + "\n");
			}
			if (httpConn.getResponseCode() == 404) {
				System.out.println(urlLink + " - " + httpConn.getResponseMessage());
				bwritter.write("</tr>" + "\n");
				bwritter.write("<tr>" + "\n");
				bwritter.write("<td>"+i+"</td>" + "\n");
				bwritter.write("<td>"+urlLink+"</td>" + "\n");
				bwritter.write("<td>"+httpConn.getResponseCode()+"</td>" + "\n");
				bwritter.write("<td>"+httpConn.getResponseMessage()+"</td>" + "\n");
				bwritter.write("</tr>" + "\n");
			}
		}

		catch (Exception e) {

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
		bwritter.write("<h2>TESTCASES TABLE</h2>" + "\n");
		bwritter.write("\r\n" + "<table>" + "\n");
		bwritter.write("<tr>" + "\n");
		bwritter.write("<th>SERIAL NO</th>" + "\n");
		bwritter.write("<th>URL</th>" + "\n");
		bwritter.write("<th>STATUS CODE</th>" + "\n");
		bwritter.write("<th>STATUS</th>" + "\n");
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
