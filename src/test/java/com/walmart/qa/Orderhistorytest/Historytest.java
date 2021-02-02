package com.walmart.qa.Orderhistorytest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.Homepage.Homepage;
import com.walmart.qa.MyAccount.MyAccount;
import com.walmart.qa.OrderHistory.OrderHistorypage;
import com.walmart.qa.base.Testbase;

public class Historytest extends Testbase {
	
	Homepage homepage;
	OrderHistorypage history;
	
	public Historytest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new Homepage();
		history = new OrderHistorypage();
		}
	
	@Test(priority=1)
	public void history() {
		homepage.Homepageelements();
		history.historyclick();
		history.recentorders();
		
	}
	
	

}
