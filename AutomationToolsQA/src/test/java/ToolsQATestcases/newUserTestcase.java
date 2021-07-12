package ToolsQATestcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.loginPage;
import Pages.newUserPage;
import TestBase.testcBase;

public class newUserTestcase extends testcBase {
	newUserPage newUserpg;
	

	
	@BeforeClass
	public void setUp() {
		initialize();
		newUserpg= new newUserPage();
	}
	
	@Test
	public void userInfo() throws InterruptedException {
		newUserpg.cardItem();
		
		newUserpg.mainLoginBtn();
		Thread.sleep(2000);
		newUserpg.newUser();
		newUserpg.firstname("Digvijay");
		newUserpg.lastname("Dhotre123");
		newUserpg.userName("Dhotdi");
		newUserpg.password("Test@1234");
		Thread.sleep(2000);
		newUserpg.Captch();
		newUserpg.registerButton();
	
		
		

	}

}
