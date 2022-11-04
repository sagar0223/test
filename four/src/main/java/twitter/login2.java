package twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 {
	
	@FindBy(xpath="(//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'])[10]")
	private WebElement in;
	@FindBy(xpath="//input[@autocapitalize='sentences']")
	private WebElement un;
	@FindBy(xpath="(//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'])[7]")
	private WebElement nxt;
	
	@FindBy(xpath="//input[@autocomplete='current-password']")
	private WebElement pwd;
	
	@FindBy(xpath="(//div[@role='button'])[3]")
	private WebElement nxt1;
	
//	@FindBy(xpath="//input[@autocapitalize='none']")
//	private WebElement twusernm;
//	@FindBy(xpath="(//div[@role='button'])[2]")
//	private WebElement nxt2;
	
	@FindBy(xpath="(//div[@role='button'])[1]")
	private WebElement loout;
	
	public login2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void cred() throws InterruptedException {
		in.click();
		Thread.sleep(2000);
		un.sendKeys("7020765028");
		Thread.sleep(2000);
		nxt.click();

		
		}
	public void username() throws InterruptedException {
		
		pwd.sendKeys("aishsum18");
		Thread.sleep(2000);
		nxt1.click();
	}
	public void logout() throws InterruptedException {
		loout.click();
		Thread.sleep(2000);
	}

}
