package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrow {

	public WebDriver driver;
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	 
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browser) {
	 try{
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				driver=new ChromeDriver();}
			
	 			}catch (WebDriverException e) {
	 				System.out.println(e.getMessage());
	 		}
	 
	  // Doesn't the browser type, lauch the Website
	 
	  driver.get("http://www.store.demoqa.com"); 
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test
	  public void login() throws InterruptedException {
	 
		driver.findElement(By.xpath("//*[@id='account']/a")).click();
	 
	    driver.findElement(By.id("log")).sendKeys("testuser_1");
	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	    driver.findElement(By.id("login")).click();
	 
		}  
	 
	  @AfterClass 
	  public void afterTest() {
	 
			driver.quit();
	 
		}
}
