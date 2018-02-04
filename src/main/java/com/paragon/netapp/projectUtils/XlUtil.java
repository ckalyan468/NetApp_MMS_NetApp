package com.paragon.netapp.projectUtils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XlUtil 
{
	public void readFromXL(String sheetName) throws Exception
	{
		String filePath=".\\src\\test\\resources\\TestData.xls";
		
		FileInputStream fis=new FileInputStream(new File(filePath));
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheet(sheetName);
		
		int lastrowNum=sheet.getLastRowNum();
		
		HSSFRow row=sheet.getRow(1);
		
		int lastcellNum=row.getLastCellNum();
		HSSFCell cell;
		
		for(int i=1;i<=lastrowNum;i++)
		{
			for(int j=0;j<=lastcellNum;j++)
			{
			String cellValue=sheet.getRow(1).getCell(j).getStringCellValue();
			System.out.println(cellValue);
			}
		}
		
		
	}

}
