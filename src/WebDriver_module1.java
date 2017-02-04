import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_module1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://youtube.com");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='yt-masthead-signin']/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create account")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Prateek");
		driver.findElement(By.id("LastName")).sendKeys("Nigam");
		driver.findElement(By.xpath("//*[@id='EmailAddress']")).sendKeys("nigamtea@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("krainage@87");
		driver.findElement(By.id("PasswdAgain")).sendKeys("krainage@87");
		
		
		
		
		
		driver.findElement(By.xpath("//*[@id='BirthMonth']/div[1]")).sendKeys("October");
		driver.findElement(By.xpath("//*[@id='BirthDay']")).sendKeys("21");
		driver.findElement(By.xpath("//*[@id='BirthYear']")).sendKeys("1987");
		driver.findElement(By.xpath("//*[@id='Gender']/div")).sendKeys("Male");
		
		
		
		
		
		
	}


}
