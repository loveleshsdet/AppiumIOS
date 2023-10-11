package pageClasp;

import io.appium.java_client.ios.IOSElement;
import utilityClasp.utility;

public class phoneNumber extends utility{	
	
	public boolean submitEmptyForm()
	{
		IOSElement el = clickNextButton();
		clickOnElement(el);		
		
		IOSElement erroWind= findElementByClass("XCUIElementTypeOther");
		boolean isNxt = checkEementDisplay(erroWind);		
		return isNxt;
	}
	
	public void enterValidPhoneNumber() throws InterruptedException
	{
		IOSElement phnEl= findElementByClass("XCUIElementTypeTextField");
		sendDataInElem(phnEl,"1111111600");
		
		IOSElement el2 = clickNextButton();
		clickOnElement(el2);	
	}
	
	public IOSElement clickNextButton()
	{
		IOSElement nxt=findElementByName("Next");
		return nxt;
	}
}