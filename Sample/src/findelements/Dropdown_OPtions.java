package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_OPtions {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/credit-card/Index.aspx?");
		driver.manage().window().maximize();
		
		
		//Identify Dropdown location
		WebElement Employee_type=driver.findElement(By.id("ddlEmpType"));
		
		//Identify Group options under selected dropdown
		List<WebElement> All_options=Employee_type.findElements(By.tagName("option"));
		//Get size of Dropdown options
		int Dcount=All_options.size();
		System.out.println("Dropdown Option Count is  => "+Dcount);
		
		//Iterate fo expected Dropdown options
		for (int i = 0; i < Dcount; i++) 
		{
			  //Target Each option at dropdown
			WebElement Eachoption=All_options.get(i);
			//Get Eachoption name
			String option_name=Eachoption.getText();
			//click Each option
			Eachoption.click();
			Thread.sleep(2000);
			
			//Identify company Editbox
			WebElement Company_eb=driver.findElement(By.id("txtCompany"));
			
			//Verify Company Editbox visible/hidden status
			if(Company_eb.isDisplayed())
			{
				System.out.println("Visible at option => "+option_name);
			}
			else
			{
				System.out.println("Hidden at option => "+option_name);
			}
			
		}
		

	}

}
