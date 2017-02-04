package Learing_TestNG_paramerterization;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class TestParameters 
{
	@Parameters({"browser"})
	@Test
	public void testcaseone(String browser)
	{
		System.out.println("Browser passed as...."+browser);
	}

	@Parameters({"userName","password"})
	@Test
	public void testcasetwo(String username,String password)
	{
		System.out.println("Parameter used for user name..."+username);
		System.out.println("Parameter used for password..."+password);
	}
}
