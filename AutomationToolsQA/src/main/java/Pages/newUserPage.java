package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newUserPage extends loginPage {
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
	WebElement cardItem;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]")
	WebElement mainLogin;
	
	@FindBy(xpath="//button[@id='newUser']")
	WebElement newuser;
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstName;

	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"userName\"]")
	WebElement userName;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]")
	
	WebElement captcha;
	
	@FindBy(xpath="//*[@id=\"register\"]")
	WebElement register;

public newUserPage() {
	PageFactory.initElements(driver, this);
}

public void cardItem() {
	cardItem.click();
}

public void mainLoginBtn() {
	mainLogin.click();
}

public void newUser() {
	newuser.click();
}

public void firstname(String fName) {
	firstName.sendKeys(fName);
}

public void lastname(String lName) {
	lastName.sendKeys(lName);
}

public void username(String uName) {
	userName.sendKeys(uName);
}

public void pass() {
	password.click();
}

public void Captch() {
	captcha.click();
}

public void registerButton() {
	register.click();
}



}