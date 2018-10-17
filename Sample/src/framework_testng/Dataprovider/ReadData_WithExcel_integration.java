package framework_testng.Dataprovider;

import org.testng.annotations.Test;

import framework_testng.DPexcel_integration.Excel_To_DP;

public class ReadData_WithExcel_integration 
{

	@Test(dataProvider="Read_Excel",dataProviderClass=Excel_To_DP.class)
	public void testlogin(String uid, String pwd)
	{
		System.out.println(uid+"    "+pwd);
	}
	
}
