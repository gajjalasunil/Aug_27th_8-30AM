package method_parameters;

public class Local_Parameters
{
	
	public void print_tool()
	{
		String name="selenium-webdriver";
		System.out.println(name);
	}

	public void print_tool(String toolname)
	{
		String name="selenium-"+toolname;
		System.out.println(name);
	}
	
	public void print_tool(String toolname, double price)
	{
		String name="selenium-"+toolname;
		System.out.println(name+"  Price is => "+price);
	}
	
	public void print_tool(double price, String toolname)
	{
		String name="selenium-"+toolname;
		System.out.println(name+"  Price is => "+price);
	}
	
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("total value is  => "+c);
	}
	


	public static void main(String[] args) 
	{
		//Calling method without arguments
		Local_Parameters obj=new Local_Parameters();
		obj.print_tool();
		
		//Calling with single argument
		obj.print_tool("Remote Control");
		obj.print_tool("IDE");
		
		//Calling with multiple arguments
		obj.print_tool("IDE", 1000.00);
		obj.print_tool(1000.00, "Grid");
		
	}

}
