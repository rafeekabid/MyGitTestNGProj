package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupsandPriorityTest {

	@Test(groups= {"smoketest"}, priority = 6)
	public void testMethod1() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());		
		System.out.println("Running testMethod1");
		System.out.println("this is testMethod1 thread is"+ " " +Thread.currentThread().getId());
		driver.close();
	}
	
		
	@Test(groups= {"smoketest"}, priority = 5)
	public void testMethod2() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod2");
		System.out.println("this is testMethod2 thrad is"+ " " +Thread.currentThread().getId());
		driver.close();
	}
	
	@Test(groups = {"smoketest"}, priority = 4)
	public void testMethod3() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod3");
		System.out.println("this is testMethod3 thread is"+ " " +Thread.currentThread().getId());
		driver.close();
	}
	
	@Test(groups = {"functionaltest"}, priority=3)
	public void testMethod4() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod4");
		System.out.println("this is testMethod4 thread is"+ " " +Thread.currentThread().getId());
		driver.close();
	}
	
	@Test(groups= {"functionaltest"}, priority=2)
	public void testMethod5() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod5");
		System.out.println("this is testMethod5 thread is"+ " " +Thread.currentThread().getId());
		driver.close();
	}
	
	@Test(groups= {"functionaltest"}, priority=1)
	public void testMethod6() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("Running testMethod6");
		System.out.println("this is testMethod6 thread is"+ " " +Thread.currentThread().getId());
		driver.close();
	}
}
