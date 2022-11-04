package pomzeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginsec {

	@FindBy(xpath="//input[@label='PIN']")
	private WebElement passw;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;

	public loginsec(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void logg() {
		passw.sendKeys("234567");
	}
	public void submitb() {
		submitbutton.click();
	}
}
