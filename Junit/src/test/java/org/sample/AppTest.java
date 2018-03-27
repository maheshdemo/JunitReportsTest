package org.sample;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Unit test for simple App.
 */
public class AppTest    
 {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
        driver.quit();
        Assert.assertTrue(true);
	}
	
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
        driver.quit();
        Assert.assertFalse(true,"Unable to verify due to locator failure");
	}
	
	@Test
	public void test2()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
        driver.quit();
        Assert.assertFalse(true,"Unable to verify due to locator failure");
	}
	
 }
