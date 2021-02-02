package com.walmart.qa.MyAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.Testbase;

public class MyAccount extends Testbase{
	
	@FindBy(linkText = "My Account")
	WebElement Account;
	
	@FindBy(linkText="View all orders")
	WebElement vieworder;
	
	public MyAccount() {
		PageFactory.initElements(driver,this);	
	}
	
	public void Accountclick() {
		Account.click();
		vieworder.click();
		
	}
}
