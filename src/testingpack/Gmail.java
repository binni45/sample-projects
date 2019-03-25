package testingpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {
	 WebDriver driver;
		@FindBy(id="emailaddress")
		WebElement email;
		@FindBy(xpath="//input[@class='whsOnd zHQkBf']")
		WebElement pwtb;
		@FindBy(xpath="//input[@class='whsOnd zHQkBf']")
		WebElement nextbtnemail;
		@FindBy(xpath="//input[@class='whsOnd zHQkBf']")
		WebElement nextbtnpwd;
		public Gmail() {
			PageFactory.initElements(driver, this.getClass().getName());
		}
		public WebElement enteremailaddress(String emailaddress) {
			return email;
		}
		
		public WebElement enterpassword(String password) {
			return pwtb;
		}
		public WebElement clickEmailpageNextbtn() {	
			return nextbtnemail; 
		}
		public WebElement clickPasswordNextbtn() {
			return nextbtnpwd;
			
		}
		
	
	
	
}
