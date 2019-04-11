package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.Testutil;

public class BrokenCoastProductsPage extends TestBase{
	
	 @FindBy(xpath="//a[@href='/en_CA/products']")
	   WebElement shopbtn;
	   
	//Broken-Coast-Galiano-(Northern-Lights-Haze)
	 @FindBy(xpath="//a[@href='/en_CA/products/Broken-Coast-Broken-Coast-Galiano-(Northern-Lights-Haze)-Sativa/11']")
	   WebElement BrokenCoastGalianoNorthernLightsHaze;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement BrokenCoastGalianoNorthernLightsHazeproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement BrokenCoastGalianoNorthernLightsHazeprice;
	 
		 
	 // Broken-Coast-Quadra-(Head-Stash)
	 
	 @FindBy(xpath="//a[@href='/en_CA/products/Broken-Coast-Broken-Coast-Quadra-(Head-Stash)-Indica/10']")
	   WebElement BrokenCoastQuadraHeadStash;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement BrokenCoastQuadraHeadStashproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement BrokenCoastQuadraHeadStashprice;
	 
	
	 
	//Initializing the Page Objects
	   
	   public BrokenCoastProductsPage() {
		   PageFactory.initElements(driver, this);
	   }
	 
	 //Actions
	   
	   public BrokenCoastProductsPage Shoppage() throws InterruptedException {
		   Thread.sleep(4000);
		   JavascriptExecutor jss = (JavascriptExecutor)driver;
			jss.executeScript("arguments[0].click();", shopbtn);
			return new BrokenCoastProductsPage();
	   }  
	   		  
		  public String CaptureBrokenCoastGalianoNorthernLightsHazeProductNameAndPrice() throws IOException {
			  BrokenCoastGalianoNorthernLightsHaze.click();
			     String  BCGNPN=    BrokenCoastGalianoNorthernLightsHazeproductname.getText();   
			     String  BCGNP=    BrokenCoastGalianoNorthernLightsHazeprice.getText();
			     Testutil.WriteExcelData(17,0,BCGNPN);   
				 Testutil.WriteExcelData(17,1,BCGNP);
				 return BCGNP;
		  }
	     
			 
		  public String BrokenCoastQuadraHeadStashProductNameAndPrice() throws IOException {
			  BrokenCoastQuadraHeadStash.click();
			     String  BCQHPN=    BrokenCoastQuadraHeadStashproductname.getText();   
			     String  BCQHP=     BrokenCoastQuadraHeadStashprice.getText();
			     Testutil.WriteExcelData(18,0,BCQHPN);   
				 Testutil.WriteExcelData(18,1,BCQHP);				 
				 return BCQHP;
		  }
		  
		 
}
