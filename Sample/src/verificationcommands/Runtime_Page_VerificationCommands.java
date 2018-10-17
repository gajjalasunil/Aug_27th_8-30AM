package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Page_VerificationCommands 
{

	public static void main(String[] args)
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
	
		 //get Runtime page title
		String Runtime_title=driver.getTitle();
		System.out.println("Page title is --> "+Runtime_title);
		
		//Get Runtime page url
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("page url is ---> "+Runtime_url);
		
		//Get Runtime Pagesource
		String Runtime_source=driver.getPageSource();
		//System.out.println(Runtime_source);
		
		
		//Get Current Window ID
		String Window_dynamicID=driver.getWindowHandle();
		System.out.println(Window_dynamicID);
		
		
		
		

	}

}
