
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab {

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://orderexpress.cardinalhealth.com");
		
		driver.findElement(By.linkText("Privacy policy")).click();
		
		Set<String> windid = driver.getWindowHandles();
		Iterator<String> iterate = windid.iterator();
		
		String mainWindow = iterate.next();
		String tabWindow = iterate.next();
		
		System.out.println("Main Window"+mainWindow);
		System.out.println("Tab Window"+tabWindow);
		
		driver.switchTo().window(tabWindow);
		driver.findElement(By.linkText("Medical")).click();
		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File("d:\\webdriver_screenshot.jpg"));
		
		
		driver.close();
		driver.switchTo().window(mainWindow);
		
		driver.close();
		
		
		
	}

}
