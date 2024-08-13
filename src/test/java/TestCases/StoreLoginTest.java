package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;

import PageObjects.TestStoreLoginPage;
public class StoreLoginTest extends Base {
	

	
	public StoreLoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void setup() throws InterruptedException {
		
		driver=initialization();
		String url=prop.getProperty("url");
		System.out.println("url is :" +url);
		Thread.sleep(2000);
		driver.get(url);
		TestStoreLoginPage lgnpg = new TestStoreLoginPage(driver);
		lgnpg.EnterUserName(prop.getProperty("username"));
		lgnpg.EnterPassword(prop.getProperty("password"));
		lgnpg.Login();
		String msg=lgnpg.SuccessfulLogin();
		Assert.assertEquals(msg, "Logged In Successfully");
		lgnpg.Logout();
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	
}
