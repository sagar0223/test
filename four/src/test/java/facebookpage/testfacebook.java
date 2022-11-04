package facebookpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebook.homepage;
import facebook.loginpage;
import facebook.logoutfacebook;

public class testfacebook {
	WebDriver driver;
	loginpage login;
	homepage home;
	logoutfacebook logout;
	
	@BeforeClass
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
		
	}
	@BeforeMethod
	public void openapp() {
	 login=new loginpage(driver);
	 login.username();
	 login.password();
	 login.loginbutton();
	 
	home=new homepage(driver);
     logout=new logoutfacebook(driver);
		
	}
@Test
public void test() throws InterruptedException {
	System.out.println("test");
	home.photovideo();
	Thread.sleep(2000);
	home.photoclose();
	Thread.sleep(2000);
	home.clickfeeling();
	Thread.sleep(2000);
	home.feelingemogy();
	Thread.sleep(2000);
	home.clickback();
	Thread.sleep(4000);
	home.feelingclose();
}
@Test
public void testfriend() {
	System.out.println("testing friend tab");
	home.clickfriend(); 
	
}
@AfterMethod
public void aftermtd() throws InterruptedException {

	
	logout.clickprofile();
	Thread.sleep(4000);
	logout.clicklogout();
	driver.switchTo().alert().accept();
	//driver.close();
	
	
}
@AfterClass
public void aftercls() {
	
}
}






