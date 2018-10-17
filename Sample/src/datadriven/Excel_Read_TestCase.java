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

public class Excel_Read_TestCase {

	public static void main(String[] args) throws IOException 
	{
			
		//Target file location
		String path="TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("File and workbook located");
		
		
		//Target sheet and row
		XSSFSheet sht=book.getSheet("Sheet2");
		//target row
		XSSFRow row=sht.getRow(1);
		
		//Get Cell Data
		String url=row.getCell(1).getStringCellValue();
		String Nav_signin_btn=row.getCell(2).getStringCellValue();
		String email_loc=row.getCell(3).getStringCellValue();
		String email=row.getCell(4).getStringCellValue();
		String next_btn_loc=row.getCell(5).getStringCellValue();
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(Nav_signin_btn)).click();
		
		driver.findElement(By.xpath(email_loc)).clear();
		driver.findElement(By.xpath(email_loc)).sendKeys(email);
		
		driver.findElement(By.xpath(next_btn_loc)).click();
		
		
		
		
	}

}
