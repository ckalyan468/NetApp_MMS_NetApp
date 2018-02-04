
package com.paragon.netapp.tests;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class Demo 
{
	
	public static void main(String args[])throws Exception
	{
		String filePath=".\\src\\test\\resources\\TestData.xls";
		
		FileInputStream fis=new FileInputStream(new File(filePath));
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheet("loginTest");
		
		int lastrowNum=sheet.getLastRowNum();
		
		HSSFRow row=sheet.getRow(1);
		
		int lastcellNum=row.getLastCellNum();
		HSSFCell cell;
		
		for(int i=1;i<=lastrowNum;i++)
		{
			for(int j=0;j<=lastcellNum;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).getCellType());
				if(sheet.getRow(i).getCell(j).getCellType()==0)
				{
					sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
				}
				
			String cellValue=sheet.getRow(1).getCell(j).getStringCellValue();
			System.out.println(cellValue);
			}
		}
		
		
	}

}
