package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {

	public static void capturescreenshot(WebDriver driver, int tc) throws IOException {
		
		
		Date d = new Date(tc);

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy & hh-mm-ss");

		String datet = df.format(d);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\software testing velocity\\Automation testing and Java\\selenium\\projectscreenshot\\demo"+tc+""+datet+".jpg");;
		FileHandler.copy(src, dest);
	}
	
	
	public static String getdataexcel(Sheet sheet, int row,int cell){
		
		File file =new File("F:\\software testing velocity\\Automation testing and Java\\selenium\\excelsheet\\sagar.xlsx");
		FileInputStream file1=new FileInputStream(file);
		WorkbookFactory work = new WorkbookFactory(file1);
		sheet = work.getSheetAt(0);
		try {
			data= getStringCellValue();
		}
		catch(NullPointerException e) {
			double value=getNumericCellValue();
			
		}
		return data;
	}

}
