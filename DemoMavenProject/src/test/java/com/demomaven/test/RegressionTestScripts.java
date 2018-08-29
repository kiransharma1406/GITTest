package com.demomaven.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demomaven.main.MethodRepository;

public class RegressionTestScripts {
	
	@BeforeTest
	public void browserAppLaunch() throws IOException
	{
		MethodRepository obj1=new MethodRepository();
						 obj1.browserAppLaunch();
	}
	
	@Test(priority=2)
	public void verifyValidLogin() throws Exception
	{
		MethodRepository obj2=new MethodRepository();
						 obj2.validLogin();
						 Assert.assertTrue(obj2.verifiedValidLogin(), "valid login successfully done");
						
	}
	
	@Test(priority=0)
	public void verifyinvalidLogin() throws Exception, Exception
	{
		MethodRepository obj3=new MethodRepository();
						 obj3.invalidLogin();
						 Assert.assertTrue(obj3.verifiedInvalidLogin(), "case pass");
					
	}
	
	@AfterTest
	public void appClose()
	{
		MethodRepository obj4=new MethodRepository();
						 obj4.appClose();
	}
	
	@Test(priority=1)
	public void nevigateBack() throws IOException
	{
		MethodRepository obj5=new MethodRepository();
						 obj5.nevigateBack();
	}

}
