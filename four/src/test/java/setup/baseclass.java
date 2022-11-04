package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class baseclass {

		
		public static WebDriver openchrome() {
			System.out.println("method for open chrome");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			return driver;
		}
		public static WebDriver openedge() {
			 
			System.out.println("open edge browsr");
			System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			return driver;
		}
	}


