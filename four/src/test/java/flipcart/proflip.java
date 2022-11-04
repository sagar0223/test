package flipcart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flip.login;
import flip.search;

public class proflip {
	WebDriver driver;
	login logi;
	search s;
	
	
	@BeforeClass
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		
	}
	@BeforeMethod
	public void openapp() {
	 logi=new login(driver);
	logi.enter();
	 
	 s=new search(driver);
	}
	
	@Test
	public void test() throws InterruptedException {
		System.out.println("test");
		s.Search(driver);
		Thread.sleep(3000);
	s.Searchbox();
		
	}
	@AfterMethod
	public void aftermtd() {
		
	}
	@AfterClass
	public void aftercls() {
		
	}
	

}
