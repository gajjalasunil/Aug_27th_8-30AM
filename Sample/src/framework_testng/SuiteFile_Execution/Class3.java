package framework_testng.SuiteFile_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 
{
	@Test(priority=6)
	public void tc007()
	{
		Reporter.log("tcoo7 executed");
	}
	
	@Test(priority=7)
	public void tc008()
	{
		Reporter.log("tcoo8 executed");
	}
	
	
	@Test(priority=8)
	public void tc009()
	{
		Reporter.log("tcoo9 executed");
	}
	
}
