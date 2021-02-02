package com.walmart.qa.CreateAccounttest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.walmart.qa.CreateAccount.CreateAccountPage;
import com.walmart.qa.base.Testbase;
import com.walmart.qa.util.Testutil;

public class CreateAccounttest extends Testbase {
	
	public CreateAccounttest() {
		super();
	}
	
	CreateAccountPage cap = new CreateAccountPage();
	Testutil util = new Testutil();
	String sheetname = "Data";
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
	}
    
	@DataProvider
	public Object[][] getdata() {
		
		Object data[][] = util.getData(sheetname);
		return data;
	}
	
	@Test(dataProvider = "getdata")
	public void createAccount(String Fname, String Lname, String Email, String PW) {
		
		cap.createAccount(Fname, Lname, Email, PW);
		
	}
}
