package Reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReport {
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	@Test
	public void StartReport() throws IOException {
	 extent = new ExtentReports();
	 spark = new ExtentSparkReporter(".\\target\\Report.html");
	extent.attachReporter(spark);
	
	//extent.createTest("Test 1");
	
	Desktop.getDesktop().browse(new File(".\\target\\Report.html").toURI());
	
}
}
