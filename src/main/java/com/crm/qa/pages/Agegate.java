package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Agegate extends TestBase{

	
	   @FindBy(name ="age-gate-primary")
	   WebElement Agegatebtn;
	   
	   @FindBy(xpath = "//img[@class='site-logo-switch sdm_ca lazyloaded']")
	   WebElement Agegatepagesitelogo;
	
	
	   
	//Initializing the Page Objects
	   
	   public Agegate() {
		   PageFactory.initElements(driver, this);
	   }
	   
	//Actions
	   
	  public void Agegatelogin() {
		  Agegatebtn.click();
		  // return new ProductsPage();
		  
	  }
	  
	  public String Agegatetitle() {
		  return driver.getTitle();
	  }
	  
	  public boolean Agegatepagesitelogo() {
		  return Agegatepagesitelogo.isDisplayed();
	  }
}
