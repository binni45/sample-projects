package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AddCart {
	public static WebDriver driver;
	public static String driverPath = "C:\\workspace\\tools\\selenium\\";
	public static String sBookKey = "Selenium";
	private static final String sSearchBox = "fk-top-search-box";
	private static final String sSearchResult = "//li[contains(text(),'in')]//span";
	private static final String sBookName = "(//a[contains(.,'" + sBookKey + "')])[last()]";
	private static final String sAddToCart = "(//input[contains(@value,'Add to Cart')])[1]";
	private static final String sViewCartXPath = "(//a[contains(.,'view cart')])[1]";

	public static void initWebDriver(String URL) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");


		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}

	public static void main(String[] args) throws InterruptedException {

		initWebDriver("http://www.flipkart.com");

		flipkartLogin();

		driver.findElement(By.id(sSearchBox)).sendKeys(sBookKey);

		WebElement searchResult = getElement(By.xpath(sSearchResult));
		searchResult.click();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sBookName))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click();

		getElement((sViewCartXPath)).click();
		getElement(("form[id='view-cart-form'] button")).click();
		getElement(("//input[@id='email' and @name='email']")).sendKeys("test@testmail.com");
		Thread.sleep(1000);
		endSession();
	}

	private static WebElement getElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

	public static WebElement getElement(String locator) {

		String typeoflocator = locator.split(":")[0];
		String locatorValue = locator.split(":")[1];

		WebElement element=null;
		if (typeoflocator.equalsIgnoreCase("cssSelector")) {

			element = driver.findElement(By.cssSelector(locatorValue));

		} else if (typeoflocator.equalsIgnoreCase("xpath")) {

			element = driver.findElement(By.xpath(locatorValue));
		} else if (typeoflocator.equalsIgnoreCase("id")) {

			element = driver.findElement(By.id(locatorValue));
		}

		return element;
	}

	public static void flipkartLogin() {
		driver.findElement(By.linkText("Log In")).click();

		getElement("css-selector:input[placeholder='Enter email/mobile']").sendKeys("");
		getElement("input[placeholder='Enter password']").sendKeys("");
		getElement("input[value='Login'][class='submit-btn login-btn btn']").click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void endSession() {
		driver.close();
		driver.quit();
	}
}
