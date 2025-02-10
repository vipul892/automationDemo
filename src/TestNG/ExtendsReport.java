package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendsReport {

	WebDriver driver;

	ExtentReports extent;

	@BeforeTest
	public void config() {
		// String filepath= "D:\\vipul\\selenium\\TestNG_Practices\\Report\\index.html";
		// File reportFile = new File(filepath);
		String reportFile = System.getProperty("user.dir") + "\\Report\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(reportFile);
		report.config().setReportName("Web Automation Result");
		report.config().setDocumentTitle("Test Result");

		extent = new ExtentReports();
		extent.attachReporter(report);

		extent.setSystemInfo("Tester", "vipul");

	}

	@Test
	public void launchApplication()
	{
		ExtentTest test =extent.createTest("launch");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		 test.info("Starting the test.");
	        // Perform your test actions...
	        test.pass("Test passed successfully.");
	        
	      test.fail("this test case is failed");
		extent.flush();
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
