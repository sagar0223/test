package twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout3 {
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-12181gd r-1pi2tsx r-1ny4l3l r-13qz1uu'])[1]")
	private WebElement lg;
	@FindBy(xpath="(//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'])[4]")
	private WebElement lo;
	@FindBy(xpath="(//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'])[6]")
	private WebElement flg;
	
	public logout3(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void lgcred() throws InterruptedException {
		lg.click();
		Thread.sleep(2000);
		lo.click();
		Thread.sleep(2000);
		flg.click();
	}

}
