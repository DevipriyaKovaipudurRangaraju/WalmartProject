package com.walmart.qa.MyAccounttest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.Cartpage.Cartpage;
import com.walmart.qa.Homepage.Homepage;
import com.walmart.qa.MyAccount.MyAccount;
import com.walmart.qa.base.Testbase;

public class Accounttest extends Testbase{
	
	Homepage homepage;
	MyAccount account;
	
	public Accounttest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new Homepage();
		account = new MyAccount();
		}
	
	@Test(priority=1)
	public void sameitemadd() {
		homepage.Homepageelements();
		account.Accountclick();
	}
	
	
	

}
