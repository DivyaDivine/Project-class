package org.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BrowserFiles {
public static void main(String[] args) throws IOException {
	//Finding the File Location
	File F =new File("C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Excel Data\\Data.xlsx");
	FileInputStream Stream=new FileInputStream(F);
	 Workbook book=new XSSFWorkbook(Stream);
	 Sheet sheet = book.getSheet("Sheet1");
	 for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		 Row row = sheet.getRow(i);
		 for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			 Cell cell = row.getCell(j);
			 String s1 = cell.getStringCellValue();
			 System.out.println(s1);
			
		}
		
	}
}
}
