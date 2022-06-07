package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool;

public class HelperCLass {

	public static WebDriver driver;
	
	public static JavascriptExecutor j;

	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void max() {
		driver.manage().window().maximize();
	}
	
	

	public static void url(String url) {
		driver.get(url);
	}

	public static void title() {
		driver.getTitle();
	}

	public static void fillText(WebElement element, String user) {
		element.sendKeys(user);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void action(WebElement element) {
	  Actions a = new Actions(driver);
	  a.moveToElement(element).perform();
	}
   
	public static void scroll(Boolean name, WebElement element) {
		j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(name)", element);
				
   	}
	
	public static String parentWindow() {
		String parentid = driver.getWindowHandle();
        return parentid;
	}
	
	public static Set<String> allWindow() {
		Set<String> allid = driver.getWindowHandles();
        return allid;
	
	}
	
	public static String readtheexcel(String sheets, int a, int b) throws IOException {
File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Sample\\src\\test\\java\\Sheets\\Sample.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		  
		Workbook book = new XSSFWorkbook(fi);
		
		Sheet sheet = book.getSheet(sheets);
		
		Row row = sheet.getRow(a);
				Cell data = row.getCell(b);
				
				int type = data.getCellType();
				
				String name ="";
				
				if (type==1) {
					
					name = data.getStringCellValue();
					System.out.println(name);
				}
				else if (DateUtil.isCellDateFormatted(data)) {
					Date date = data.getDateCellValue();
					
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
					name = s.format(date);
					
					
				} else {
					double db = data.getNumericCellValue();
					
					long l = (long)db;
					name = String.valueOf(l);
 
				}
				
				return name;
				

	}
	
	public static void datetime() {
		Date d = new Date();
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String date = s.format(d);
		System.out.println(date);

	}
	
	
	
	
	
	
	
	
	
}
