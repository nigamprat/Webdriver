package Learning_TestNG;
import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class LisnerClass extends TestListenerAdapter
{
	@Override
	public void onTestStart(ITestResult tr)
	{
		log("Test Started...");
	}
	
	@Override
	public void onTestSuccess(ITestResult tr)
	{
		log("Test  "+tr.getName()+"  Passed");
		log(tr.getTestClass());
		log("Priority of the method" + tr.getMethod().getPriority());
		System.out.println("................");
	}
	
	@Override
	public void onTestFailure(ITestResult tr)
	{
		log("Test  "+tr.getName()+"  Failed");
		log(tr.getTestClass());
		log("Priority of the method" + tr.getMethod().getPriority());
		System.out.println("................");
	}
	
	@Override
	public void onTestSkipped(ITestResult tr)
	{
		log("Test  "+tr.getName()+"  Skipped");
		System.out.println("................");
	}
	
	
	public void log(String methodName)
	{
		System.out.println(methodName);
	}
	
	public void log(IClass testClass)
	{
		System.out.println(testClass);
	}
}
