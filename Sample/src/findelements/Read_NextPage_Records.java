package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_NextPage_Records 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//click link to get webtable
		driver.findElement(By.linkText("Nifty Weightage")).click();
		Thread.sleep(5000);
		
		
		//Identify table
		WebElement table=driver.findElement(By.id("gridSource"));
		
		//Get list of rows available in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		int icount=0;
		//Iterate for expected rows
		for (int i = 0; i < rows.size(); i++) 
		{
			//Target Dynamic row
			String rowtext=rows.get(i).getText();
			System.out.println("=> "+rowtext);
			
			if(icount==20)
			{
				driver.findElement(By.xpath("/html/body/form[1]/div[4]/div[1]/div[2]/div/div/div/form/div[4]/form/div[3]/div/div/div/table/tfoot/tr/th[3]")).click();
				icount=0;
			}
		
			icount=icount+1;
		}

	}

}
