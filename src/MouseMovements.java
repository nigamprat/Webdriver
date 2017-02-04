import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
				
		WebElement elemFrom = driver.findElement(By.xpath("//a[contains(text(),'Travel Information')]"));
		
		
		Actions builder = new Actions(driver);
		builder.moveToElement(elemFrom).build().perform();
		String wind1 = driver.getWindowHandle().toString();
		System.out.println(driver.getWindowHandle().toString());
		
		
		driver.get("https://www.google.in/");
		
		driver.switchTo().window(wind1);
		
	
		

	}

}
