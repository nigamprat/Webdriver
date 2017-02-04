import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
				
		WebElement elemFrom = driver.findElement(By.xpath("//input[@class='origins-value city-name-value']"));
		
		
		Actions builder = new Actions(driver);
		builder.moveToElement(elemFrom).click().build().perform();
		
		
		driver.findElement(By.xpath("//ul[@class='city-name origin-city-name']/li[@data-val='AMD']")).click();
		
		driver.findElement(By.xpath("//div[@class='city-dropdown-list city-name-to']/ul/li[@data-val='DED']")).click();
		
		driver.findElement(By.xpath("//*[@id='depart-date']")).click();
		
		List<WebElement> allfrmDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-year='2016'][@data-month='11'][@data-handler='selectDay']"));
		
		for(WebElement elem:allfrmDates )
		{
			if(elem.getText().equalsIgnoreCase("7"))
			{
				elem.click();
				break;
			}
		}
		
		
		System.out.println("to date clicked");
		
		List<WebElement> alltoDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-year='2016'][@data-month='11'][@data-handler='selectDay']"));
		System.out.println(alltoDates.size());
		for(WebElement elem:alltoDates )
		{
			if(elem.getText().equalsIgnoreCase("22"))
			{
				elem.click();
				break;
			}
		}
		
		Thread.sleep(3000l);
		driver.findElement(By.xpath("//*[@id='ui-id-1-button']")).click();
		
		List<WebElement> elemCurrency = driver.findElements(By.xpath("//ul[@id='ui-id-1-menu']/li"));
		
		for(WebElement elem:elemCurrency )
		{
			if(elem.getText().equalsIgnoreCase("US Dollars"))
			{
				elem.click();
				break;
			}
		}
	
		driver.findElement(By.cssSelector(".search-button.form-submit-btn.btn-indigo")).click();
		
		
		
	}

}
