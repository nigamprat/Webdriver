import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTML_WebTables {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://orderexpress.cardinalhealth.com");
		
		driver.findElement(By.xpath("//*[@id='USER']")).sendKeys("ac.a.qctest3_new");
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys("Cardinal1");
		driver.findElement(By.xpath("//*[@id='HomepageSignIn']/form/input[11]")).click();
		Thread.sleep(7000l);
		driver.findElement(By.linkText("Services")).click();
		Thread.sleep(7000l);
		driver.findElement(By.xpath("//*[@id='servicesform']/table[2]/tbody/tr[8]/td/a")).click();
		
		WebElement tableAccount = driver.findElement(By.xpath("//*[@id='tblAcctIDBSummary']/tbody"));
		
		List<WebElement> rows = tableAccount.findElements(By.tagName("tr"));
		System.out.println("No. of Rows -- "+ rows.size());
		List<WebElement> columnNames = rows.get(0).findElements(By.tagName("td"));
		System.out.println("No. of Columns -- "+ columnNames.size());
		
		
		
		String xpath_checkbox_start = "//*[@id='selectBox";
		String xpath_checkbox_end = "']"	;
		WebElement tableHeader = driver.findElement(By.xpath("//*[@id='tblAcctIDBSummary']/thead/tr"));
		List<WebElement> colHeader = tableHeader.findElements(By.tagName("th"));
		
		System.out.println("Column Header -- ");
		/*for(int i = 0;i< colHeader.size();i++)
		{
			//String sHeader = driver.findElement(By.xpath(xpath_header_start+i+xpath_header_end)).getText();
			
			
			if(colHeader.get(i).getText().equals("ACCOUNTING CODE"))
			{
				System.out.println("Column Index -- "+ i);
				
				WebElement sCheckBox = driver.findElement(By.xpath(xpath_checkbox_start+i+xpath_checkbox_end));
				sCheckBox.click();
				
				 break;
						
				
			}
			
		}*/
		
		
		for(int i = 0;i< rows.size();i++)
		{
			System.out.println(rows.get(i).getText());
			if(rows.get(i).getText().contains("AccCode0107"))
			{
				System.out.println("Row Index -- "+ i);
				
				WebElement sCheckBox = driver.findElement(By.xpath(xpath_checkbox_start+(i+1)+xpath_checkbox_end));
				sCheckBox.click();
				
				 break;
						
				
			}
			
		}
		
		
		
		

	}

}
