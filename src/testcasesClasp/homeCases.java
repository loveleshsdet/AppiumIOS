package testcasesClasp;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSElement;
import pageClasp.homeObject;


public class homeCases extends homeObject {

	@Test
	public void claspSplashScreen() throws InterruptedException
	{
		slideScreen();
	}	
	
	@Test(priority=1)
	public void clickGetStattedButton() throws InterruptedException
	{		
		IOSElement el=findElementByName("Get started");
		clickOnElement(el);		
	}	
}