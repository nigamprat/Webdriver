package orderExpressPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart 
{
	private static WebElement element = null;
	
	public static WebElement submitOrder(WebDriver driver , String OrderNumber)
	{
		String sxpath = "btnRegSubmitOrderTop:"+OrderNumber;
		element = driver.findElement(By.id(sxpath));
		return element;
		
	}
	
	public static WebElement NonC2OrderTab(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='tabRegular_Inner']/div"));
	}
	
	
}
