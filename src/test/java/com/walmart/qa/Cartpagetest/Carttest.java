package com.walmart.qa.Cartpagetest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.Cartpage.Cartpage;
import com.walmart.qa.Homepage.Homepage;
import com.walmart.qa.base.Testbase;

public class Carttest extends Testbase{
	
	Homepage homepage;
	Cartpage cartpage;
	
	public Carttest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new Homepage();
		cartpage = new Cartpage();
		}
	
	/*@Test(priority=1)
	public void itemadd() {
		homepage.Homepageelements();
		homepage.searchitem();
		cartpage.Additem();
	}*/
	
	@Test(priority=2)
	public void sameitemadd() {
		homepage.Homepageelements();
		homepage.searchitem();
		cartpage.Additem();
		cartpage.SameAdditem();
	}
	
	/*@Test(priority=2)
	public void multipleitemadd() {
		homepage.Homepageelements();
		homepage.searchitem();
		cartpage.MultipleAdditem();
	}*/

}
