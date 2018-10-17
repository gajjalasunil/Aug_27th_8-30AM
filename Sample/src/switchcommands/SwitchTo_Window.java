package switchcommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Window 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/wholesale/default.htm");
		driver.manage().window().maximize();
		
		//Get Current window Dynamic ID
		String MainWindow=driver.getWindowHandle();
		System.out.println(MainWindow);
		
		//Identify Dropdown
		WebElement Dropdown=driver.findElement(By.id("accesspointsselect"));
		Select Select_brach=new Select(Dropdown);
		Select_brach.selectByVisibleText("Demat Centre");
		Thread.sleep(5000);
		
		
		//Collect All Window Dynamic ID's
		Thread.sleep(5000);
		Set<String> Allwindows=driver.getWindowHandles();
		
		//Iterate for multiple windows
		for (String eachwindow : Allwindows) 
		{
			driver.switchTo().window(eachwindow);
		}
		
		System.out.println("current window title --> "+driver.getTitle());
		
		
		//Select Dropdown at Subwindow
		WebElement State=driver.findElement(By.id("state"));
		new Select(State).selectByVisibleText("Delhi");
		
		
		//Get Controls back to mainwindow
		driver.switchTo().window(MainWindow);
		System.out.println("Current Window Title is --> "+driver.getTitle());
		
		
		
	}

	
}
