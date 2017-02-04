package Lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	File src;
	public ExcelDataConfig(String path)
	{
		try
		{
			src = new File(path);
			FileInputStream fin = new FileInputStream(src);
			wb = new XSSFWorkbook(fin);
		}
		catch(Exception e)
		{
			System.out.println("Exception...."+e.getMessage());
		}
	}
	
	public String getData(String sheetName , int row , int col)
	{
		sheet = wb.getSheet(sheetName);
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}
	
	public void writeData(String sheetName , int row , int col,String value)
	{
		try 
		{
			FileOutputStream fout = new FileOutputStream(src);
			sheet = wb.getSheet(sheetName);
			sheet.getRow(row).createCell(col).setCellValue(value);
			wb.write(fout);
			wb.close();
		} 
		catch (Exception e)
		{
			System.out.println("Exception...."+e.getMessage());
		}
	}
	
	public int getRowCount(String sheetName)
	{
		int row = wb.getSheet(sheetName).getLastRowNum();
		row = row+1;
		return row;
	}
	
	
}
