package org.java;

public class SmartPhone 
{
	//public modifier give access to call from outside package
	public void touch()
	{
		System.out.println("touch working");
	}
	
	public void wifi()
	{
		System.out.println("wifi working");
	}
	
	public void calucalator()
	{
		touch();
		System.out.println("cal working");
	}
	
	
	public static void main(String[] args) 
	{
		/*
		 * Methods and variables to call from main method first
		 * we need to create object for class
		 */
		
		SmartPhone obj=new SmartPhone();
		obj.wifi();
		obj.touch();
		obj.calucalator();
		
	}

}
