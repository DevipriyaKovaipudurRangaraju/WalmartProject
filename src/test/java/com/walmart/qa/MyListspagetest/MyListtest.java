package com.walmart.qa.MyListspagetest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.Homepage.Homepage;
import com.walmart.qa.Mylistspage.Mylistpage;
import com.walmart.qa.OrderHistory.OrderHistorypage;
import com.walmart.qa.base.Testbase;

public class MyListtest extends Testbase {
	
	Homepage homepage;
	Mylistpage Mylist;
	
	public MyListtest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new Homepage();
		Mylist = new Mylistpage();
		}
	
	@Test(priority=1)
	public void history() {
		homepage.Homepageelements();
		Mylist.mylistsearch();
		Mylist.createlist();
		
	}
	
	

}
