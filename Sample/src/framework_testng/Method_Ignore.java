package framework_testng;

import org.testng.annotations.Test;

public class Method_Ignore 
{
	
	@Test
	public void tc001()
	{
		
	}
	
	@Test(enabled=false)
	public void tc002()
	{
		
	}
	
	
	@Test
	public void tc003()
	{
		
	}

}
