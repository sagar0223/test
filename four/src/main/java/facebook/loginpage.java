package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement user;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passw;
	
	@FindBy(xpath="//button[@id='loginbutton']")
	private WebElement logbutton;
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void username() {
		user.sendKeys("8007149972");
	}
	public void password() {
		passw.sendKeys("9049251428");
	}
	public void loginbutton() {
		logbutton.click();
	}
}
