package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Row_With_Referral_name 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Identify table
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Find number of rows available in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			//Target Dynamic row
			WebElement DynamicRow=rows.get(i);
			
			//Get number of cells available at selected row
			List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
			
			//Iterate number of cells
			for (int j = 0; j < cells.size(); j++) 
			{
				
				//Target Each cell in Dynamic row
				WebElement EachCell=cells.get(j);
				String CellData=EachCell.getText();
				
				
				if(CellData.equals("WIPRO"))
				{
					System.out.println("row number is => "+i);
					System.out.println("cell number is => "+j);
					
					String HighPrice=cells.get(3).getText();
					System.out.println("Record High price is => "+HighPrice);
					
				}
				
				
			}
			
		}
		

	}

}
