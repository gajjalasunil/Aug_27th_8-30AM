package globalvariable.Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Global_locators {

	public static void main(String[] args) 
	{
		
		//Create object Global locators
		Global_locators obj=new Global_locators();
		
		//Assign browser at runtime
		obj.driver=new ChromeDriver();
		
		//load webpage
		String Appurl=obj.url="http://facebook.com";
		obj.driver.get(Appurl);
		
		//Call user login
		obj.uid="Qadarshan@gmail.com";
		obj.pwd="Hello12345";
		obj.User_signin();
		
		
		//Verify Usenrame Visibility
		boolean flag=obj.Uid_element.isDisplayed();
		System.out.println("Element visible status --> "+flag);
		
		
		

	}

}
