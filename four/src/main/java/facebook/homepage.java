package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	//homepage
	@FindBy(xpath="(//div[@class='x1i10hfl xjbqb8w xjqpnuy xa49m3k xqeqjp1 x2hbi6w x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x1ypdohk xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j x1n2onr6 x16tdsg8 x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1q0g3np x87ps6o x1lku1pv x1a2a7pz x6s0dn4 x1lq5wgf xgqcy7u x30kzoy x9jhf4c x78zum5 x1r8uery x1iyjqo2 xs83m0k xl56j7k x1pshirs x1y1aw1k x1sxyh0 xwib8y2 xurb0ha'])[2]")
	private WebElement photo;
	@FindBy(xpath="//div[@class='x1tk7jg1 x10l6tqk x92rtbv']")
	private WebElement close;
	
	@FindBy(xpath="//span[text()='Feeling/activity']")
	private WebElement feeling;
	@FindBy(xpath="(//input[@dir='ltr'])[2]")
	private WebElement selectfelling;
	@FindBy(xpath="//div[@aria-label='Back']")
	private WebElement back;
	@FindBy(xpath="//div[@class='x1tk7jg1 x10l6tqk x92rtbv']")
	private WebElement closefeel;
	

	//friend pom class
	@FindBy(xpath="//a[@aria-label='Friends']")
	private WebElement friends;
	
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void photovideo() {
		photo.click();
		
	}
	public void photoclose() {
		close.click();
	}
	public void clickfeeling() {
		feeling.click();
	}
	
	public void feelingemogy() {
		selectfelling.sendKeys("happy");
		
	}
	public void clickback() {
		back.click();
		
	}
	public void feelingclose() {
	closefeel.click();
		
	}
	
	public void clickfriend() {
		friends.click();
	}
}

