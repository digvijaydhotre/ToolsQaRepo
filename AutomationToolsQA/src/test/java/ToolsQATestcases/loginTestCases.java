package ToolsQATestcases;	


import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.*;
import Pages.loginPage;
import TestBase.testcBase;

public class loginTestCases extends testcBase{
	loginPage loginpg;
	static String loginpageerrormsg="Invalid username or password!";
	
	@BeforeClass
	public void setUp() {
		initialize();
		loginpg = new loginPage();
	}
	
@Test
	public void userInfo() throws InterruptedException, IOException {
		loginpg.cardItem();
		loginpg.mainLoginBtn();
		loginpg.userName("Digvijaydhotre");
		loginpg.password("Dig@12345");
		loginpg.LoginButton();
		Thread.sleep(2000);
		assertEquals(loginpg.errorText(),loginpageerrormsg);

		File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("D:\\ToolsQA.png"));
		
		driver.close();
		
	}

}
