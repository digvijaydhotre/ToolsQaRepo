package ToolsQATestcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Profilepage;
import Pages.loginPage;
import TestBase.testcBase;

public class profileTestCase extends testcBase{
	Profilepage profilePg;
	
	loginPage loginpg;
 public static String userlname="Digvijaydhotre";

 
	@BeforeClass
	public void setup() {
	initialize();
	loginpg=new loginPage();
	loginpg.cardItem();
	loginpg.mainLoginBtn();
	loginpg.userName("Digvijaydhotre");
	loginpg.password("Dig@1234");
	loginpg.LoginButton();
	profilePg = new Profilepage();
	
	}
	@Test
	
	public void proFileuser() throws InterruptedException 
	{
		
		
		Thread.sleep(5000);
		 assertEquals(profilePg.userNamevalue(), userlname);

	}

	@AfterClass
	public void Quitbroswer()
	{
		driver.quit();
	}

}