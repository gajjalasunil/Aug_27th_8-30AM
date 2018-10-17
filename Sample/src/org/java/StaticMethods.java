package org.java;

public class StaticMethods 
{
	public static void method1()
	{
		System.out.println("method1 executed");
	}
	
	public static void method2()
	{
		System.out.println("method2 executed");
	}
	
	public static void method3()
	{
		System.out.println("method3 executed");
	}

	public static void main(String[] args) 
	{
		//With in class static methods to call from main method
		method1();
		method2();
		method3();
	}

}
