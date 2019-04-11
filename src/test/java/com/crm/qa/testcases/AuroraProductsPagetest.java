package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Agegate;
import com.crm.qa.pages.AuroraProductsPage;


public class AuroraProductsPagetest extends TestBase {

	Agegate agegate;
	AuroraProductsPage auroraproductspage;
	
	public AuroraProductsPagetest() {	
	super();
}
	

@BeforeMethod

public void setup() throws InterruptedException {
	
	Initialization();
	agegate = new Agegate();
	agegate.Agegatelogin();
	auroraproductspage = new AuroraProductsPage();
	auroraproductspage.Shoppage();
	
	
}
	
	
@Test (priority=1)

public void CaptureAuroraTowerProductNameAndPricetest() throws IOException {
	String Productprice= auroraproductspage.CaptureAuroraTowerProductNameAndPrice();
	Assert.assertEquals(Productprice, "$8.00/ gram", "Product Price Not Matching");
	
}

@Test (priority=2)

public void CaptureAuroraThorGhostTrainHazeProductNameAndPricetest() throws IOException {
	String Productprice= auroraproductspage.CaptureAuroraThorGhostTrainHazeProductNameAndPrice();
	Assert.assertEquals(Productprice, "$8.75/ gram", "Product Price Not Matching");
	
}

@Test (priority=3)

public void CaptureAuroraSnowDomeLAConfidentialProductNameAndPricetest() throws IOException {
	String Productprice= auroraproductspage.CaptureAuroraSnowDomeLAConfidentialProductNameAndPrice();
	Assert.assertEquals(Productprice, "$9.00/ gram", "Product Price Not Matching");
	
}

@Test (priority=4)

public void CaptureAuroraCannatonicBalancedHybridProductNameAndPricetest() throws IOException {
	String Productprice= auroraproductspage.CaptureAuroraCannatonicBalancedHybridProductNameAndPrice();
	Assert.assertEquals(Productprice, "$9.00/ gram", "Product Price Not Matching");
	
}

@Test (priority=5)

public void CaptureAuroraTHCDropsSativaProductNameAndPricetest() throws IOException {
	String Productprice= auroraproductspage.CaptureAuroraTHCDropsSativaProductNameAndPrice();
	Assert.assertEquals(Productprice, "$95.00/ bottle", "Product Price Not Matching");
	
}

@Test (priority=6)

public void CaptureAuroraCBDDropsHybridProductNameAndPricetest() throws IOException {
	String Productprice= auroraproductspage.CaptureAuroraCBDDropsHybridProductNameAndPrice();
	Assert.assertEquals(Productprice, "$95.00/ bottle", "Product Price Not Matching");
	
}

@Test (priority=7)

public void CaptureAurora11DropsSativaProductNameAndPricetest() throws IOException {
	String Productprice= auroraproductspage.CaptureAurora11DropsSativaProductNameAndPrice();
	Assert.assertEquals(Productprice, "$95.00/ bottle", "Product Price Not Matching");
	
}

@Test (priority=8)

public void CaptureAuroraTHCDropsIndicaProductNameAndPricetest() throws IOException {
	String Productprice= auroraproductspage.CaptureAuroraTHCDropsIndicaProductNameAndPrice();
	Assert.assertEquals(Productprice, "$95.00/ bottle", "Product Price Not Matching");
	
}




@AfterMethod

public void Teardown() {
	
	driver.quit();
}
	
	
}
