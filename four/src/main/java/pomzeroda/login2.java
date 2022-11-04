package pomzeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 {
	
	
	//Declare globale variable or datamember
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement login;
	
	//intializing data member or variable
	
	public login2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void UN() {
		username.sendKeys("OKP335");
	}
	public void PWD() {
		password.sendKeys("ZAQ1234567");
	}
	public void log() {
		login.click();
	}
	
}
