package framework_testng.Dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Default_Dataprovider 
{
	@Test(dataProvider="dp")
	public void user_reg(String fname, String email, String mobile, String pwd)
	{
		System.out.println(fname+"   "+email+"    "+mobile+"     "+pwd);
	}
	

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] {
      new Object[] {"arun","arun@gmail.com","903024114","newpwd1"},
      new Object[] {"vasu","vasu@gmail.com","903024115","newpwd2"},
      new Object[] {"hari","hari@gmail.com","903024116","newpwd3"},
    };
  }
}
