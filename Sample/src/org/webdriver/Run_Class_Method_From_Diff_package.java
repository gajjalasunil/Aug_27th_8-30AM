package org.webdriver;

import org.java.SmartPhone;

public class Run_Class_Method_From_Diff_package {

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> To use other package methods we must
		 * 	import referrals first.
		 * 		Syntax for import referrals in diff package:-->
		 * 		
		 * 		import packagename.classname;
		 * 		import packagename.*;
		 */
		SmartPhone obj=new SmartPhone();
		obj.calucalator();
		obj.wifi();
	}

}
