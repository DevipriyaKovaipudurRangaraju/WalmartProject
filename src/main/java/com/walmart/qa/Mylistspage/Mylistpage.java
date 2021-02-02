package com.walmart.qa.Mylistspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.walmart.qa.base.Testbase;

public class Mylistpage extends Testbase{
	
	@FindBy(linkText = "My Lists")
	WebElement List;
	
	@FindBy(id="save-list-input")
	WebElement Search;
	
	@FindBy(id="save-list-button")
	WebElement Savelist;
		
	public Mylistpage() {
		PageFactory.initElements(driver,this);	
	}
	
	public void mylistsearch() {
		List.click();
		boolean searchbox = Search.isDisplayed();
		Assert.assertTrue(searchbox);
			
	}
	
	public void createlist() {
		
		Search.sendKeys("baby");
		Savelist.click();
	}

}
