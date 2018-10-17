package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_MultipleDates {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Open Datapicker
		driver.findElement(By.id("dpt_date")).click();
		Thread.sleep(2000);
		
		
		for (int i = 0; i < 3; i++) 
		{
			//Identify Current Month table
			WebElement Current_month;
			Current_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Find List of clickable dates under current month
			List<WebElement> clickable_links;
			clickable_links=Current_month.findElements(By.tagName("a"));
			
			for (int j = 0; j < clickable_links.size(); j++) 
			{
				//Target each clickable link
				WebElement Eachlink=clickable_links.get(j);
				Eachlink.click();
				Thread.sleep(1000);
				
				
				//Click to open datapicker
				driver.findElement(By.className("cal_openLink")).click();
				Thread.sleep(1000);
				//Restore all links
				Current_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
				clickable_links=Current_month.findElements(By.tagName("a"));
			}//iloop
			
			
			//Identify next button
			driver.findElement(By.id("cal_showNextMonth")).click();
			Thread.sleep(2000);
		}
		
		
		
		
		
	}

}
