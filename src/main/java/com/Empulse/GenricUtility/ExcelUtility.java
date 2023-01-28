package com.Empulse.GenricUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getDataFromExcel(String sheetName,int rowNum, int celNum) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathContent.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);		
		Row row=sheet.getRow(rowNum);
		Cell cell=row.getCell(celNum);
		String data=row.getCell(celNum).getStringCellValue();
		wb.close();
		return data;
	}

}
