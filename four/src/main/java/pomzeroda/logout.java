package pomzeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	
	@FindBy(xpath="//a[@target='_self']")
	private WebElement logout1;
	
	@FindBy(xpath="//a[text()='Change user']")
	private WebElement changeuser;
	
public logout(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void logoutdash() throws InterruptedException {
	logout1.click();
	Thread.sleep(2000);
}

public void changeusr() {
	changeuser.click();
}

}
