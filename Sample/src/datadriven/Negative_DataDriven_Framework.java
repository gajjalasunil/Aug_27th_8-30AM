package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Negative_DataDriven_Framework 
{

	public static void main(String[] args) throws Exception
	{
		
		
		//Target file location
		String path="TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("File and workbook located");
									
		//Target sheet and row
		XSSFSheet sht=book.getSheet("Sheet5");
						
						
		//Get row count
		int Rcount=sht.getLastRowNum();
		System.out.println("Number or rows data available "+Rcount);
		
		//launch browser and load webpage
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		for (int i = 6; i <=Rcount; i++)
		{
			
			//Get Execution status
			String Exe_status=sht.getRow(i).getCell(6).getStringCellValue();
			if(Exe_status.equalsIgnoreCase("y"))
			{
				
				//Get Testcasename
				String Testcase=sht.getRow(i).getCell(0).getStringCellValue();
				System.out.println("Execution for => "+Testcase);
				
				//load webpage
				driver.get("http://outlook.com");
				
				
				//Get Signin button
				String Signin_btn=sht.getRow(6).getCell(1).getStringCellValue();
				driver.findElement(By.xpath(Signin_btn)).click();
				
				//Identify email location and Enter email_input
				String email_input=sht.getRow(i).getCell(3).getStringCellValue();
				String email_locator=sht.getRow(6).getCell(2).getStringCellValue();
				
				driver.findElement(By.xpath(email_locator)).clear();
				driver.findElement(By.xpath(email_locator)).sendKeys(email_input);
				
				//get Next button locator
				String next_btn_locator=sht.getRow(6).getCell(4).getStringCellValue();
				driver.findElement(By.xpath(next_btn_locator)).click();
				Thread.sleep(5000);
				
				//Get Scenario type
				String Stype=sht.getRow(i).getCell(7).getStringCellValue();
				//Get Expected Result
				String Exp_result=sht.getRow(i).getCell(5).getStringCellValue();
				
				if(Stype.equalsIgnoreCase("text"))
				{
					String page_visibleText=driver.findElement(By.tagName("body")).getText();
					if(page_visibleText.contains(Exp_result))
					{
						System.out.println(Testcase+"  Testpass");
						sht.getRow(i).createCell(8).setCellValue("TestPass");
					}
					else
					{
						System.out.println(Testcase+"  Testfail");
						sht.getRow(i).createCell(8).setCellValue("TestFail");
					}
					
				}
				else if(Stype.equalsIgnoreCase("object"))
				{
					boolean flag=driver.findElement(By.id(Exp_result)).isDisplayed();
					if(flag==true)
					{
						System.out.println(Testcase+"  Testpass");
						sht.getRow(i).createCell(8).setCellValue("TestPass");
					}
					else
					{
						System.out.println(Testcase+"  Testfail");
						sht.getRow(i).createCell(8).setCellValue("Testfail");
					}
					
					
				}
				
			}
			
			
		}//for
		
		
		book.write(new FileOutputStream("TestData\\Neg_op.xls"));
		book.close();
		
		
		
		

	}

}
