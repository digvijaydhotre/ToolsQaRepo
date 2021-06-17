package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.testcBase;

public class loginPage extends testcBase{
	
	@FindBy(xpath="//*[@id=\"userName\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	WebElement loginBtn;
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void userName(String userName) {
		username.sendKeys(userName);
	}
	
	public void password(String Password) {
		password.sendKeys(Password);
	}
	
	public void LoginButton() {
		loginBtn.click();
	}
	
}
