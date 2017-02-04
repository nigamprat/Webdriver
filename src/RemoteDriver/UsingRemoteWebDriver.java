package RemoteDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.steadystate.css.util.Output;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
public class UsingRemoteWebDriver {

	public static void main(String[] args) throws IOException 
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		RemoteWebDriver remoteWD = null;
		WebDriver driver;
		
		try
		{
			remoteWD = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),DesiredCapabilities.firefox());
			remoteWD.get("http://www.google.com");
			remoteWD.findElement(By.name("q")).sendKeys("Packt Publishing");
			driver = new Augmenter().augment(remoteWD);
			File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrfile, new File("d:\\test.png"));
		}catch(MalformedURLException e)
		{
			e.printStackTrace();
		}

	}

}
