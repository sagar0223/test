package zeroda;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomzeroda.login2;
import pomzeroda.loginsec;
import pomzeroda.logout;
import pomzeroda.order;

public class testzeroda {
	WebDriver driver;
	login2 log;
	loginsec logsec;
	order ord;
	logout logo;
	
	@BeforeClass
	public void openbrw() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com");
		
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void openapp() throws InterruptedException 	{
		System.out.println("Before method");
	 log = new login2(driver);
	 log.UN();
	 log.PWD();
	 log.log();

 	logsec = new loginsec(driver);
 	logsec.logg();
 	logsec.submitb();
 	Thread.sleep(2000);
 	
 	ord=new order(driver);
 	logo=new logout(driver);
}
@Test

public void test() throws InterruptedException {
	System.out.println("test");

	ord.orde();
	
	ord.trades();
	Thread.sleep(2000);
	ord.getstart();
	ord.startedclose();
	Thread.sleep(2000);
	
//	ord.gtt1();
//	ord.getstart();
//	ord.gttclose();
//	
	ord.clkuser();
	String ordurl = driver.getCurrentUrl();

	
}
@Test
public void test1() {
	System.out.println("test1 holdings");
	
	ord.hold();
	ord.clkuser();
	
	String hold = driver.getCurrentUrl();
	
	//SoftAssert soft=new SoftAssert();
	// 1) comparision 2) Apply result on @Test
			// Actual equal to expected = True => TC passed
			// Actual equal to expected = False => TC failed
	
	//soft.assertEquals("https://kite.zerodha.com/holdings",hold);
	

	// 1) comparision 2) Apply result on @Test
			// Actual equal to expected = True => TC Failed
			// Actual equal to expected = False => TC failed
	
	//soft.assertNotEquals("https://kite.zerodha.com/holdings",hold);
	
	
	// 1) Apply result on @Test
	// Result = True => TC PASSED
	// Result = False => TC Failed	
	//boolean result = hold.equals("https://kite.zerodha.com/holdings");
	//soft.assertTrue(result);
	
	
	// 1) Apply result on @Test
		// Result = True => TC Failed
		// Result = False => TC Passed
	//boolean resuult1 = hold.equals("https://kite.zerodha.com/holdings");
	//soft.assertFalse(resuult1);
	
//	Forcefully remove from execution 
	//soft.fail();
	
	// Apply the soft assertbresults on the @test methods
	//soft.assertAll();
	
}

@Test
public void test2() {
	System.out.println("test2 position");
	ord.position();
	ord.clkuser();
	String position = driver.getCurrentUrl();
	if(position.equals("https://kite.zerodha.com/positions")) {
		System.out.println("navigate correct to position page");
	}
	else {
		System.out.println("not navigate to position");
	}
}

@Test(priority=4)
public void test3() {
	System.out.println("test3 funds");
	
	ord.fund();
	ord.clkuser();
	String fund = driver.getCurrentUrl();
	if(fund.equals("https://kite.zerodha.com/funds"))
	{
		System.out.println("navigate to funds");
	}
	else {
		System.out.println("not navigate to funds");
	}
}
@Test

public void test4() {
	System.out.println("test4 Apps");
	
	ord.apps();
	ord.clkuser();
	String app = driver.getCurrentUrl();
	if(app.equals("https://kite.zerodha.com/apps"))
	{
		System.out.println("navigate to Apps");
	}
	else {
		System.out.println("not navigate to apps");
	}
}
	@AfterMethod
	public void l() throws InterruptedException {
	
	logo.logoutdash();
	logo.changeusr();
	
	}
	@AfterClass()
	public void afterclass() {
		driver.close();
	}
}
