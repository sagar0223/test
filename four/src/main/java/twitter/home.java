package twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-sdzlij r-18u37iz r-1777fci r-dnmrzs r-xyw6el r-o7ynqc r-6416eg'])[3]")
	private WebElement noti;
	
	public home(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void notification() throws InterruptedException {
		noti.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
	}

}
