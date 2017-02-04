package orderExpress_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import orderExpressPageObjects.HomePage;
import orderExpressPageObjects.LoginPage;
import orderExpressPageObjects.SearchResult;
import orderExpressPageObjects.ShoppingCart;

public class Test_Flow1
{
	
	public WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("http://orderexpressstg.cardinalhealth.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test
	public void LoginToCardinal() throws InterruptedException
	{
		LoginPage.txt_UserName(driver).sendKeys("auto_acute3");
		LoginPage.txt_Password(driver).sendKeys("Cardinal1");
		LoginPage.btn_Login(driver).click();
		Thread.sleep(5000l);
		Boolean bLogOutLink = HomePage.link_Logout(driver).isDisplayed();
		Assert.assertTrue(bLogOutLink, "User Not able To Login");
		System.out.println("Login Successfull");
		if(HomePage.link_Close(driver).isDisplayed())
		{
			HomePage.link_Close(driver).click();
		}
	}
	
	/*@Test(dependsOnMethods = "LoginToCardinal")
	public void SelectAccount() throws InterruptedException
	{	
		Thread.sleep(20000l);
		WebElement drpAccount = HomePage.list_Account(driver);
		Select selectAccount = new Select(drpAccount);
		if (selectAccount.getFirstSelectedOption().getText().equalsIgnoreCase("O HUDSON TEST"))
		{
			selectAccount.selectByVisibleText("O HUDSON TEST");
			HomePage.btn_Ok(driver).click();
			Thread.sleep(5000l);
		}
		Assert.assertEquals(selectAccount.getFirstSelectedOption().getText(), "O HUDSON TEST");
	}*/
	
	@Test(dependsOnMethods = "LoginToCardinal")
	public void Test_Searchproduct() throws InterruptedException
	{
		HomePage.txt_productSearch(driver).sendKeys("1165927");
		HomePage.btn_productSearch(driver).click();
		Thread.sleep(5000l);
		Assert.assertEquals(SearchResult.table_SearchResult(driver).isDisplayed(), true ,"Search Result table is displayed");
	
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	@Test(dependsOnMethods={"LoginToCardinal","Test_Searchproduct"})
	public void Test_AddProdutToCart() throws InterruptedException
	{
		
		Assert.assertEquals(SearchResult.txt_Qty(driver,"1165927").isDisplayed(),true,"Item displayed in the search result");
		SearchResult.txt_Qty(driver,"1165927").sendKeys("2");
		SearchResult.btn_AddToCart_SearchResult(driver).click();
		if(SearchResult.btn_Ok_MessageText(driver).isDisplayed())
		{
			SearchResult.btn_Ok_MessageText(driver).click();
		}
		SearchResult.radio_CreatenewOrder(driver).click();
		SearchResult.btn_Ok_PurchaseOrder(driver).click();
		if(SearchResult.btn_AddToCart_ShoppingCartSummary(driver).isDisplayed())
		{
			SearchResult.btn_AddToCart_ShoppingCartSummary(driver).click();
			Thread.sleep(5000l);
			Assert.assertEquals(ShoppingCart.NonC2OrderTab(driver).isDisplayed(),true,"Shopping Cart Page Displayed");
		}
		
		
	}
	
}
