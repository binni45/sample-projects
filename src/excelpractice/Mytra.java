
package excelpractice;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;

public class Mytra {
	
public static void main(String[] args) throws IOException, InterruptedException {
			
	        System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/login");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(3000);
			FileInputStream fis = new FileInputStream("D:\\sheet1.xlsx");
	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	 XSSFSheet sheet = wb.getSheetAt(0);
	 XSSFCell cell = sheet.getRow(0).getCell(0);
	 cell.setCellType(cell.getCellType());
	 driver.findElement(By.xpath("//*[  @id=\"mountRoot\"]/div/div/div/form/fieldset[1]/div[1]/input")).sendKeys(cell.getStringCellValue());
	 XSSFCell cel = sheet.getRow(0).getCell(1);
	 cel.setCellType(cell.getCellType());
	 driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[1]/div[2]/input")).sendKeys(cel.getStringCellValue());
	 driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
		}

	}

	
	
	
	
	
	
	
	

