package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.testcBase;
import ToolsQATestcases.loginTestCases;

public class Profilepage extends testcBase{
	
	@FindBy(xpath="//*[@id=\"userName-value\"]")
	WebElement userNamevalue;
	
	


public Profilepage() {
	PageFactory.initElements(driver, this);
}
public String userNamevalue() {
	String Uname = userNamevalue.getText() ;
	return Uname;
	
}



	

}