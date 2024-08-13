package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static  WebDriver driver;
	public static Properties prop;
	
	public Base() throws IOException {
		
		 prop = new Properties();
		 FileInputStream ip = new FileInputStream("C:\\Users\\MITUL\\eclipse-workspace\\selenium\\POM_TUTORIALS\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(ip);
	}
	
	
	
	public WebDriver initialization() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
			
		} else if (browsername.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			 driver =new EdgeDriver();
		
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		return driver;
}
}

