package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) 
	{
		//Method return selected element height and width
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//click on triptype multiciy tab selection.
		WebElement Multicity=driver.findElement(By.xpath("//label[text()='multi-city']"));
		
		//Get element Dimensions at runtime
		Dimension obj_dim=Multicity.getSize();

		//Get object runtime height and width
		int obj_height=obj_dim.getHeight();
		int obj_width=obj_dim.getWidth();
		
		System.out.println("obj height is  ==> "+obj_height);
		System.out.println("obj width is  ==> "+obj_width);
		
		//verify object visible at runtime
		if(obj_height > 0)
		{
			System.out.println("object visible at webpage");
		}
		else
		{
			System.out.println("object hidden at webpage");
		}
		
	}

}
