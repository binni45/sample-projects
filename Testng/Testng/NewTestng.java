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
 
import org.testng.annotations.BeforeMethod;
 
import org.testng.annotations.AfterMethod;
 
public class Notepad  {
 
	public WebDriver driver;
	  @Test
	  
	  public void set() {
		  public void main() {
			  java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println(links.size());
		 
				for (int i = 1; i<=links.size(); i=i+1)
		 
				{		
		 System.out.println(links.get(i).getAttribute("href"));
				}
		 
		  }
		  public static void verifyLink(String urlLink) {
		       
		        try {
					
					URL link = new URL(urlLink);
					
					HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
					
					httpConn.setConnectTimeout(2000);
					
					httpConn.connect();
					
						if(httpConn.getResponseCode()== 200) {	
							System.out.println(urlLink+" - "+httpConn.getResponseMessage());
						}
						if(httpConn.getResponseCode()== 404) {
							System.out.println(urlLink+" - "+httpConn.getResponseMessage());
						}
					}
					 
				catch (Exception e) {
						}
  @Test
 
  public void main() {
 

  	bwritter.write("</tr>"+"\n");
  	bwritter.write("<tr>"+"\n");
  	bwritter.write("<td></td>"+"\n");
  	bwritter.write("<td></td>"+"\n");
  	bwritter.write("<td></td>"+"\n");
  	bwritter.write("<td></td>"+"\n");
  	bwritter.write("</tr>"+"\n");
     
  	bwritter.write("</table>"+"\n");
  	bwritter.write("</body>"+"\n");
  	bwritter.write("</html>"+"\n");
  }
 
  @BeforeClass
 
  public void beforeMethod() {
 
      driver = new ChromeDriver();
  	  driver.get("http://192.168.1.127");
  	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	File file = new File("D:\\jakay.html");
    	FileWriter filewritter = new FileWriter(file, true);
    	BufferedWriter bwritter = new BufferedWriter(filewritter);
    	bwritter.write("<!DOCTYPE html>"+"\n");
    	bwritter.write("<html>"+"\n");
    	bwritter.write("<head>"+"\n");
    	bwritter.write("<style>"+"\n");
    	bwritter.write("table { font-family: arial, sans-serif;  border-collapse: collapse; width: 100%;\r\n}"+"\n");
    	bwritter.write("td, th {\r\border: 1px solid #dddddd;\r\n" +" text-align: left;\r\n" +"padding: 8px;\r\n" + "}\r\n" +"}"+"\n");
    	bwritter.write("td, th {\r\n" +" border: 1px solid #dddddd;\r\n" + "text-align: left;\r\n" + "padding: 8px;\r\n" +"}"+"\n");
    	bwritter.write("tr:nth-child(even) {\r\n" +" background-color: #dddddd;\r\n" + "\r\n" + "}"+"\n");
        bwritter.write("</style>"+"\n");
    	bwritter.write("</head>"+"\n");
    	bwritter.write("<body>");
    	bwritter.write("<h2>TESTCASES TABLE</h2>"+"\n");
    	bwritter.write("\r\n"+"<table>"+"\n");
    	bwritter.write("<tr>"+"\n");
    	bwritter.write("<th>SERIAL NO</th>"+"\n");
    	bwritter.write("<th>URL</th>"+"\n");
    	bwritter.write("<th>PROJECT DETAILS</th>"+"\n");
    	bwritter.write("<th>PROJECT START TIME</th>"+"\n");
  }
 
  @AfterMethod
 
  public void afterMethod() {
  	bwritter.flush();
	
  	bwritter.close();
  	
  	System.out.println("File is successfully written and saved!!!");
  	
  	
}
}
 
  }
 
}


