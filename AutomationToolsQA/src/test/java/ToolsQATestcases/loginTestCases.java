package ToolsQATestcases;

import org.testng.annotations.*;
import Pages.loginPage;
import TestBase.testcBase;

public class loginTestCases extends testcBase{
	loginPage loginpg;
	
	@BeforeClass
	public void setUp() {
		initialize();
		loginpg = new loginPage();
	}
	
	@Test
	public void userInfo() {
		loginpg.userName("Akshay");
		loginpg.password("test");
		loginpg.LoginButton();
	}

}
