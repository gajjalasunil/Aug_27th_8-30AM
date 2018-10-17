package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagname {

	public static void main(String[] args)
	{
		//Method return selected element height and width
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
				
		//click on triptype multiciy tab selection.
		WebElement Multicity=driver.findElement(By.xpath("//label[text()='multi-city']"));
				
		//Get method runtime tagname
		String runtime_tagname=Multicity.getTagName();
		System.out.println("Runtime tagname is ==> "+runtime_tagname);
	}

}
