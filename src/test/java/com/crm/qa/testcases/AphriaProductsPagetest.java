package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Agegate;
import com.crm.qa.pages.AphriaProductsPage;



public class AphriaProductsPagetest extends TestBase {

	Agegate agegate;
	AphriaProductsPage aphriaproductspage;
	
	public AphriaProductsPagetest() {	
	super();
}
	

@BeforeMethod

public void setup() throws InterruptedException {
	
	Initialization();
	agegate = new Agegate();
	agegate.Agegatelogin();
	aphriaproductspage = new AphriaProductsPage();
	aphriaproductspage.Shoppage();
	
	
}
	
@Test (priority=1)

public void CaptureAphriaChurchilNordleProductNameAndPricetest() throws IOException {
	String Productprice= aphriaproductspage.CaptureAphriaChurchilNordleProductNameAndPrice();
	Assert.assertEquals(Productprice, "$7.20/ gram", "Product Price Not Matching");
	
}
	

@Test (priority=2)

public void AphriaBienvilleJeanGuyProductNameAndPricetest() throws IOException {
	String Productprice= aphriaproductspage.AphriaBienvilleJeanGuyProductNameAndPrice();
	Assert.assertEquals(Productprice, "$8.50/ gram", "Product Price Not Matching");
	
}

@Test (priority=3)

public void AphriaTremblantTreasureIslandProductNameAndPricetest() throws IOException {
	String Productprice= aphriaproductspage.AphriaTremblantTreasureIslandProductNameAndPrice();
	Assert.assertEquals(Productprice, "$8.50/ gram", "Product Price Not Matching");
	
}

@Test (priority=4)

public void AphriaSachigoSourKushProductNameAndPricetest() throws IOException {
	String Productprice= aphriaproductspage.AphriaSachigoSourKushProductNameAndPrice();
	Assert.assertEquals(Productprice, "$8.50/ gram", "Product Price Not Matching");
	
}

@Test (priority=5)

public void AphriaRideauSativaProductNameAndPricetest() throws IOException {
	String Productprice= aphriaproductspage.AphriaRideauSativaProductNameAndPrice();
	Assert.assertEquals(Productprice, "$100.00/ bottle", "Product Price Not Matching");
	
}
@Test (priority=6)

public void AphriaCapilanoHybridProductNameAndPricetest() throws IOException {
	String Productprice= aphriaproductspage.AphriaCapilanoHybridProductNameAndPrice();
	Assert.assertEquals(Productprice, "$100.00/ bottle", "Product Price Not Matching");
	
}
@Test (priority=7)

public void AphriaChamplainSativaProductNameAndPricetest() throws IOException {
	String Productprice= aphriaproductspage.AphriaChamplainSativaProductNameAndPrice();
	Assert.assertEquals(Productprice, "$120.00/ bottle", "Product Price Not Matching");
	
}
@Test (priority=8)

public void AphriaChamplainIndicaProductNameAndPrice() throws IOException {
	String Productprice= aphriaproductspage.AphriaChamplainIndicaProductNameAndPrice();
	Assert.assertEquals(Productprice, "$120.00/ bottle", "Product Price Not Matching");
	
}

@AfterMethod

public void Teardown() {
	
	driver.quit();
}
	
	
}
