package excelpractice;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckOut {

	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			/*String month="March 2019";
			String date="11";
			String monthcheckin="April 2019";*/
			
			String checkindate = "20-April 2019";
			String checkoutdate = "15-May 2019";
			
			
			System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.trivago.in/");
			Thread.sleep(3000);
			driver.findElement(By.id("horus-querytext")).sendKeys("Goa");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/div[2]/form/div/div[1]/div/div/div/div[2]/button/span/span")).click();
			
			String date1 = checkindate.split("-")[0];
			
			String month1 = checkindate.split("-")[1];
			
			selectdatepicker(date1,month1);
			
			selectdatepicker(checkoutdate.split("-")[0],checkoutdate.split("-")[1]);
		}

		private static void selectdatepicker(String date, String month) {
			
			String websitedatepickermonth= driver.findElement(By.xpath("//th[@class='cal-heading-month']/span")).getText();
		
			if(websitedatepickermonth.equalsIgnoreCase(month)) {
				
				//System.out.println(websitedatepickermonth);
				List<WebElement> listofdates= driver.findElements(By.xpath("//table[@class='cal-month']/tbody/tr/td"));
				
				for(int i=0; i<listofdates.size();i++) {
					
					//System.out.println(listofdates.get(i).getText());
					if(date.equals(listofdates.get(i).getText())) {
						listofdates.get(i).click();
						System.out.println("User input is selected in datepicker "+listofdates.get(i).getText() +"-"+websitedatepickermonth);
						break;
					}
					
				}
				
			}
			else {
				driver.findElement(By.xpath("//span[@class='icon-ic cal-btn-ic icon-rtl']")).click();
				selectdatepicker(date,month);
			}
			
		}
	}
		
	

/*
 * 
 * WebElement mon=driver.findElement(By.xpath("//*[@id=\"cal-heading-month\"]/span"));
			
			while(true) {
				if(mon.getText().equals(month)) {
					break;
				}
				else {
					driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/div[2]/form/div[2]/div[2]/button/span[1]")).click();
					Thread.sleep(2000);
				}
				
			}
			driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/div[2]/form/div[2]/div[2]/div/table/tbody/tr[3]/td[1]/time")).click();
			
	WebElement mon1=driver.findElement(By.xpath("//*[@id=\"cal-heading-month\"]/span"));
			while(true) {
				if(mon1.getText().equals("April 2019")) {
					break;
				}
				else {
					driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/div[2]/form/div[2]/div[2]/button")).click();
					Thread.sleep(2000);
				}
			}
			driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/div[2]/form/div[2]/div[2]/div/table/tbody/tr[2]/td[4]/time")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/div[2]/form/div[2]/div/div/ul/li[2]/button/div/span[2]")).click();

	}
 * */

