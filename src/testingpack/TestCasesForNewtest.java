package testingpack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasesForNewtest {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		WebDriverManager.chromedriver();
		WebDriverManager.getInstance(DriverManagerType.CHROME);
		driver.get("http://gmail.com");
	}
	
	@Test
	public void testcase1() {
		
		Gmail gmailtest = new Gmail();
		gmailtest.enteremailaddress("rakhi@housingman.com");
		gmailtest.clickEmailpageNextbtn().click();
		gmailtest.enterpassword("rakhi1234");
		gmailtest.clickPasswordNextbtn().click();
		
	}

}
