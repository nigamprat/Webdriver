package Learn_Excel_ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException
	
	{
		File src = new File("C:\\Users\\Prateek\\Desktop\\InputData.xlsx");
		FileInputStream inputstr = new FileInputStream(src);
		XSSFWorkbook inputData = new XSSFWorkbook(inputstr);
		XSSFSheet sheet1 = inputData.getSheetAt(0);
		System.out.println("Row Count.."+(sheet1.getLastRowNum()+1));
		
		for(int i = 0;i<=sheet1.getLastRowNum();i++)
		{
			System.out.println("Data for"+(i+1)+" cell.."+sheet1.getRow(i).getCell(0).getStringCellValue());
		}
		inputData.close();
		

	}

}
