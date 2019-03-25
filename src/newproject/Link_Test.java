package newproject;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.housingman.com/real-estate-in-bangalore");

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 1; i <= links.size(); i = i + 1)

		{

			{
				System.out.println(links.get(i).getAttribute("href"));
				// System.out.println(links.get(i).getText());

			}
		}
	}
}
