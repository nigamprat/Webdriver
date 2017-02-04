package DataDriven_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.ExcelDataConfig;

public class Login_Test 
{
	WebDriver driver;
		
	@Test(dataProvider="LoginDatafromExcel")	
	public void testLogin(String userName,String password)
	{
		driver = new FirefoxDriver();
		driver.get("http://orderexpress.cardinalhealth.com");
		driver.findElement(By.xpath("//*[@id='USER']")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='HomepageSignIn']/form/input[11]")).click();
		 
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='logoutUserLink']")).isDisplayed(),"User not able to login");
		System.out.println("----User "+userName+" able to login successfully----");
	}
	
	@DataProvider(name="LoginData")
	public Object[][] testData()
	{
		Object[][] data = new Object[2][2];
		//1st Row
		data[0][0] = "ac.a.qctest3_new";
		data[0][1] = "Cardinal1";	
		
		//2nd Row
		data[1][0] = "test_acute";
		data[1][1] = "Cardinal1";
		return data;
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@DataProvider(name="LoginDatafromExcel")
	public Object[][] testDataFromExcel()
	{
		ExcelDataConfig excelData = new ExcelDataConfig("D:\\Java_Learning\\WebDriver_Project\\TestData\\LoginToOE.xlsx");
		int rowCount = excelData.getRowCount("Sheet1");
		Object[][] data = new Object[rowCount][2];
		//1st Row
		data[0][0] = excelData.getData("Sheet1", 1, 0);
		data[0][1] = excelData.getData("Sheet1", 1, 1);	
		
		//2nd Row
		data[1][0] = excelData.getData("Sheet1", 2, 0);
		data[1][1] = excelData.getData("Sheet1", 2, 1);	
		return data;
	}
	
	
	
	
	
}
