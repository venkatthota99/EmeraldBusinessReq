package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.Testutil;

public class CannimedProductsPage extends TestBase{
	
	 @FindBy(xpath="//a[@href='/en_CA/products']")
	   WebElement shopbtn;
	   
	//CanniMed-1:20-Oil-Hybrid
	 @FindBy(xpath="//a[@href='/en_CA/products/CanniMed-CanniMed-1:20-Oil-Hybrid/14']")
	   WebElement CanniMed120OilHybrid;
	 
		 @FindBy(xpath="//*[@class='pdp-product-name h2']")
		   WebElement CanniMed120OilHybridproductname;
		 
		 @FindBy(xpath="//*[@class='bottleQuantity']")
		   WebElement CanniMed120OilHybridprice;
	 
    //CanniMed-18:0-Oil-Hybrid
		 
		 
		 @FindBy(xpath="//a[@href='/en_CA/products/CanniMed-CanniMed-18:0-Oil-Hybrid/12']")
		   WebElement CanniMed180OilHybrid;
		 
		 @FindBy(xpath="//*[@class='pdp-product-name h2']")
		   WebElement CanniMed180OilHybridproductname;
		 
		 @FindBy(xpath="//*[@class='bottleQuantity']")
		   WebElement CanniMed180OilHybridprice;
		 
     //CanniMed-10:10-Oil-Hybrid
		 
		 
		 @FindBy(xpath="//a[@href='/en_CA/products/CanniMed-CanniMed-10:10-Oil-Hybrid/13']")
		   WebElement CanniMed1010OilHybrid;
		 
		 @FindBy(xpath="//*[@class='pdp-product-name h2']")
		   WebElement CanniMed1010OilHybridproductname;
		 
		 @FindBy(xpath="//*[@class='bottleQuantity']")
		   WebElement CanniMed1010OilHybridprice;
	 
	//Initializing the Page Objects
	   
	   public CannimedProductsPage() {
		   PageFactory.initElements(driver, this);
	   }
	 
	 //Actions
	   
	   public CannimedProductsPage Shoppage() throws InterruptedException {
		   Thread.sleep(4000);
		   JavascriptExecutor jss = (JavascriptExecutor)driver;
			jss.executeScript("arguments[0].click();", shopbtn);
			return new CannimedProductsPage();
	   }  
	   		  
		  public String CaptureCanniMed120OilProductNameAndPrice() throws IOException {
			  CanniMed120OilHybrid.click();
			     String  CMHPN=    CanniMed120OilHybridproductname.getText();   
			     String  CMHP=    CanniMed120OilHybridprice.getText();
			     Testutil.WriteExcelData(19,0,CMHPN);   
				 Testutil.WriteExcelData(19,1,CMHP);
				 return CMHP;
		  }
	     
			 
		  public String CanniMed180OilHybridProductNameAndPrice() throws IOException {
			  CanniMed180OilHybrid.click();
			     String  CM18HPN=    CanniMed180OilHybridproductname.getText();   
			     String  CM18HP=     CanniMed180OilHybridprice.getText();
			     Testutil.WriteExcelData(20,0,CM18HPN);   
				 Testutil.WriteExcelData(20,1,CM18HP);				 
				 return CM18HP;
		  }
		  
		  public String CanniMed1010OilHybridProductNameAndPrice() throws IOException {
			  CanniMed1010OilHybrid.click();
			     String  CM100HPN=    CanniMed1010OilHybridproductname.getText();   
			     String  CM100HP=     CanniMed1010OilHybridprice.getText();
			     Testutil.WriteExcelData(21,0,CM100HPN);   
				 Testutil.WriteExcelData(21,1,CM100HP);				 
				 return CM100HP;
		  }
		  
		 
}
