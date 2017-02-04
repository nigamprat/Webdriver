package Learn_Excel_ApachePOI;

import Lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) 
	{
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Prateek\\Desktop\\InputData.xlsx");
		System.out.println("Data in first Row.."+excel.getData("Sheet1",0,0));
		excel.writeData("Sheet1",0,2,"Pass");

	}

}
