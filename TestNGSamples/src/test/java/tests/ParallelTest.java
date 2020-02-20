package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import java.lang.System;
import java.util.concurrent.TimeUnit;

public class ParallelTest {
	//WebDriver driver = null;
	
	@Test
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
	
		
	@Test
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
	@Test
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
	@Test
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
	@Test
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

	
}
