package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.utilities.Testutil;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/vethota/eclipse-workspace/FullDemo/src/main/java/com/crm/qa/config/config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
	        e.printStackTrace();
		}
			
	}
	
	
	public static void Initialization(){
		
		String Browsername = prop.getProperty("browser");
		if (Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vethota\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} /*else if (Browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\vethota\\Desktop\\Selenium\\chromedriver_win32\\geckodriver.exe");
			driver = new FireFoxDriver(); 
		} */
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(Testutil.Page_Load_Timeout, TimeUnit.SECONDS);
	   		driver.manage().timeouts().implicitlyWait(Testutil.Implicit_wait,TimeUnit.SECONDS) ;	       
	
		
		    driver.get(prop.getProperty("url"));
		
	}
	
		

	
	

}
