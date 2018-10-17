package org.java;

public class Run_Methods_From_diffClass 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Static methods to call from diff class.
		 * 		classname.methodname();
		 */
		StaticMethods.method1();
		StaticMethods.method2();
		StaticMethods.method3();
		
		
		/*
		 * Non-static methods to call from diff class
		 * 			classname obj=new classname();
		 * 			obj.methodname();
		 */
		SmartPhone obj=new SmartPhone();
		obj.touch();
		obj.calucalator();
		obj.wifi();
	}

}
