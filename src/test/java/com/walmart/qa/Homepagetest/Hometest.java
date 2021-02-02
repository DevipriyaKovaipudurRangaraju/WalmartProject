package com.walmart.qa.Homepagetest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.Homepage.Homepage;
import com.walmart.qa.base.Testbase;

import SigninPage.Signin;

public class Hometest extends Testbase{
	
	Homepage homepage;
	
	public Hometest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new Homepage();
		
	}
	
	/*@Test (priority=1)
	public void logintest() {
		homepage.Homepageelements();
				
	}
	
	@Test (priority=2)
	public void searchitem() {
		homepage.searchitem();
				
	}
	
	@Test(priority=3)
	public void sort() {
		homepage.Homepageelements();
		homepage.searchitem();
		homepage.sorting();
	}*/
	@Test(priority=4)
	public void filter() {
		homepage.Homepageelements();
		homepage.searchitem();
		homepage.filter();
	}

}
