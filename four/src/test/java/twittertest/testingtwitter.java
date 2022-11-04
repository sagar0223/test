package twittertest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import setup.baseclass;
import twitter.home;
import twitter.login2;
import twitter.logout3;
import utils.utility;

public class testingtwitter extends baseclass {
	
	WebDriver driver;
	login2 in;
	logout3 l;
	home hom;
	
	int testid =123;
	
	@Parameters("browser")
	@BeforeClass
	public void openbrowser(String browsername) {
		
		System.out.println(browsername);
		
	if(browsername.equals("chrome")) {

		driver = openchrome();
	
		}
	
	if(browsername.equals("Edge"))	
	{
		driver = openedge();
		
	}
	driver.get("https://twitter.com/?logout=1665232350404");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	@BeforeMethod
	public void credintials() throws InterruptedException {
		System.out.println("BeforeMethod");
		in=new login2(driver);
		in.cred();
		in.username();
		l=new logout3(driver);
		hom=new home(driver);		
	}
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		System.out.println("test");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,url);
		//uti.getdataexcel(driver);

		}
	
	@Test
	public void test1() throws InterruptedException, IOException {
		hom.notification();
		Thread.sleep(1000);
		
	}
	
	@AfterMethod
	public void outcred() throws InterruptedException, IOException {
		System.out.println("AfterMethod");
		l.lgcred();
		Thread.sleep(1000);
		in.logout();
		Thread.sleep(1000);
		
		
	}
	@AfterClass
	public void closebrowser(ITestResult result) throws IOException, InterruptedException {
		System.out.println("AfetrClass");
		if(ITestResult.FAILURE==result.getStatus()) {
			utility.capturescreenshot(driver,testid);
			
		}
	}

}
