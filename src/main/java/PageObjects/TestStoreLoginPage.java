package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestStoreLoginPage {

	
	WebDriver driver;
	
	public TestStoreLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement login;
	
	@FindBy(xpath="//h1[@class='post-title']")
	WebElement success_msg;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement Logout;
	
	public void EnterUserName(String Username) {
		username.sendKeys(Username);
	}
	
	
	public void EnterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	
	public void Login(){
		login.click();
	}
	
	public String SuccessfulLogin(){
	
		return success_msg.getText();
	}
	
	public void Logout() {
		Logout.click();
	}
	
}
