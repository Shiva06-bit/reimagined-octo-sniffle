package popularitesItems;

import java.io.IOException;

import javax.xml.ws.soap.Addressing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Exceldata.ExcelDataDrivern;
import SeleniumProjectnew.Browselaunch;
import commonmethods.Screenshot;
import objectreporitary.HomepageElements;
import objectreporitary.Productdetails;

public class PopularItemsTest extends Browselaunch {
	public static  HomepageElements hp;
	public static Productdetails pd;
	public static Screenshot sc;
	static ExcelDataDrivern excel;
	
	@BeforeTest
	public static void StartTest() {
		
		System.out.println("*************Test Started***********");
	}
	
	@BeforeMethod
	public static void OpenBrowser() {
		Browselaunch bl = new Browselaunch();
		bl.LaunchBrowser("chrome");
	}
	
	@Test
	public static void TabletTest() throws InterruptedException, IOException {
		hp = new HomepageElements(driver);
		pd = new Productdetails(driver);
		sc = new Screenshot();
		Thread.sleep(10000);
		hp.popularitems().click();
		Thread.sleep(10000);
		hp.tablet().click();
		
		String tabletactualtext = pd.Productdetails().getText();
		excel = new ExcelDataDrivern();
		String tablectExcpectedtext =excel.Readdata(1, 0);
		if(tabletactualtext.contains(tablectExcpectedtext)) {
			excel.writedata(1, 1, "valid data");
		}
		else {
			excel.writedata(1, 1, "validaata");
			sc.Scshot();
		}
		}
	
	@Test
	public static void LaptopTest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		hp = new HomepageElements(driver);
		pd = new Productdetails(driver);
		hp.popularitems().click();
		Thread.sleep(10000);
		hp.laptoplink().click();
		
		String actualText = pd.Productdetails().getText();
		String expectedText = excel.Readdata(2, 0);
		if(actualText.contains(expectedText)) {
			excel.writedata(2, 1, "valid data");
		}
		else {
			excel.writedata(2, 1, "validaata");
			sc.Scshot();
		}
		}
	
	@Test
	public static void SpeakerTest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		hp = new HomepageElements(driver);
		pd = new Productdetails(driver);
		hp.popularitems().click();
		Thread.sleep(10000);
		hp.speakerlink().click();
		
		String actualText = pd.Productdetails().getText();
		String expectedText = excel.Readdata(3, 0);
		if(actualText.contains(expectedText)) {
			excel.writedata(3, 1, "valid data");
		}
		else {
			excel.writedata(3, 1, "valid data");
			sc.Scshot();
		}
		}
	
	@AfterMethod
	public static void teardown() {
		driver.close();
	}
	
	@AfterTest
	public static void endTest() {
		System.out.println("************ test  ended *************");
	}
	
	}
	
	
	
	
	
	

	
	
	


