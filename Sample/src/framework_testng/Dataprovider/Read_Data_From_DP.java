package framework_testng.Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Read_Data_From_DP 
{
	
	
	@Test(dataProvider="login_data",enabled=false)
	public void user_login(String uid,String pwd)
	{
		System.out.println(uid+"  "+pwd);
		
	}
	
	
	
	@Test(dataProvider="reg_data")
	public void user_reg(String fname, String email, String mobile, String pwd)
	{
		System.out.println(fname+"   "+email+"    "+mobile+"     "+pwd);
	}
	
	
	
	@DataProvider
	public static String[][] login_data()
	{
		String data[][]=new String [3][2];
		
		//1st row data
		data[0][0]="user1";
		data[0][1]="pwd1";
		
		//2nd row data
		data[1][0]="user2";
		data[1][1]="pwd2";
		
		//3rd row data
		data[2][0]="user3";
		data[2][1]="pwd3";
		
		return data;
	}
	
	
	
	@DataProvider
	public static String[][] reg_data()
	{
		 String data[][]=
			 {
					 {"arun","arun@gmail.com","903024114","newpwd1"},
					 {"vasu","vasu@gmail.com","903024115","newpwd2"},
					 {"hari","hari@gmail.com","903024116","newpwd3"},
			 };
		 
		 return data;
	}
	
	

}
