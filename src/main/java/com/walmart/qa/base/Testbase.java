package com.walmart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.walmart.qa.util.Testutil;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	static Testutil util;
	
	public Testbase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Sivadevi\\eclipse-workspace\\Walmart\\src\\main\\java\\com\\walmart\\qa\\configproperties\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sivadevi\\Documents\\testing\\chromedriver_win32\\chromedriver.exe");
	   		driver=new ChromeDriver();
		
	               } else if(browsername.equals("Firefox")) {
	            	   
	            	   System.setProperty("webdriver.gecko.driver","C:\\Users\\Sivadevi\\Documents\\testing\\geckodriver-v0.27.0-win64\\geckodriver.exe");
	     	          driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(util.pageloadwait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(util.implicitwait,TimeUnit.SECONDS);
	}

}
