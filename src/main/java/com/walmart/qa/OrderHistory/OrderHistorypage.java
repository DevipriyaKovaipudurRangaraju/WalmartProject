package com.walmart.qa.OrderHistory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.walmart.qa.base.Testbase;

public class OrderHistorypage extends Testbase {
	
	@FindBy(linkText = "Order History")
	WebElement OrderHistory;
	
		
	public OrderHistorypage() {
		PageFactory.initElements(driver,this);	
	}
	
	public void historyclick() {
		OrderHistory.click();
			
	}
	
	public void recentorders() {
		
		Select select = new Select(driver.findElement(By.id("view-orders-from-label")));
		select.selectByVisibleText("2018");
	}

}
