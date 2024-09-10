package objectreporitary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageElements {
	
	static WebDriver driver;
	
	public HomepageElements(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public   WebElement popularitems() {
		
		return driver.findElement(By.linkText("POPULAR ITEMS"));
	}
	
	
	public static WebElement tablet() {
		return driver.findElement(By.id("details_16"));
		
	}
	
	public static WebElement laptoplink() {
		return driver.findElement(By.id("details_10"));
	}
	
	public static WebElement speakerlink() {
		return driver.findElement(By.id("details_21"));
	}

}
