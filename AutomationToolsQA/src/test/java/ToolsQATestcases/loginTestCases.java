package ToolsQATestcases;

import static org.testng.Assert.assertEquals;

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
	public void userInfo() throws InterruptedException {
		loginpg.cardItem();
		loginpg.mainLoginBtn();
		loginpg.userName("Akshay");
		loginpg.password("test");
		loginpg.LoginButton();
		Thread.sleep(2000);
		assertEquals(loginpg.errorText(), "Invalid username or password!");
	}

}
