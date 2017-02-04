import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleCapcha {

	public static void main(String[] args) 
	{

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/");
		String sText = driver.findElement(By.xpath("//*[@id='cimage']")).getText();
		System.out.println("Capcha text"+sText);
	

	}

}
