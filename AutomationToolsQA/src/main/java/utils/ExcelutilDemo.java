package utils;

import java.io.IOException;

public class ExcelutilDemo {
	
	
	
	
	public static void main(String[] args) throws IOException
	{
		String projectpath =System.getProperty("user.dir");
		Excelutils excel = new Excelutils("E:\\ToolsQaRepo\\AutomationToolsQA\\Util\\inputfile.xlsx", "Sheet1");
		
		excel.getcellDataNumber(1,1);
		excel.getcellDataString(0,0);
	}

}
