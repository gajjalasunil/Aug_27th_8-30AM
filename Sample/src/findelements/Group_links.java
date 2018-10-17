package findelements;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Identify location
		WebElement Navigation_footer;
		Navigation_footer=driver.findElement(By.className("uxKLF"));
		
		//Idnetify links at navigation footer
		List<WebElement> Nav_links;
		Nav_links=Navigation_footer.findElements(By.tagName("a"));
		
		//Get Count of navigation links
		int links_count=Nav_links.size();
		System.out.println("list of navigation links  => "+links_count);
		
		//Iterate for expected links
		for (int i = 0; i < links_count; i++) 
		{
			//Target each link
			WebElement Eachlink=Nav_links.get(i);
			//Get Linkname and href property at runtime
			String linkname=Eachlink.getText();
			String linkhref=Eachlink.getAttribute("href");
			System.out.println(linkname+"    "+linkhref);
			
			//Click Each link
			Eachlink.click();
			Thread.sleep(2000);
			
					
					//Create simple date format
					DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
					//Get System Default date
					Date d=new Date();  //import java.util
					//using date foramt convert system default date
					String time=df.format(d);
					
					
					File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(src, new File("screens\\nav_links"+time+linkname+"\\.png"));
					
					
			
			
			
			//navigation to homepage
			driver.navigate().back();
			
			//Restore all links to avoid  "StaleElementReferralException"
			Navigation_footer=driver.findElement(By.className("uxKLF"));
			Nav_links=Navigation_footer.findElements(By.tagName("a"));
		}
		
	}

}
