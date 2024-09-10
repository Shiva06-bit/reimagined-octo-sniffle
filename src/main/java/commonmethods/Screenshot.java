package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import SeleniumProjectnew.Browselaunch;

public class Screenshot extends Browselaunch{
	
	public static void Scshot() throws IOException {
		
	File	Srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Srcfile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\error.png"));
	}

}
