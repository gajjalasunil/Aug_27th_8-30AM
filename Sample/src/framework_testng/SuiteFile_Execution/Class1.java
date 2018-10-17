package framework_testng.SuiteFile_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1
{
	@Test(priority=0)
	public void tc001()
	{
		Reporter.log("tcoo1 executed");
	}
	
	@Test(priority=1)
	public void tc002()
	{
		Reporter.log("tcoo2 executed");
	}
	
	
	@Test(priority=2)
	public void tc003()
	{
		Reporter.log("tcoo3 executed");
	}

}
