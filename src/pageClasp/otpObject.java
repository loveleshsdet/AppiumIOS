package pageClasp;

import io.appium.java_client.ios.IOSElement;
import utilityClasp.utility;

public class otpObject extends utility{
	
	public void enterValidOTP(String OTP) throws InterruptedException
	{
		Thread.sleep(3000);
		IOSElement el = findElementByClass("XCUIElementTypeTextField");
		sendDataInElem(el,OTP);
		
		
		IOSElement nxt3 = clickNextButton();
		clickOnElement(nxt3);	
	}
	
	public IOSElement clickNextButton()
	{
		IOSElement nxt3 = findElementByClass("XCUIElementTypeButton");
		return nxt3;
	}
}
