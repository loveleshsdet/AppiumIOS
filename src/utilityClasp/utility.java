package utilityClasp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import configData.connectionClasp;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class utility extends connectionClasp {
	
	/* Read Property File */
	public static Properties readPropertyFile() throws IOException
	{
		Properties prop = new Properties();
		
		// Properties File Path
		String propFilePath = System.getProperty("user.dir") + "//src//dataFiles//clasp.properties";
		
		// Read File by using FileInputStream Library
		InputStream input = new FileInputStream(propFilePath);
		// Load file
        prop.load(input);
        
        // Return file data
        return prop;
	}
	
	
	public IOSElement findElementByClass(String loc)
	{
		return driver.findElementByClassName(loc);
	}
	
	public IOSElement  findElementByName(String loc)
	{
		return driver.findElementByName(loc);
	}
	
	public IOSElement findElementByxpath(String loc)
	{
		return driver.findElementByXPath(loc);
	}
	
	public IOSElement findElementByCss(String loc)
	{
		return driver.findElementByCssSelector(loc);
	}
	
	public Dimension getWindowSize()
	{
		 return driver.manage().window().getSize();
	}
	
	public void waitThread(int w) throws InterruptedException
	{
		 Thread.sleep(w);
	}
	
	public void clickOnElement(IOSElement el)
	{
		el.click();
	}
	
	public void sendDataInElem(IOSElement el, String data)
	{
		el.sendKeys(data);
	}
	
	
	public boolean checkEementDisplay(IOSElement el)
	{
		return el.isDisplayed();
	}


	
	public void swipHomeSlider(Point bannerPoint, int startX, int endX, int times) throws InterruptedException
	{
		TouchAction action = new TouchAction(driver);
		
		if(times > 0)
		{	
			for(int l=0; l<times;l++)
			{
				action
		        .press(PointOption.point(startX, bannerPoint.getY()))
		        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
		        .moveTo(PointOption.point(endX, bannerPoint.getY()))
		        .release();
				driver.performTouchAction(action);	
				waitThread(1000);
			}
		}
		else
		{
			action
	        .press(PointOption.point(startX, bannerPoint.getY()))
	        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	        .moveTo(PointOption.point(endX, bannerPoint.getY()))
	        .release();
			driver.performTouchAction(action);
			
			waitThread(1000);
		}
	}
	
}	


	