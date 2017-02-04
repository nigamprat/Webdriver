import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class IamTheDriver {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		EventFiringWebDriver eventfiring = new EventFiringWebDriver(driver);
		
		IAmTheEventListener2 eventListner = new IAmTheEventListener2();
		IAmTheListner eventlistner2 = new IAmTheListner();
		
		eventfiring.register(eventListner);
		eventfiring.register(eventlistner2);
		eventfiring.navigate().to("http://www.google.com");
		eventfiring.navigate().to("http://www.facebook.com");
		
	}

}
