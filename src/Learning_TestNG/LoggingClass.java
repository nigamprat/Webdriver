package Learning_TestNG;

import org.testng.annotations.Test;

public class LoggingClass 
{
	@Test(priority = 0)
	public void methodAddingNumber()
	{
		System.out.println("Hello...I am in method adding number");
		
	}
	@Test(priority = 1)
	public void dividedByZero()
	{
		System.out.println("Hello...I am in method dividebyZero number");
		int e = 1/0;
	}
	@Test(dependsOnMethods = {"dividedByZero"} )
	public void methodskip()
	{
		System.out.println("Hello...I am in method skip");
	}
}
