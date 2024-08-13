package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends Base {
	LoginPage lgnpg;
	
	public LoginPageTest(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@BeforeTest
	public void SetUp() throws IOException {
		
		initialization();
		 lgnpg= new LoginPage();
		
	}
	
	@Test(priority=1)
	
	public void LoginPageTitleTest() {
		String title=lgnpg.LoginTitle();
		Assert.assertEquals(title, "Test Login | Practice Test Automation");
		
	}
	
	@Test (priority=2)
	public void LoginTest() {
		lgnpg.Login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	
	
	
	@AfterTest
	
	public void TearDown() {
		
		driver.quit();
	}

	

}
