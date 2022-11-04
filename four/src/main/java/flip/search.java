package flip;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search {
	
	@FindBy(xpath = "//input[@class='_3704LK']")
	private WebElement searchbox;

	@FindBy(xpath = "//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li")
	private WebElement iphone;

	@FindBy(xpath = "//div[@class='_2kHMtA']")
	private WebElement iphone12;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']") // (//button[@class='_2KpZ6l _2U9uOA _3v1-ww'])
	private WebElement addtocart;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2uS5ZX _2Dfasx']")
	private WebElement notify;

	public search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Searchbox() {
		searchbox.sendKeys("iphone 12");
	}

	public void Search(WebDriver driver) throws InterruptedException {
		java.util.List<WebElement> ref = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));

		Thread.sleep(2000);
		ref.get(2).click();

	}

	public void clickiphone12(WebDriver driver) throws InterruptedException {
		iphone12.click();
		Thread.sleep(3000);

		Set<String> ids = driver.getWindowHandles();

		ArrayList<String> a1 = new ArrayList<String>(ids);

		String cbid = a1.get(1);
		driver.switchTo().window(cbid);
		Thread.sleep(3000);

		

		//WebElement your = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", addtocart);
		
	    js.executeScript("window.scrollBy(0,-50)");// Scroll up 200 pixcels

	    addtocart.click();
	}

}


