import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
static WebDriver driver;
	
	public static void launch(String s) {
		System.setProperty("webdriver.chrome.driver", "D:\\base project\\DicksmithPro\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(s);
		
	}
	public static void pass(WebElement w,String s) {
		w.sendKeys(s);

	}
	
	public static void clik(WebElement w) {
		w.click();
	}
	public static void cse(WebElement w) {
		w.click();
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		BaseClass.driver = driver;
	}
}
