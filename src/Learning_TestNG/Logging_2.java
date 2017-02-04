package Learning_TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Logging_2 
{
	@Test(priority =0)
	public void Test_LoginToOrderExpress()
	{
		System.out.println("Successfull Login");
	}
	
	@Test(dependsOnMethods={"Test_LoginToOrderExpress"})
	public void Test_SelectAccount()
	{
		System.out.println("Account Selected");
	}
	
	@Test(dataProvider="productids")
	public void Test_SearchProduct(String searchKeyword)
	{
		System.out.println("Search Keyword"+searchKeyword);
		System.out.println("............");
		
	}
	
	//Data Provider	
	@DataProvider
	public Object[] productids()
	{
		Object data[] = new Object[2];
		//1st Row
		data[0]= "water";
		data[1] = "cocain";
		return data;
	}
	
	
}
