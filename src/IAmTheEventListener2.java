import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class IAmTheEventListener2 extends AbstractWebDriverEventListener
{
	
	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
	System.out.println("Before Navigate To "+url);
	}
	
	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigate To: "+url+" and Current url is: "+driver.getCurrentUrl());
		}
	
	@Override
	public void beforeNavigateBack(WebDriver driver) {
	System.out.println("Before Navigate Back. Right now I'm at"+driver.getCurrentUrl());
	}
	
	public void beforeChangeValueOf(WebElement element, WebDriver driver)
	{
		System.out.println("Before Change Value of Element is "+element.getText());
	}
	
	public void afterChangeValueOf(WebElement element, WebDriver driver)
	{
		System.out.println("Before Change Value of Element is "+element.getText());
	}
	
	public void beforeClickOn(WebElement element, WebDriver driver)
	{
		System.out.println("Object to be Clicked" +element.getText());
	}
	

	public void afterClickOn(WebElement element, WebDriver driver)
	{
		System.out.println("Object Clicked Successfull" +element.getText());
	}
	
	public void beforeFindBy(By by, WebElement element, WebDriver driver)
	{
		
	}
}



