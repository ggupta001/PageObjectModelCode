package com.crm.qa.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class LoginPage extends Base {

		
	

		//PageFactory
		@FindBy(id="username")
		WebElement username;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(id="submit")
		WebElement loginbtn;
	

//initilization PageFactory
public LoginPage() throws IOException {
	PageFactory.initElements(driver, this);
}


public String LoginTitle() {
	return driver.getTitle();
}

public void Login(String un, String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginbtn.click();
	
}





}