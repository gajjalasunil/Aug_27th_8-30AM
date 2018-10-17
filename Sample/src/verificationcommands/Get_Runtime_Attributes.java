package verificationcommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attributes 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Testcase:--> Verify during roundtrip flight search
		 * 		functionality Addcity button visibility at multicity
		 * 		tab selection.
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//click on triptype multiciy tab selection.
		WebElement Multicity=driver.findElement(By.xpath("//label[text()='multi-city']"));
		Multicity.click();
		
		//Verify multicity selection at runtime..
		String Runtime_class=Multicity.getAttribute("class");

		
		//Write condition to accept on Milticity selection
		if(Runtime_class.contains("flight-trip-type"))
		{
			System.out.println("Multicity selected");
			
			//Thread.sleep(10000);
			
			//Verify Add button visibility at webpage
			WebElement Add_City_btn=driver.findElement(By.id("addModifyBtn"));
			if(Add_City_btn.isDisplayed())
			{
				System.out.println("Element  visible at webpage");
			}
			else
			{
				System.out.println("element not visible at webpage");
			}
			
			
		}
		else
		{
			System.out.println("Multicity not selected");
		}
		

	}

}
