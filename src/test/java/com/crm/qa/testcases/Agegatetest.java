package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Agegate;


public class Agegatetest extends TestBase{
	
	Agegate agegate;
	
	
	public Agegatetest() {	
	super();
}
	

@BeforeMethod

public void setup() {
	
	Initialization();
	agegate = new Agegate();
	
}


@Test (priority=1)

public void AgegateTitletest() {
	String Title = agegate.Agegatetitle();
	Assert.assertEquals(Title, "Medical Cannabis by Shoppers Drug Mart");
}

@Test (priority=2)
public void Agegateimagelogotest() {
	  boolean flag=  agegate.Agegatepagesitelogo();
	Assert.assertTrue(flag);
}

@Test (priority=3)
public void Agegatelogintest() {
	 agegate.Agegatelogin();
}

@AfterMethod

public void Teardown() {
	
	driver.quit();
}





}
