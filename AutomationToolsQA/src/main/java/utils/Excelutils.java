package utils;

import java.io.IOException;

import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public Excelutils(String excelPath, String sheetName) throws IOException 
	{
		try
		{

			workbook = new XSSFWorkbook(excelPath); 
			//File input := "E:\\ToolsQaRepo\\AutomationToolsQA\\Util\\inputfile.xlsx" "Sheet1"
			sheet= workbook.getSheet(sheetName);
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException
	{

		getcellDataString(0,0);
		getcellDataNumber(1,1);
	}

	public static int getRowCount()
	{
		int rowcount=0;
		try {
			rowcount= sheet.getPhysicalNumberOfRows();

			//System.out.println("No. of rows in file:="+rowcount );
			
		}catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		}return rowcount;							
		
	}

	public static int getColCount()
	{
		int colCount =0;
		try {
 
			colCount= sheet.getRow(0).getPhysicalNumberOfCells();

		//	System.out.println("No. of columns in file:="+colCount );
			
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		}return colCount;
		
	}	
	public static String getcellDataString(int rowNum, int colNum) throws IOException {
		String celldata=null;
		
     try {
		 celldata= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		// System.out.println(celldata);
     }
     
     catch(Exception exp)
     {
    	 System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
     }
		return celldata;
		

	}

	public static void getcellDataNumber(int rowNum , int colNum) throws IOException {

		
		double celldata= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

		System.out.println(celldata);


		int rowcount= sheet.getPhysicalNumberOfRows();

		System.out.println("No. of rows in file:="+rowcount );

	}
}
