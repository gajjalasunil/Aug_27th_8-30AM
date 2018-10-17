package framework_testng.SuiteFile_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 
{
	
	@Test(priority=3)
	public void tc004()
	{
		Reporter.log("tcoo4 executed");
	}
	
	@Test(priority=4)
	public void tc005()
	{
		Reporter.log("tcoo5 executed");
	}
	
	
	@Test(priority=5)
	public void tc006()
	{
		Reporter.log("tcoo6 executed");
	}
 
}
