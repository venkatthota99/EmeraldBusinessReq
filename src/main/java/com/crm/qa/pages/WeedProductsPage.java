package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.Testutil;

public class WeedProductsPage extends TestBase{
	
	 @FindBy(xpath="//a[@href='/en_CA/products']")
	   WebElement shopbtn;
	   
		 
	 // WeedMD-Mango-Haze-Hybrid
	 
	 @FindBy(xpath="//a[@href='/en_CA/products/WeedMD-WeedMD-Mango-Haze-Hybrid/52']")
	   WebElement WeedMDMangoHaze;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement WeedMDMangoHazeproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement WeedMDMangoHazeprice;
	 
		 
	//Initializing the Page Objects
	   
	   public WeedProductsPage() {
		   PageFactory.initElements(driver, this);
	   }
	 
	 //Actions
	   
	   public WeedProductsPage Shoppage() throws InterruptedException {
		   Thread.sleep(4000);
		   JavascriptExecutor jss = (JavascriptExecutor)driver;
			jss.executeScript("arguments[0].click();", shopbtn);
			return new WeedProductsPage();
	   }  
	   		  
		  public String CaptureWeedMangoHazeProductNameAndPrice() throws IOException {
			     WeedMDMangoHaze.click();
			     String  WMHPN=    WeedMDMangoHazeproductname.getText();   
			     String  WMHP=    WeedMDMangoHazeprice.getText();
			     Testutil.WriteExcelData(3,0,WMHPN);   
				 Testutil.WriteExcelData(3,1,WMHP);				 
				 return WMHP;
		  }
	 
		 
}
