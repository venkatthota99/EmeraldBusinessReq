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
import com.crm.qa.pages.CannimedProductsPage;



public class CannimedProductsPagetest extends TestBase {

	Agegate agegate;
	CannimedProductsPage cannimedproductspage;
	
	public CannimedProductsPagetest() {	
	super();
}
	

@BeforeMethod

public void setup() throws InterruptedException {
	
	Initialization();
	agegate = new Agegate();
	agegate.Agegatelogin();
	cannimedproductspage = new CannimedProductsPage();
	cannimedproductspage.Shoppage();
	
	
}
	
@Test (priority=1)

public void CaptureCanniMed120OilProductNameAndPricetest() throws IOException {
	String Productprice= cannimedproductspage.CaptureCanniMed120OilProductNameAndPrice();
	Assert.assertEquals(Productprice, "$130.00/ bottle", "Product Price Not Matching");
	
}
	

@Test (priority=2)

public void CanniMed180OilHybridProductNameAndPricetest() throws IOException {
	String Productprice= cannimedproductspage.CanniMed180OilHybridProductNameAndPrice();
	Assert.assertEquals(Productprice, "$150.00/ bottle", "Product Price Not Matching");
	
}

@Test (priority=3)

public void CanniMed1010OilHybridProductNameAndPricetest() throws IOException {
	String Productprice= cannimedproductspage.CanniMed1010OilHybridProductNameAndPrice();
	Assert.assertEquals(Productprice, "$160.00/ bottle", "Product Price Not Matching");
	
}

@AfterMethod

public void Teardown() {
	
	driver.quit();
}
	
	
}
