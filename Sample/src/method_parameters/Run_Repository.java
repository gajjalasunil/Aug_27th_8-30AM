package method_parameters;

import org.openqa.selenium.By;

public class Run_Repository 
{

	public static void main(String[] args) 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.loadApp("http://facebook.com");
		obj.setTimeout(20);
		
		//Enter text into Editbox
		obj.Enter_textTo_eb("//input[@name='firstname']", "Arjun");
		obj.Enter_textTo_eb("//input[@name='lastname']", "Kumar");
		
		//Enter text into editbox using locator class
		obj.Enter_textTo_eb(By.name("reg_email__"), "Arjunkumar@gmail.com");
		obj.Enter_textTo_eb(By.xpath("//input[@aria-label='Re-enter email address']"), "Arjunkumar@gmail.com");
		obj.Enter_textTo_eb(By.name("reg_passwd__"), "Hello12345");
		
		//Select dropdown option using locator class
		obj.Select_dropdown(By.id("day"), "12");
		obj.Select_dropdown(By.id("month"), "Dec");
		obj.Select_dropdown(By.id("year"), "1992");
		
		//Select Radio button
		obj.Click_element(By.cssSelector("input[type='radio'][value='1']"));
		
		//Wait until element at clickable position
		obj.Wait_and_click(By.cssSelector("input[type='radio'][value='2']"));
		
		
		
		
	}

}
