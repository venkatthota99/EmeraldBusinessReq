package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Agegate;
import com.crm.qa.pages.AphriaProductsPage;
import com.crm.qa.pages.BrokenCoastProductsPage;



public class BrokenCoastProductsPagetest extends TestBase {

	Agegate agegate;
	BrokenCoastProductsPage brokencoastproductspage;
	
	public BrokenCoastProductsPagetest() {	
	super();
}
	

@BeforeMethod

public void setup() throws InterruptedException {
	
	Initialization();
	agegate = new Agegate();
	agegate.Agegatelogin();
	brokencoastproductspage = new BrokenCoastProductsPage();
	brokencoastproductspage.Shoppage();
	
	
}
	
@Test (priority=1)

public void CaptureBrokenCoastGalianoNorthernLightsHazeProductNameAndPricetest() throws IOException {
	String Productprice= brokencoastproductspage.CaptureBrokenCoastGalianoNorthernLightsHazeProductNameAndPrice();
	Assert.assertEquals(Productprice, "$10.30/ gram", "Product Price Not Matching");
	
}
	

@Test (priority=2)

public void BrokenCoastQuadraHeadStashProductNameAndPricetest() throws IOException {
	String Productprice= brokencoastproductspage.BrokenCoastQuadraHeadStashProductNameAndPrice();
	Assert.assertEquals(Productprice, "$11.60/ gram", "Product Price Not Matching");
	
}


@AfterMethod

public void Teardown() {
	
	driver.quit();
}
	
	
}
