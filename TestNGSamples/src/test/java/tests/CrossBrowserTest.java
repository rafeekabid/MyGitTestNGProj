package tests;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CrossBrowserTest {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");		
			
			DesiredCapabilities cap = DesiredCapabilities.internetExplorer();			
			cap.setCapability("browserName", "internet explorer");
			cap.setCapability("ignoreProtectedModeSettings",1);
			cap.setCapability("nativeEvents","false");
			cap.setCapability("ignoreZoomSetting", true);
			cap.setCapability("requireWindowFocus","true");
			cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			driver = new InternetExplorerDriver(cap);
			driver.manage().window().maximize();
			
					}
		else if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
	}
	
	@Test
	public void CrossBrowserTestMethod() {
		driver.get("https://google.co.in");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("This is CrossBrowserTestMethod: ");
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
