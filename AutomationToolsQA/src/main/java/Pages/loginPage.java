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
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
	WebElement bookstrapp;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]")
	WebElement loginbuttn;
	
	
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
	
	public void bookStorApp()
	{
		bookstrapp.click();
	}
	
	public void loginbuttn() {
		loginbuttn.click();
	}
}
