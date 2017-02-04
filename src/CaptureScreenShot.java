import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
	

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orderexpress.cardinalhealth.com");
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File("d:\\webdriver_screenshot.jpg"));

	}

}
