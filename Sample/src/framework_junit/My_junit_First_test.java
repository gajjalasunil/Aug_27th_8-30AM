package framework_junit;

import org.junit.Ignore;
import org.junit.Test;

public class My_junit_First_test 
{

	@Test //Annotation
	public void test() 
	{
		System.out.println("test executed");
	}
	
	@Test  //Annotation  run java method
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	
	@Ignore  //Annotation ignore method execution
	public void test2() 
	{
		System.out.println("test2 executed");
	}
	


}
