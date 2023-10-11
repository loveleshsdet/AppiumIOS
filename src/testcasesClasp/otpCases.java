package testcasesClasp;

import org.testng.annotations.Test;

import pageClasp.otpObject;


public class otpCases extends otpObject {
	@Test
	public void enterOTP() throws InterruptedException
	{
		String OTP = "123456";
		enterValidOTP(OTP);
	}
}
