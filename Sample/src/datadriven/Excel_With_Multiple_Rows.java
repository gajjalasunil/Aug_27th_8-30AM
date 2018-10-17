package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_With_Multiple_Rows 
{

	public static void main(String[] args) throws IOException 
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
		
		for (int i = 5; i <= Rcount; i++) 
		{
			//Target Dynamic row
			XSSFRow row=sht.getRow(i);
			
			//Get cell values from Dynamic Row
			String username=row.getCell(0).getStringCellValue();
			String password=row.getCell(1).getStringCellValue();
			
			System.out.println(username+"    "+password);
		}
		
		
		
		//Target row    [Get numer of cells data available]
		int Cell_count=sht.getRow(1).getLastCellNum();
		for (int j = 0; j < Cell_count; j++) 
		{
			System.out.println(sht.getRow(1).getCell(j));
		}
		

	}

}
