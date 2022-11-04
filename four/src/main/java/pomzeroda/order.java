package pomzeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class order {
	
	// order POM
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement orders;
	@FindBy(xpath="//span[text()='Trades']")
	private WebElement trade;
	@FindBy(xpath="//button[text()='Get started ']")
	private WebElement getstarted;
	@FindBy(xpath="//button[text()='Close ']")
	private WebElement startclose;
	
	//GTT POM
	@FindBy(xpath="//a[@href='/orders/gtt']")
	private WebElement gtt;
	@FindBy(xpath="//button[text()='New GTT ']")
	private WebElement newgt;
	@FindBy(xpath="//button[text()='Close ']")
	private WebElement gtclose;
	
	//holding tab part
	@FindBy(xpath="//span[text()='Holdings']")
	private WebElement holding;
	
	@FindBy(xpath="//span[text()='Positions']")
	private WebElement positions;
	
	@FindBy(xpath="//span[text()='Funds']")
	private WebElement funds;
	
	@FindBy(xpath="//span[text()='Apps']")
	private WebElement app;
	
	@FindBy(xpath="//span[text()='OKP335']")
	private WebElement clickuser;
	
	

	public order(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	// orders
	public void orde() {
		orders.click();
	}

public void trades() {
	trade.click();
}
	
	public void getstart() {
		getstarted.click();
		
	}
	public void startedclose() {
		startclose.click();	
		
	}
	
	// gtt start
	public void gtt1() {
		gtt.click();	
	}
	public void newgtt() {
		newgt.click();
	}
	public void gttclose() {
		gtclose.click();
	}
	
	
	
	///holding
	
	public void hold() {
		holding.click();
	}
	
	public void position() {
		positions.click();
	}
	
	public void fund() {
		funds.click();
	}
	
	public void apps() {
		app.click();
	}
	public void clkuser() {
		clickuser.click();
	
	}
}
