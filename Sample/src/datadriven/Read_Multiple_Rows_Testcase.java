package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Multiple_Rows_Testcase 
{

	public static void main(String[] args) throws IOException, Exception 
	{
		//Target file location
				String path="TestData\\InputData.xlsx";
				FileInputStream fi=new FileInputStream(path);
				XSSFWorkbook book=new XSSFWorkbook(fi);
				System.out.println("File and workbook located");
							
				//Target sheet and row
				XSSFSheet sht=book.getSheet("Sheet3");
				
				
				//Get row count
				int Rcount=sht.getLastRowNum();
				System.out.println("Number or rows data available "+Rcount);
				
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				
				for (int i = 5; i <= Rcount; i++) 
				{
					//Target Dynamic row
					XSSFRow row=sht.getRow(i);
					
					//Get cell values from Dynamic Row
					String username=row.getCell(0).getStringCellValue();
					String password=row.getCell(1).getStringCellValue();
					
					System.out.println(username+"    "+password);
					
					
					String url=sht.getRow(0).getCell(1).getStringCellValue();
					driver.get(url);
					
					String email_locator=sht.getRow(1).getCell(1).getStringCellValue();
					driver.findElement(By.xpath(email_locator)).clear();
					driver.findElement(By.xpath(email_locator)).sendKeys(username);
					
					String password_locator=sht.getRow(2).getCell(1).getStringCellValue();
					driver.findElement(By.xpath(password_locator)).clear();
					driver.findElement(By.xpath(password_locator)).sendKeys(password);
					
					String signin_btn_locator=sht.getRow(3).getCell(1).getStringCellValue();
					driver.findElement(By.xpath(signin_btn_locator)).click();
					Thread.sleep(3000);
					
					
				}
				

	}

}
