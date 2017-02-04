package orderExpress_Common_Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class Common_Utils 
{

	private static WebElement element = null;
	
	public static boolean clickLinkOnPage(WebDriver driver, String linkText)
	{
		boolean result = false;
		try
		{
			element = driver.findElement(By.linkText(linkText));
			element.click();
			result = true;
			System.out.println("Link Click -- Link Text :-"+linkText);
			
		}
		catch(ElementNotFoundException e)
		{
			System.out.println("Link not found in Page - LinkText :- "+linkText);
			System.out.println("Exception Message :- "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Run time Exception Occured..Message :- "+e.getMessage());
		}
		return result;
		
	}
}
