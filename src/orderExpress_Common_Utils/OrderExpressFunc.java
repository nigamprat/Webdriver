package orderExpress_Common_Utils;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderExpressFunc
{
	
	
	public String getLastOrderNumberNonC2(WebDriver driver)
	{
		String orderNumber = null;
		
		try
		{
			List<WebElement> listOrderId = driver.findElements(By.id("orderArea:REGULAR"));
			
			orderNumber = listOrderId.get(listOrderId.size()).getAttribute("id").toString();
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured - Exception Message --"+e.getMessage());
		}
		
		return orderNumber;
		
	}
	
	
	public boolean fnVerifyCINinOder (WebDriver driver , String sOrderNumber , String sCin)
	{	
		String sxpath = "//table[@id='grid:'"+sOrderNumber+ "']//td[@class='CINTd']/a[contains(text(),'"+sCin+"')]";
		boolean result;
		try
		{
			result = driver.findElement(By.xpath(sxpath)).isDisplayed();
			return result;
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured - Exception Message --"+e.getMessage());
			return false;
		}
		
		
	}
	
}
