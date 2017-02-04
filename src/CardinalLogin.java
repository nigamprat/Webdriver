import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CardinalLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		IAmTheListner listner = new IAmTheListner();
		
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		eventDriver.register(listner);
		eventDriver.get("http://orderexpress.cardinalhealth.com");
		
		eventDriver.findElement(By.xpath("//*[@id='USER']")).sendKeys("ac.a.qctest3_new");
		eventDriver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys("Cardinal1");
		eventDriver.findElement(By.xpath("//*[@id='HomepageSignIn']/form/input[11]")).click();
		
		WebElement logout = eventDriver.findElement(By.xpath("//*[@id='logoutUserLink']"));
		
		
		boolean isLogoutDisplayed = logout.isDisplayed();
		
		if(isLogoutDisplayed)
		{
			System.out.println("User Login Successfull");
			
		}
		else
		{
			System.out.println("User Login not Successfull");
		}
		

	
	List<WebElement> drpAccounts = eventDriver.findElement(By.xpath("//*[@id='selectDropDown']")).findElements(By.tagName("option"));
	
	for(int i = 0; i< drpAccounts.size();i++)
	{
		System.out.println(drpAccounts.get(i).getText());
		
	}
		
		
		
		
		
		
		
		
		
		
	}

}
