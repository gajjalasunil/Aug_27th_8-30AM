package switchcommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Multiple_Windows 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Switch to main window
		String mainwindow=driver.getWindowHandle();
		
		System.out.println("main window Dynamic id => "+driver.getWindowHandle());
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All Window Dynamic ID's
		Set<String> Allwindows=driver.getWindowHandles();
		
		//Iterate for number of windows
		for (String eachwindow : Allwindows) 
		{
			driver.switchTo().window(eachwindow);
			//Capture Runtime title
			String Runtime_title=driver.getTitle();
			System.out.println(Runtime_title);
			
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break;  //Break loop iteration
			}
		}
		
		
		if(driver.getTitle().contains("Cancel Train Bookings"))
		{
			//handle Sub window Controls
		}
		
		

	}

}
