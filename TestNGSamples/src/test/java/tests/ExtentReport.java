package tests;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	public ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeTest
	public void startReport() {
		
		extent = new ExtentReports (System.getProperty("user.dir") +"/Report/ExtentReport.html", true);
		
		extent 
				.addSystemInfo("Host Name", "Maveric")
				.addSystemInfo("Environment", "Automation Testing")
				.addSystemInfo("User Name", "Rafeek");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));  
	}
		
	
	@Test
	public void testMethod1() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());		
		System.out.println("Running testMethod1 in ExtendReport");	
		Assert.assertTrue(true);
		driver.close();
		
	}
	
		
	@Test
	public void testMethod2() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod2 in ExtendReport");
		Assert.assertTrue(true);
		driver.close();
	}
	
	@Test
	public void testMethod3() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod3 in ExtendReport");
		Assert.assertTrue(true);
		driver.close();
	}
	
	@Test
	public void testMethod4() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod4 in ExtendReport");		
		driver.close();
	}
	
	@Test
	public void testMethod5() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod5 in ExtendReport");		
		Assert.assertTrue(true);
		driver.close();
	}
	
	@Test
	public void testMethod6() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod6 in ExtendReport");		
		Assert.assertTrue(false);
		driver.close();
	}
	
	@AfterMethod
	public void getResult(ITestResult result){
	if(result.getStatus() == ITestResult.FAILURE){
	logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
	logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
	}else if(result.getStatus() == ITestResult.SKIP){
	logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	}
	// ending test
	//endTest(logger) : It ends the current test and prepares to create HTML report
	extent.endTest(logger);
	}

	@AfterTest
	public void endReport(){

	               extent.flush();              
	               extent.close();
	   }

}
