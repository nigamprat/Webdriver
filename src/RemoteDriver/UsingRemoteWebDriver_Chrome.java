package RemoteDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UsingRemoteWebDriver_Chrome {

	public static void main(String[] args)
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		RemoteWebDriver remoteWD = null;
		try
		{
			remoteWD = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
			remoteWD.get("http://www.google.com");
			remoteWD.findElement(By.name("q")).sendKeys("Packt Publishing");
		
		}catch(MalformedURLException e)
		{
			e.printStackTrace();
		}

	}

}
