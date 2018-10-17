package collections;

import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Set:--> Is a unorder collection of objects. Set
		 * 			avoid duplicate objects.
		 */
		 
		Set<String> set=new TreeSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("GIT");
		set.add("IDE");
		set.add("App");
		
		System.out.println("Size of objects => "+set.size());
		
		/*
		 * foreach:--> This loop iterate array next values.
		 */
		
		for (String tool : set) 
		{
			System.out.println(tool);
		}
		
		
	}

}
