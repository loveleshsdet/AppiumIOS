package testcasesClasp;

import org.testng.annotations.Test;

import pageClasp.phoneNumber;

@Test
public class phoneNumberClass extends phoneNumber{
	
	public void clickNextWithoutPhoneNumber()
	{
		boolean isDisNxt = submitEmptyForm();
		if(isDisNxt)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
	
	@Test(priority=1)
	public void enterPhoneNumber() throws InterruptedException
	{
		enterValidPhoneNumber();
	}
	
	
}