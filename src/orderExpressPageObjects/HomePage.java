package orderExpressPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage
{
	private static WebElement element = null;
	
	public static WebElement link_Logout(WebDriver driver)
	{
		element = driver.findElement(By.id("logoutUserLink"));
		return element;
	}
	
	
	
	public static WebElement link_Close(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id='tblSplashContent']//a/span[text()='Close']"));
	}
	public static WebElement list_Account(WebDriver driver)
	{
		element = driver.findElement(By.id("selectDropDown"));
		return element;
	}
	
		
	public static WebElement btn_Ok(WebDriver driver)
	{
		element = driver.findElement(By.id("ok"));
		return element;
	}
	
	
	public static WebElement link_navigate(WebDriver driver , String link_text)
	{
		element = driver.findElement(By.linkText("link_text"));
		return element;
	}
	
	public static WebElement txt_productSearch(WebDriver driver)
	{
		element = driver.findElement(By.id("txtProductSearchId"));
		return element;
	}
	
	public static WebElement btn_productSearch(WebDriver driver)
	{
		element = driver.findElement(By.id("btnProductSearchId"));
		return element;
	}
	
}



