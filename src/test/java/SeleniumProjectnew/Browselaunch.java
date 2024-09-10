
package SeleniumProjectnew;

import org.openqa.selenium.WebDriver;

import TestBase.OpenBrowser;

public class Browselaunch extends OpenBrowser {
	
	
	public static void main(String[] args) {
		
		OpenBrowser bl = new OpenBrowser();
		
		bl.LaunchBrowser("chrome");
		
		String tl = driver.getTitle();
		System.out.println(tl);
		
	}

}
