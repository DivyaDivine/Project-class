package org.adac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
protected WebDriver driver;
	

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void getDriver(String browserName) {
		
	
		try {
			if(browserName.equalsIgnoreCase("chrome"));{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Driver\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	//To Launch URL
	public void launchURL(String URL) {
		try {
		driver.get(URL);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
		// Passing Data with send keys
		public void typeText(WebElement element, String data){
			try {
				if(element.isEnabled()&& element.isDisplayed()) {
					element.sendKeys(data);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		public void buttnClick(WebElement element) {
			try {
				element.click();
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
		}
		public WebElement findById(String data,String id) {
			WebElement findElement11=null;
			try {
				if(data.equalsIgnoreCase("Id")) {
					 findElement11 = driver.findElement(By.id(id));
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return findElement11;
		}


 public String getDataExcel(String pathName,String sheetName,int rowNo,int cellNo) {
	 String Value=null;
	 try {
		 File f=new File(pathName);
		 FileInputStream IS=new FileInputStream(f);
		 Workbook wb=new XSSFWorkbook(IS);
		 Sheet s = wb.getSheet(sheetName);
		 Row row = s.getRow(rowNo);
		 Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		if(cellType==1) {
			Value = cell.getStringCellValue();
		}else if(DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyy");
			 Value= df.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long) numericCellValue;
			Value=String.valueOf(l);
		}
 
}
catch(Exception e)  {
	System.out.println(e);
				
		 }
return Value;
 
 }
 public String storeDataExcel(String pathName,String sheetName,int rowNo,int cellNo) {
		String Value =null;
		try {
			File f1=new File(pathName);
			FileInputStream S1=new FileInputStream(f1);
			Workbook w1=new XSSFWorkbook(S1);
			Sheet createSheet = w1.createSheet("Order Num");
			Row createrow=createSheet.getRow(1);
			Cell createcell=createrow.getCell(0);
		    FileOutputStream op=new FileOutputStream(f1);
		    w1.write(op);
 }
 catch(Exception e) {
	 System.out.println(e);
 }
 return Value;
}

public void getAttribute(WebElement element, String Value) {
	try {
	String od = element.getAttribute("Value");
	System.out.println(od);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
}
 
}
		