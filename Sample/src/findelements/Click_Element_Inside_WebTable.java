package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Element_Inside_WebTable 
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
		
		boolean flag=false;
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
						
						
						if(CellData.equals("TATMOT"))
						{
							flag=true;
							//click Inside cell on Expected row
							cells.get(7).click();
							break;  //Stop iteration on cells
						}
				
				
						}//cells
			
			if(flag==true)
			{
				break;  //Stop iteration for rows
			}
			
		}//row
		
		System.out.println("Record available status => "+flag);

	}

}
