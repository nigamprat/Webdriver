package learning_TestNG_Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test_Assertion
{
	public WebDriver driver;
	
	@BeforeClass
	public void initialize()
	{
		driver = new FirefoxDriver();
	}
	
	@Parameters({"username","password"})
	@Test
	public void testLoginToOE(String username,String password)
	{
	
		driver.get("http://orderexpress.cardinalhealth.com");
		
		driver.findElement(By.xpath("//*[@id='USER']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='HomepageSignIn']/form/input[11]")).click();
		WebElement logout = driver.findElement(By.xpath("//*[@id='logoutUserLink']"));
		Assert.assertEquals(true, logout.isDisplayed());
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
}
