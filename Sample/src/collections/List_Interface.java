package collections;


import java.util.ArrayList;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) 
	{
		
		
		/*
		 * List:--> is a inorder collection of obejct. Allow
		 * 			duplicates.
		 */
		
		List<String> list=new ArrayList<String>();
		list.add("IDE");
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("GIT");
		list.add("IDE");
		
		System.out.println("size of object is ==> "+list.size());
		
		/*
		 * get:--> Method acces object using index number
		 */
		String toolname=list.get(2);
		System.out.println("2nd order object is  => "+toolname);
		
		
		/*
		 * foreach:--> This loop iterate array next values
		 */
		
		for (String tool : list) 
		{
			System.out.println(tool);
		}
		
		
	}

}
