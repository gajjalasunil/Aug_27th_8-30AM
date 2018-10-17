package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Read_TableData_From_SpecificRow_And_Cell 
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
		
		//Get Selected row
		WebElement SelectedRow=rows.get(7);
		
		//Get number of cells available at selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Get selected cell data
		String CompanyName=cells.get(0).getText();
		String Highprice=cells.get(3).getText();
		System.out.println(CompanyName+"    "+Highprice);
	}

}
