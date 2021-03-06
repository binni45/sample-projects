package excelpractice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Bigbasket1 {
	String grand_parent_text = "Baby Care";
	String parent_text = "Baby Accessories";
	String child_text = "Baby Toys";
	String grand_chil_text = "Baby Comb";

	WebDriver drv;
	Actions act;
	@Test
public void checkcategoriesselection() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
     drv = new ChromeDriver();
		 drv.get("https://www.bigbasket.com/");
              WebElement textforshopcategories = drv.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"));
	              act = new Actions(drv);
		            act.moveToElement(textforshopcategories).build().perform();
		                List<WebElement> listofgrantparentelements = drv.findElements(By.xpath("//div[@class='tabs-left']/ul/li/a"));
		                  selecting_categoriesname(listofgrantparentelements,grand_parent_text);
		                		  Thread.sleep(3000);
                                   String forparentsxpath="catL2";
		                              selecting_child_elements(parent_text,forparentsxpath);
	                                        String forchildsxpath="catL3";
                                               selecting_child_elements(child_text,forchildsxpath);
		                                         act.moveToElement(drv.findElement(By.xpath("(//a[@ng-bind='searchTerm.display_term'][contains(.,'"+grand_chil_text+"')])[2]"))).click().build().perform();
	}

	public void selecting_child_elements(String parent_text2,String xpathtext) throws InterruptedException {
		
		                       Thread.sleep(3000);
		                           act.moveToElement(drv.findElement(By.xpath("(//a[@qa='"+xpathtext+"'][contains(.,'"+parent_text2+"')])[2]"))).build().perform();
	}

	private void selecting_categoriesname(List<WebElement> listofgrantparentelements1, String grand_parent_text2) {

		   for (int element = 0; element < listofgrantparentelements1.size(); element++) {

			           System.out.println(listofgrantparentelements1.get(element).getText());
			
			                 if (grand_parent_text.equalsIgnoreCase(listofgrantparentelements1.get(element).getText())) {

				                    act.moveToElement(listofgrantparentelements1.get(element)).build().perform();
			}
		}
	}

}

