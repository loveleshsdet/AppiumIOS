package configData;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import utilityClasp.utility;

public class connectionClasp{
	
	public static String deviceName;
	public static String platformVersion;
	public static String appFileName;
	public static String hostName;	
	public static IOSDriver<IOSElement> driver;
	
	@BeforeSuite
	public void setConnectionClasp() throws IOException
	{
		Properties prop = utility.readPropertyFile();		
		deviceName = prop.getProperty("deviceName");
		platformVersion = prop.getProperty("platformVersion");
		appFileName = prop.getProperty("appFileName");
		hostName = prop.getProperty("hostName");
		
		// Application .app path
		String appFilePath = System.getProperty("user.dir") + "//src//applicationPath//"+ appFileName;	
		
		DesiredCapabilities dc = new DesiredCapabilities();		
		// Set Mobile capability property value		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);		
		dc.setCapability(MobileCapabilityType.APP, appFilePath);
		
		driver = new IOSDriver<IOSElement>(new URL(hostName), dc);			
	}	
}