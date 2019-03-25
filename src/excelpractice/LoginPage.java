package excelpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;	
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
     WebDriver driver;
	@FindBy(className="form-control")
	WebElement untb;
	@FindBy(name="user[password]")
	WebElement pwtb;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	@FindBy(xpath="//button[@type='submit']")
	WebElement errormsg;
	
	public LoginPage(WebDriver driver)
	       {
          PageFactory.initElements(driver, this);
	
	       }
          public void username(String un)
          {
        	  untb.sendKeys(un);
          }
        	 public void setpassword(String pw) 
        	 {
        	 pwtb.sendKeys(pw);
        	 
          }
	          public void clicklogin()
	          {
	        	  loginbtn.click();
	          }
}

