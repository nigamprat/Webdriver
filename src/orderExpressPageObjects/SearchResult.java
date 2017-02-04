package orderExpressPageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult 
{
	private static WebElement element=null;
	
	public static WebElement table_SearchResult(WebDriver driver)
	{
		element = driver.findElement(By.id("searchResultsTable"));
		return element;
	}
	
	public static WebElement txt_Qty(WebDriver driver , String sCin)
	{		
		String xpath = "//input[contains(@id,'hddnCinId')][@value='"+sCin+"']/following-sibling::td[@class='QUANTITYTd']/input"	;
		element = driver.findElement(By.xpath(xpath)); 
		return element;
	}
	
	public static WebElement btn_AddToCart_SearchResult(WebDriver driver)
	{
		element = driver.findElement(By.id("addToShoppingCartDive"));
		return element;
	}
	
	public static WebElement btn_Ok_MessageText(WebDriver driver)
	{
		element = driver.findElement(By.id("ok"));
		return element;	
	}
		
	public static WebElement radio_CreatenewOrder(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//td[text()='Create New Order']/preceding-sibling::td/input"));
		return element;
		
	}
	
	public static WebElement btn_Ok_PurchaseOrder(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='addToCartButOk']"));
		return element;	
	}
	
	public static WebElement btn_AddToCart_ShoppingCartSummary(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='btnAddtoCart']"));
		return element;	
	}
	
	

	

}
