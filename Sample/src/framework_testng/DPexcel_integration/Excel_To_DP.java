package framework_testng.DPexcel_integration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excel_To_DP {

	@DataProvider
	public static String[][]  Read_Excel() throws IOException
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\inputDP.xlsx");
		//Read workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//target sheet
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Get Row and cell count
		int Rcount=sht.getLastRowNum();
		int Ccount=sht.getRow(1).getLastCellNum();
		
		
		String data[][];
		data=new String[Rcount+1][Ccount];
		
		for (int i = 0; i <=Rcount; i++) 
		{
			
			//iterate for cells
			for (int j = 0; j < Ccount; j++) 
			{
				
				data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
				
		
			}
		}
		
		return data;
	}
	
	
	
}
