import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTML_UnitDriver {

	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://orderexpress.cardinalhealth.com");
		
		driver.findElement(By.xpath("//*[@id='USER']")).sendKeys("ac.a.qctest3_new");
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys("Cardinal1");
		driver.findElement(By.xpath("//*[@id='HomepageSignIn']/form/input[11]")).click();
		
		WebElement logout = driver.findElement(By.xpath("//*[@id='logoutUserLink']"));
		
		
		Boolean isLogoutDisplayed = logout.isDisplayed();
		
		if(isLogoutDisplayed)
		{
			System.out.println("User Login Successfull");
			
		}
		else
		{
			System.out.println("User Login not Successfull");
		}
		

	
	List<WebElement> drpAccounts = driver.findElement(By.xpath("//*[@id='selectDropDown']")).findElements(By.tagName("option"));
	
	for(int i = 0; i< drpAccounts.size();i++)
	{
		System.out.println(drpAccounts.get(i).getText());
		
	}
		
		

	}

}
