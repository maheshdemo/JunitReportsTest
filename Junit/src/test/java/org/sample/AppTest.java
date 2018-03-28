package org.sample;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Unit test for simple App.
 */
public class AppTest    
 {
	
	@Test
	public void test3()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
        driver.quit();
        //try{ Assert.assertFalse(true,"Unable to verify test");}catch(Exception e){}
      
               SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(true, "Unable to verify url pointing to denmark");
        softAssert.assertFalse(true, "Unable to verify url pointing to denmark1");
        softAssert.assertFalse(true, "Unable to verify url pointing to denmark2");
        softAssert.assertFalse(true, "Unable to verify url pointing to denmark3");
        softAssert.assertFalse(true, "Unable to verify url pointing to denmark4");
        softAssert.assertFalse(true, "Unable to verify url pointing to denmark5");
               
	}
	
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
        driver.quit();
        try{
        	Assert.assertFalse(true,"Unable to verify test");
        	
        }catch(Exception e){}	}
	
	@Test
	public void test2()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
        driver.quit();
        try{ Assert.assertFalse(true,"Unable to verify test");}catch(Exception e){}      
        
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File("test-output\\junitreports\\TEST-org.sample.Junit.Junit.AppTest.xml"));
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
 }
