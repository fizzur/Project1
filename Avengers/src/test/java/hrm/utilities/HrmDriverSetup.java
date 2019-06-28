package hrm.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmDriverSetup {
	
	public static WebDriver driver;
	
	public static void getChromedriver(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void tearDown() {
		driver.quit();
	}

}
