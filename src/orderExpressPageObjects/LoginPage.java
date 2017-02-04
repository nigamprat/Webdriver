package orderExpressPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	private static WebElement element = null;
	
	public static WebElement txt_UserName(WebDriver driver)
	{
		element = driver.findElement(By.id("USER"));
		return element;
	}
	
	
	public static WebElement txt_Password(WebDriver driver)
	{
		element = driver.findElement(By.id("PASSWORD"));
		return element;
	}
	
	public static WebElement btn_Login(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id='HomepageSignIn']/form/input[@value='Sign in']"));
		return element;
	}
		
}



