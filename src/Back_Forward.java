import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Back_Forward {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://google.com");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//*[@id='fsl']/a[3]")).click();
		driver.navigate().back();
		Thread.sleep(2000l);
		driver.navigate().forward();
		

	}

}
