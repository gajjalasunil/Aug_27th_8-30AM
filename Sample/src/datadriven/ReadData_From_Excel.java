package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_From_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		String path="TestData\\InputData.xlsx";
		//Target file location using input stream
		FileInputStream fi=new FileInputStream(path);
		System.out.println("file located successfull");
		
		//Get workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook access successfull");
		
		//target sheet using above book
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target row using above sheet
		XSSFRow row=sht.getRow(1);
		
		//Target Cell using above row
		String url=row.getCell(0).getStringCellValue();
		System.out.println("Application url is ==> "+url);
		
		
		//Target cell using above row
		String CustomerID=row.getCell(1).getStringCellValue();
		System.out.println("New Customer ID is ==> "+CustomerID);
		
		//Target Cell
		String mobile_num=row.getCell(3).getStringCellValue();
		System.out.println("mobile number is ==> "+mobile_num);
		
		
		
		

	}

}
