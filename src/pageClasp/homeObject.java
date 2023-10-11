package pageClasp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import io.appium.java_client.ios.IOSElement;
import utilityClasp.utility;

public class homeObject  extends utility {
	
	public void slideScreen() throws InterruptedException
	{
		/* Get element by Class Name */
		IOSElement banner = findElementByClass("XCUIElementTypeImage");
		
		/* Get location by Element */
		Point bannerPoint = banner.getLocation();
	    
		/* Get Window size */
	    Dimension screenSize = getWindowSize();	    
	    int startX = Math.toIntExact(Math.round(screenSize.getWidth() * 0.8));
	    int endX = 0;
	    int ltimes = 4;	    
	    /*  Slider slide swipe */
	    swipHomeSlider(bannerPoint,startX,endX,ltimes);	  	    
	}
	
	public phoneNumber clickGetStarted()
	{
		
		IOSElement el=findElementByName("Get started");
		clickOnElement(el);
		return new phoneNumber();
	}
}