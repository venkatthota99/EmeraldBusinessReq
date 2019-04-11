package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.Testutil;

public class EmblemProductsPage extends TestBase{
	
	 @FindBy(xpath="//a[@href='/en_CA/products']")
	   WebElement shopbtn;
	   
	//Aphria-Churchill-(Nordle)
	 @FindBy(xpath="//a[@href='/en_CA/products/Aphria-Aphria-Churchill-(Nordle)-Indica/2']")
	   WebElement AphriaChurchillNordle;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AphriaChurchillNordleproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement AphriaChurchillNordleprice;
	 
		 
	 // Aphria-Bienville-(Jean-Guy) 
	 
	 @FindBy(xpath="//a[@href='/en_CA/products/Aphria-Aphria-Bienville-(Jean-Guy)-Sativa/3']")
	   WebElement AphriaBienvilleJeanGuy;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AphriaBienvilleJeanGuyproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement AphriaBienvilleJeanGuyprice;
	 
	// Aphria-Tremblant-(Treasure-Island) 
	 
	 
	 @FindBy(xpath="//a[@href='/en_CA/products/Aphria-Aphria-Tremblant-(Treasure-Island)-Sativa/5']")
	   WebElement AphriaTremblantTreasureIsland;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AphriaTremblantTreasureIslandproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement AphriaTremblantTreasureIslandprice;
	 
	 //Aphria-Sachigo-(Sour-Kush)
	 
	 
	 @FindBy(xpath="//a[@href='/en_CA/products/Aphria-Aphria-Sachigo-(Sour-Kush)-Hybrid/4']")
	   WebElement AphriaSachigoSourKush;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AphriaSachigoSourKushproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement AphriaSachigoSourKushprice;
	 
	//Aphria-Rideau-Sativa
	 
	 
		 @FindBy(xpath="//a[@href='/en_CA/products/Aphria-Aphria-Rideau-Sativa/9']")
		   WebElement AphriaRideauSativa;
		 
		 @FindBy(xpath="//*[@class='pdp-product-name h2']")
		   WebElement AphriaRideauSativaproductname;
		 
		 @FindBy(xpath="//*[@class='bottleQuantity']")
		   WebElement AphriaRideauSativaprice;
	 
	//Aphria-Capilano-Hybrid
		 
		 
		 @FindBy(xpath="//a[@href='/en_CA/products/Aphria-Aphria-Capilano-Hybrid/8']")
		   WebElement AphriaCapilanoHybrid;
		 
		 @FindBy(xpath="//*[@class='pdp-product-name h2']")
		   WebElement AphriaCapilanoHybridproductname;
		 
		 @FindBy(xpath="//*[@class='per-gram-price']")
		   WebElement AphriaCapilanoHybridprice;
	 
    //Aphria-Champlain-Sativa
		 
		 
		 @FindBy(xpath="//a[@href='/en_CA/products/Aphria-Aphria-Champlain-Sativa-Sativa/7']")
		   WebElement AphriaChamplainSativa;
		 
		 @FindBy(xpath="//*[@class='pdp-product-name h2']")
		   WebElement AphriaChamplainSativaproductname;
		 
		 @FindBy(xpath="//*[@class='per-gram-price']")
		   WebElement AphriaChamplainSativaprice;
		 
     //Aphria-Champlain-Indica
		 
		 
		 @FindBy(xpath="//a[@href='/en_CA/products/Aphria-Aphria-Champlain-Indica-Indica/6']")
		   WebElement AphriaChamplainIndica;
		 
		 @FindBy(xpath="//*[@class='pdp-product-name h2']")
		   WebElement AphriaChamplainIndicaproductname;
		 
		 @FindBy(xpath="//*[@class='per-gram-price']")
		   WebElement AphriaChamplainIndicaprice;
	 
	//Initializing the Page Objects
	   
	   public EmblemProductsPage() {
		   PageFactory.initElements(driver, this);
	   }
	 
	 //Actions
	   
	   public EmblemProductsPage Shoppage() throws InterruptedException {
		   Thread.sleep(4000);
		   JavascriptExecutor jss = (JavascriptExecutor)driver;
			jss.executeScript("arguments[0].click();", shopbtn);
			return new EmblemProductsPage();
	   }  
	   		  
		  public String CaptureAphriaChurchilNordleProductNameAndPrice() throws IOException {
			     AphriaChurchillNordle.click();
			     String  ACNPN=    AphriaChurchillNordleproductname.getText();   
			     String  ACNPP=    AphriaChurchillNordleprice.getText();
			     Testutil.WriteExcelData(1,0,ACNPN);   
				 Testutil.WriteExcelData(1,1,ACNPP);
				 return ACNPP;
		  }
	     
			 
		  public String AphriaBienvilleJeanGuyProductNameAndPrice() throws IOException {
			     AphriaBienvilleJeanGuy.click();
			     String  ABJGPN=    AphriaBienvilleJeanGuyproductname.getText();   
			     String  ABJGP=     AphriaBienvilleJeanGuyprice.getText();
			     Testutil.WriteExcelData(2,0,ABJGPN);   
				 Testutil.WriteExcelData(2,1,ABJGP);				 
				 return ABJGP;
		  }
		  
		  public String AphriaTremblantTreasureIslandProductNameAndPrice() throws IOException {
			     AphriaTremblantTreasureIsland.click();
			     String  ATTIPN=    AphriaTremblantTreasureIslandproductname.getText();   
			     String  ATTIP=     AphriaTremblantTreasureIslandprice.getText();
			     Testutil.WriteExcelData(3,0,ATTIPN);   
				 Testutil.WriteExcelData(3,1,ATTIP);				 
				 return ATTIP;
		  }
		  
		  public String AphriaSachigoSourKushProductNameAndPrice() throws IOException {
			  AphriaSachigoSourKush.click();
			     String  ASSKPN=    AphriaSachigoSourKushproductname.getText();   
			     String  ASSKP=     AphriaSachigoSourKushprice.getText();
			     Testutil.WriteExcelData(4,0,ASSKPN);   
				 Testutil.WriteExcelData(4,1,ASSKP);				 
				 return ASSKP;
		  }
		  
		  public String AphriaRideauSativaProductNameAndPrice() throws IOException {
			  AphriaRideauSativa.click();
			     String  ARSPN=    AphriaRideauSativaproductname.getText();   
			     String  ARSP=     AphriaRideauSativaprice.getText();
			     Testutil.WriteExcelData(5,0,ARSPN);   
				 Testutil.WriteExcelData(5,1,ARSP);				 
				 return ARSP;
		  }
		  
		  public String AphriaCapilanoHybridProductNameAndPrice() throws IOException {
			  AphriaCapilanoHybrid.click();
			     String  ACHPN=    AphriaCapilanoHybridproductname.getText();   
			     String  ACHP=     AphriaCapilanoHybridprice.getText();
			     Testutil.WriteExcelData(6,0,ACHPN);   
				 Testutil.WriteExcelData(6,1,ACHP);				 
				 return ACHP;
		  }
		  
		  public String AphriaChamplainSativaProductNameAndPrice() throws IOException {
			  AphriaChamplainSativa.click();
			     String  ACSPN=    AphriaChamplainSativaproductname.getText();   
			     String  ACSP=     AphriaChamplainSativaprice.getText();
			     Testutil.WriteExcelData(7,0,ACSPN);   
				 Testutil.WriteExcelData(7,1,ACSP);				 
				 return ACSP;
		  }
		  
		  public String AphriaChamplainIndicaProductNameAndPrice() throws IOException {
			  AphriaChamplainIndica.click();
			     String  ACIPN=    AphriaChamplainIndicaproductname.getText();   
			     String  ACIP=     AphriaChamplainIndicaprice.getText();
			     Testutil.WriteExcelData(8,0,ACIPN);   
				 Testutil.WriteExcelData(8,1,ACIP);				 
				 return ACIP;
		  }
}
