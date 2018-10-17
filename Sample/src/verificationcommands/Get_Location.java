package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) 
	{
		//Method return selected element x and y coordinates at webpage

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//click on triptype multiciy tab selection.
		WebElement Multicity=driver.findElement(By.xpath("//label[text()='multi-city']"));
		
		
		//get Location
		Point Obj_point=Multicity.getLocation();
		//Get object x and y coorindates
		int obj_x=Obj_point.getX();
		int obj_y=Obj_point.getY();
		
		
		System.out.println("obj x coordinates are "+obj_x);
		System.out.println("Obj y coordinates are "+obj_y);
		
		
		//Verify object visible at webpage using object x and y coordinates
		if(obj_x > 0)
		{
			System.out.println("Object visible at webpage");
		}
		else
		{
			System.out.println("object invisible at webpage");
		}
		
		
		
	}

}
