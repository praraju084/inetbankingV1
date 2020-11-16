package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws Exception 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		AddCustomerPage addcust= new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		addcust.custName("Raju");
		addcust.custgender("male");
		addcust.custdob("07", "17", "1984");
		addcust.custaddress("USA");
		addcust.custcity("Manassas");
		addcust.custstate("VA");
		addcust.custpinno("20109");
		addcust.custtelephoneno("5716629244");
		addcust.custemailid("praraju1984");
		addcust.custpassword("anceddee");
		addcust.custsubmit();
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if (res== true)
		{
			Assert.assertTrue(true);
		}else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
		
		
	}

}
