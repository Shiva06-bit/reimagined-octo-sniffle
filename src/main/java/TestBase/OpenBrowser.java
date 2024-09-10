
package TestBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static WebDriver driver;



	public void LaunchBrowser(String browser) {

		

		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.advantageonlineshopping.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		else  if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.advantageonlineshopping.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
	}

}
