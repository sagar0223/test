package flip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement usrnm;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pssw;
	@FindBy(xpath = "(//span[text()='Login'])[2]")
	private WebElement li;

	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enter() {
		usrnm.sendKeys("7020765028");
		pssw.sendKeys("@Saarth1017");
		li.click();
	}
}


