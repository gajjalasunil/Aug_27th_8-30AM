package framework_junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Before_And_AfterClass {

	
	@Test
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	

	@Test
	public void test2() 
	{
		System.out.println("test2 executed");
	}
	
	
	

	@Test
	public void test3() 
	{
		System.out.println("test3 executed");
	}
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("After class");
	}


}
