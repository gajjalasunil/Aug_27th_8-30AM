package method_parameters;

import org.openqa.selenium.By;

public class MouseHover_Action {

	public static void main(String[] args) throws Exception 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.loadApp("http://hdfcbank.com");
		obj.setTimeout(30);
		
		
		obj.MouseHover(By.linkText("Products"));
		
		obj.wait_for_Element_visible(By.linkText("Cards"));
		obj.MouseHover(By.linkText("Cards"));
		
		obj.wait_for_Element_visible(By.linkText("Credit Cards"));
		obj.Click_element(By.linkText("Credit Cards"));

	}

}
