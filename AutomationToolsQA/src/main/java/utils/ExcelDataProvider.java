package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.loginPage;
import TestBase.testcBase;

public class ExcelDataProvider extends testcBase {
	
	
	@BeforeClass
	public void setUp() {
		//initialize();
		System.setProperty("webdriver.chrome.driver","E:\\Jar Files\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		//loginpg = new loginPage();
	}
	
	@Test(dataProvider="test1data")
	public void test1(String Username,String Password) throws Exception {
		System.out.println(Username+" | "+Password);
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys(Username);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(3000);
	}
	
	@DataProvider(name="test1data")
	public  Object[][] getData() throws IOException {
		
		String excelPath="E:\\ToolsQaRepo\\AutomationToolsQA\\Util\\inputfile.xlsx"; 
		//File input := E:\ToolsQaRepo\AutomationToolsQA\Util\inputfile.xls
		//String sheetName= "Sheet1";
		Object data[][]=testData(excelPath, "Sheet1");
		return data;
		
	}
	
	
	
	public  Object[][] testData(String excelPath, String sheetName) throws IOException {
		
		Excelutils excel= new Excelutils(excelPath, sheetName);
		int rowCount= excel.getRowCount();
		int colCount=excel.getColCount();
		
		Object  data [][]= new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellData=excel.getcellDataString(i,j);
				//System.out.println(cellData+"" );
				
				data[i-1][j]=cellData;
			}
			//System.out.println();
	}
		return data;
	}
}
