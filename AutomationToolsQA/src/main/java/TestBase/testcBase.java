package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class testcBase {
	public static WebDriver driver;

	public testcBase() {
		System.setProperty("webdriver.chrome.driver","E:\\Jar Files\\chromedriver\\chromedriver.exe");

	}

	public static void initialize() {
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}


}
