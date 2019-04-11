package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Agegate;
import com.crm.qa.pages.AphriaProductsPage;
import com.crm.qa.pages.AuroraProductsPage;
import com.crm.qa.pages.WeedProductsPage;


public class WeedProductsPagetest extends TestBase {

	Agegate agegate;
	WeedProductsPage weedproductspage;
	
	public WeedProductsPagetest() {	
	super();
}
	

@BeforeMethod

public void setup() throws InterruptedException {
	
	Initialization();
	agegate = new Agegate();
	agegate.Agegatelogin();
	weedproductspage = new WeedProductsPage();
	weedproductspage.Shoppage();
	
	
}
	


@Test (priority=3)

public void CaptureWeedMangoHazeProductNameAndPrice() throws IOException {
	String Productprice= weedproductspage.CaptureWeedMangoHazeProductNameAndPrice();
	Assert.assertEquals(Productprice, "$8.00/ gram", "Product Price Not Matching");
	
}





@AfterMethod

public void Teardown() {
	
	driver.quit();
}
	
	
}
