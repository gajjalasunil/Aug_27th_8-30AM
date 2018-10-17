package waitcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedConditions_Without_Wait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		if(ExpectedConditions.titleContains("Facebook").apply(driver))
			System.out.println("title presented");
		else
			System.out.println("title not presented");
		
		
		//regular command
		if(driver.getTitle().contains("Facebook"))
			System.out.println("title verified");
		else
			System.out.println("title not verified");
		

	}

}
