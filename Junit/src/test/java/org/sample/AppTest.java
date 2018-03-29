package org.sample;

import java.io.File;
import java.io.StringWriter;
import java.io.Writer;

import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Unit test for simple App.
 */
public class AppTest    
 {
	
	@Test(enabled=false)
	public void test3()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
        driver.quit();
       try{ Assert.assertFalse(true,"Unable to verify test");}catch(Exception e){}
      
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertFalse(true, "Unable to verify url pointing to denmark");
//        softAssert.assertFalse(true, "Unable to verify url pointing to denmark1");
//        softAssert.assertFalse(true, "Unable to verify url pointing to denmark2");
//        softAssert.assertFalse(true, "Unable to verify url pointing to denmark3");
//        softAssert.assertFalse(true, "Unable to verify url pointing to denmark4");
//        softAssert.assertFalse(true, "Unable to verify url pointing to denmark5");
               
	}
	
	
	@Test(enabled=false)
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
//		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
//        driver.get("http://google.com/");
//        driver.quit();
//        try{ Assert.assertFalse(true,"Unable to verify test");}catch(Exception e){}      
        
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//Document doc = builder.parse(new File("test-output\\Suite\\Test.xml"));
			
			Document doc = builder.newDocument();

			
			Element tsSuite = doc.createElement("testsuite");
			tsSuite.setAttribute("hostname","USHYDMMEDAVARA3");
			tsSuite.setAttribute("ignored","0");
			tsSuite.setAttribute("name","Test");
			tsSuite.setAttribute("tests","3");
			tsSuite.setAttribute("failures","3");
			tsSuite.setAttribute("timestamp","28 Mar 2018 06:16:20 GMT");
			tsSuite.setAttribute("time","45.958");		
			tsSuite.setAttribute("errors","0");
			doc.appendChild(tsSuite);
			Comment preProcCom = doc.createComment("  Generated by org.testng.reporters.JUnitXMLReporter  ");
			tsSuite.getParentNode().insertBefore(preProcCom,tsSuite);
			
			
			Element ts1 = doc.createElement("testcase");
			ts1.setAttribute("name","test1");
			ts1.setAttribute("time","23.415");
			ts1.setAttribute("classname","Validating New Zeleand");			
			tsSuite.appendChild(ts1);
			
			Element failure1 = doc.createElement("failure");
			failure1.setAttribute("type","java.lang.AssertionError");
			failure1.setAttribute("message","Unable to validate this condition against given value...");		
			ts1.appendChild(failure1);
			Text txt1 = doc.createTextNode("<![CDATA[java.lang.AssertionError: Unable to verify test expected [false] but found [true]at org.sample.AppTest.test1(AppTest.java:50)... Removed 28 stack frames]]>");
			failure1.appendChild(txt1);
			
			
			Element ts2 = doc.createElement("testcase");
			ts2.setAttribute("name","test2");
			ts2.setAttribute("time","45.989");
			ts2.setAttribute("classname","Validating New Zeleand");			
			tsSuite.appendChild(ts2);
			ts2.appendChild(failure1);
			
			Element ts3 = doc.createElement("testcase");
			ts3.setAttribute("name","test3");
			ts3.setAttribute("time","45.989");
			ts3.setAttribute("classname","Validating New Zeleand1");			
			tsSuite.appendChild(ts3);
			ts3.appendChild(failure1);
			Element ts4 = doc.createElement("testcase");
			ts4.setAttribute("name","test4");
			ts4.setAttribute("time","45.989");
			ts4.setAttribute("classname","Validating New Zeleand2");			
			tsSuite.appendChild(ts4);
			ts4.appendChild(failure1);
			Element ts5 = doc.createElement("testcase");
			ts5.setAttribute("name","test5");
			ts5.setAttribute("time","45.989");
			ts5.setAttribute("classname","Validating New Zeleand");			
			tsSuite.appendChild(ts5);
			ts5.appendChild(failure1);
			Element ts6 = doc.createElement("testcase");
			ts6.setAttribute("name","test6");
			ts6.setAttribute("time","45.989");
			ts6.setAttribute("classname","Validating New Zeleand3");			
			tsSuite.appendChild(ts6);
			ts6.appendChild(failure1);
			
			
			Transformer tf = TransformerFactory.newInstance().newTransformer();
			tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			Writer out = new StringWriter();
			tf.transform(new DOMSource(doc), new StreamResult("Junit\\test-output\\Suite\\test2.xml"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
 }
