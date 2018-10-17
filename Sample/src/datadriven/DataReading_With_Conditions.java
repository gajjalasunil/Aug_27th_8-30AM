package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReading_With_Conditions 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		String path="TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("File and workbook located");
							
		//Target sheet and row
		XSSFSheet sht=book.getSheet("Sheet4");
				
				
		//Get row count
		int Rcount=sht.getLastRowNum();
		System.out.println("Number or rows data available "+Rcount);
				
		for (int i = 5; i <= Rcount; i++) 
		{
					//Target Dynamic row
					XSSFRow row=sht.getRow(i);
					
					String Exe_status=row.getCell(2).getStringCellValue();
					//conditon acceps only on execution status yes
					if(Exe_status.equalsIgnoreCase("y"))
					{
						//Get cell values from Dynamic Row
						String username=row.getCell(0).getStringCellValue();
						String password=row.getCell(1).getStringCellValue();
						
						System.out.println(username+"    "+password);
						
						
						//get scenario type
						String Stype=row.getCell(3).getStringCellValue();
						if(Stype.equalsIgnoreCase("p"))
						{
							System.out.println("Positive output captured");
						}
						else if(Stype.equalsIgnoreCase("n"))
						{
							System.out.println("negative output captured");
						}
						else if(Stype.equals("alert"))
						{
							System.out.println("alert captured");
						}
						
						
					}
					
				
					
		}
				
		
		

	}

}
