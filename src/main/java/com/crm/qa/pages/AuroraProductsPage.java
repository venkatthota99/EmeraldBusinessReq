package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.Testutil;

public class AuroraProductsPage extends TestBase{
	
	 @FindBy(xpath="//a[@href='/en_CA/products']")
	   WebElement shopbtn;
	   
	 
	 //Aurora-Tower-Hybrid
     
	 @FindBy(xpath="//a[@href='/en_CA/products/Aurora-Aurora-Tower-Hybrid/28']")
	   WebElement AuroraTower;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AuroraTowerproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement AuroraTowerprice;
	 
	 //Aurora-Thor-(Ghost-Train-Haze) 
	 
	 
	 @FindBy(xpath="//a[@href='/en_CA/products/Aurora-Aurora-Thor-(Ghost-Train-Haze)-Sativa/26']")
	   WebElement AuroraThorGhostTrainHaze;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AuroraThorGhostTrainHazeproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement AuroraThorGhostTrainHazeprice;
	 
	 //Aurora-Snow-Dome-(LA-Confidential)	 
	 
	 @FindBy(xpath="//a[@href='/en_CA/products/Aurora-Aurora-Snow-Dome-(LA-Confidential)-Indica/27']")
	   WebElement AuroraSnowDomeLAConfidential;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AuroraSnowDomeLAConfidentialproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement AuroraSnowDomeLAConfidentialprice;
	 
	// Aurora-Cannatonic-(Balanced)
	 
	 @FindBy(xpath="/en_CA/products/Aurora-Aurora-Cannatonic-(Balanced)-Hybrid/25']")
	   WebElement AuroraCannatonicBalancedHybrid;
	 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AuroraCannatonicBalancedHybridproductname;
	 
	 @FindBy(xpath="//*[@class='per-gram-price']")
	   WebElement AuroraCannatonicBalancedHybridprice;
	 
	// Aurora-THC-Drops-(Sativa)
	 
	 @FindBy(xpath="/en_CA/products/Aurora-Aurora-THC-Drops-(Sativa)-Sativa/30']")
	   WebElement AuroraTHCDropsSativa;
		 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AuroraTHCDropsSativaproductname;
		 
	 @FindBy(xpath="//*[@class='bottleQuantity']")
	   WebElement AuroraTHCDropsSativaprice;
	 
	 
	// Aurora-CBD-Drops-Hybrid
	 
	 @FindBy(xpath="/en_CA/products/Aurora-Aurora-CBD-Drops-Hybrid/32']")
	   WebElement AuroraCBDDropsHybrid;
			 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement AuroraCBDDropsHybridproductname;
			 
	 @FindBy(xpath="//*[@class='bottleQuantity']")
	   WebElement AuroraCBDDropsHybridprice;
	 
	// Aurora-1:1-Drops-(Sativa)
	 
	 @FindBy(xpath="/en_CA/products/Aurora-Aurora-1:1-Drops-(Sativa)-Sativa/31']")
	   WebElement Aurora11DropsSativa;
				 
	 @FindBy(xpath="//*[@class='pdp-product-name h2']")
	   WebElement Aurora11DropsSativaproductname;
				 
	 @FindBy(xpath="//*[@class='bottleQuantity']")
	   WebElement Aurora11DropsSativaprice;
	 
	// Aurora-THC-Drops-(Indica)
	 
		 @FindBy(xpath="/en_CA/products/Aurora-Aurora-THC-Drops-(Indica)-Indica/29']")
		   WebElement AuroraTHCDropsIndica;
					 
		 @FindBy(xpath="//*[@class='pdp-product-name h2']")
		   WebElement AuroraTHCDropsIndicaproductname;
					 
		 @FindBy(xpath="//*[@class='bottleQuantity']")
		   WebElement AuroraTHCDropsIndicaprice; 
	 
	//Initializing the Page Objects
	   
	   public AuroraProductsPage() {
		   PageFactory.initElements(driver, this);
	   }
	 
	 //Actions
	   
	   public AuroraProductsPage Shoppage() throws InterruptedException {
		   Thread.sleep(4000);
		   JavascriptExecutor jss = (JavascriptExecutor)driver;
			jss.executeScript("arguments[0].click();", shopbtn);
			return new AuroraProductsPage();
	   }  
	   		 	 
	     
		  public String CaptureAuroraTowerProductNameAndPrice() throws IOException {
			     AuroraTower.click();
			     String  ATPN=    AuroraTowerproductname.getText();   
			     String  ATP=    AuroraTowerprice.getText();
			     Testutil.WriteExcelData(9,0,ATPN);   
				 Testutil.WriteExcelData(9,1,ATP);				 
				 return ATP;
		  }
	 
		 
		  public String CaptureAuroraThorGhostTrainHazeProductNameAndPrice() throws IOException {
			  AuroraThorGhostTrainHaze.click();
			     String  ATGTPN=    AuroraThorGhostTrainHazeproductname.getText();   
			     String  ATGTP=    AuroraThorGhostTrainHazeprice.getText();
			     Testutil.WriteExcelData(10,0,ATGTPN);   
				 Testutil.WriteExcelData(10,1,ATGTP);				 
				 return ATGTP;
		  }
		  
		  public String CaptureAuroraSnowDomeLAConfidentialProductNameAndPrice() throws IOException {
			  AuroraSnowDomeLAConfidential.click();
			     String  ASDCPN=   AuroraSnowDomeLAConfidentialproductname.getText();   
			     String  ASDCP=    AuroraSnowDomeLAConfidentialprice.getText();
			     Testutil.WriteExcelData(11,0,ASDCPN);   
				 Testutil.WriteExcelData(11,1,ASDCP);				 
				 return ASDCP;
		  }
		  
		  public String CaptureAuroraCannatonicBalancedHybridProductNameAndPrice() throws IOException {
			  AuroraCannatonicBalancedHybrid.click();
			     String  ACBHN=   AuroraCannatonicBalancedHybridproductname.getText();   
			     String  ACBHP=    AuroraCannatonicBalancedHybridprice.getText();
			     Testutil.WriteExcelData(12,0,ACBHN);   
				 Testutil.WriteExcelData(12,1,ACBHP);				 
				 return ACBHP;
		  }
		  
		  public String CaptureAuroraTHCDropsSativaProductNameAndPrice() throws IOException {
			  AuroraTHCDropsSativa.click();
			     String  ATDSPN=   AuroraTHCDropsSativaproductname.getText();   
			     String  ATDSP=    AuroraTHCDropsSativaprice.getText();
			     Testutil.WriteExcelData(13,0,ATDSPN);   
				 Testutil.WriteExcelData(13,1,ATDSP);				 
				 return ATDSP;
		  }
		  
		  public String CaptureAuroraCBDDropsHybridProductNameAndPrice() throws IOException {
			  AuroraCBDDropsHybrid.click();
			     String  ACDHPN=   AuroraCBDDropsHybridproductname.getText();   
			     String  ACDHP=    AuroraCBDDropsHybridprice.getText();
			     Testutil.WriteExcelData(14,0,ACDHPN);   
				 Testutil.WriteExcelData(14,1,ACDHP);				 
				 return ACDHP;
		  }
		  
		  public String CaptureAurora11DropsSativaProductNameAndPrice() throws IOException {
			  Aurora11DropsSativa.click();
			     String  ADSPN=   Aurora11DropsSativaproductname.getText();   
			     String  ADSP=    Aurora11DropsSativaprice.getText();
			     Testutil.WriteExcelData(15,0,ADSPN);   
				 Testutil.WriteExcelData(15,1,ADSP);				 
				 return ADSP;
		  }
		  
		  public String CaptureAuroraTHCDropsIndicaProductNameAndPrice() throws IOException {
			  AuroraTHCDropsIndica.click();
			     String  ATDIPN=   AuroraTHCDropsIndicaproductname.getText();   
			     String  ATDIP=    AuroraTHCDropsIndicaprice.getText();
			     Testutil.WriteExcelData(16,0,ATDIPN);   
				 Testutil.WriteExcelData(16,1,ATDIP);				 
				 return ATDIP;
		  }
}
