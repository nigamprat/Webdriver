package Learning_TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExample

{
	
	@Test(dataProvider="testdata")
	public void setData(String userName , String password)
	{
		System.out.println("UserName Provided......"+userName);
		System.out.println("Password Provided......"+password);
	}
	
	@DataProvider(name = "testdata")
	public Object[][] getData()
	{
	
		Object[][] data =  new Object[3][2];
		//1st Row
		data[0][0] = "sampleuser1";
		data[0][1] = "passuser1";
		
		//2nd Row
		data[1][0] = "sampleuser2";
		data[1][1] = "passuser2";
			
		//3rd Row
		data[2][0] = "sampleuser3";
		data[2][1] = "passuser3";
		
		return data;
	
	}
		


}
