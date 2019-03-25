import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
@Test(dataProvider="testdata")
public void TestFireFox(String uname,String password){


WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://accounts.google.com");


driver.findElement(By.id("email")).clear();

driver.findElement(By.className("wpW1cb")).sendKeys("rakhi@housingman.com");
driver.findElement(By.id("pass")).clear();
driver.findElement(By.className("aCsJod oJeWuf")).sendKeys("rakhi@1234");
}

@DataProvider(name="testdata")
public Object[][] TestDataFeed(){
Object [][] facebookdata=new Object[2][2];
facebookdata[0][0]="rakhi@housingman.com";

facebookdata[0][1]="rakhi@1234";
facebookdata[1][0]="Selenium2@gmail.com";
facebookdata[1][1]="Password2";

return facebookdata;
}

}