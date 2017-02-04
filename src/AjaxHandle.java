import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AjaxHandle {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		Thread.sleep(5000l);
		driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("google");
		String start_webelement = "//*[@id='sbse0']/div[";
		String end_webelement = "]";
		
		for(int i =1;i<=4;i++)
		{
			System.out.println(driver.findElement(By.xpath(start_webelement+i+end_webelement)).getText());
		}

	}

}
