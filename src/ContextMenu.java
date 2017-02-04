import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		WebElement Appliances = driver.findElement(By.linkText("Appliances"));
		Actions builder = new Actions(driver);
		builder.contextClick(Appliances)
				.click(driver.findElement(By.linkText("Single Door")))
				.perform();
		
		

	}

}
