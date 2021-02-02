package com.walmart.qa.Homepage;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.walmart.qa.base.Testbase;

public class Homepage extends Testbase {
	
	//Page Factory
	
	@FindBy(linkText = "My Recommendations")
	WebElement Recommendations;
	
	@FindBy(linkText = "My Account")
	WebElement Account;
	
	@FindBy(linkText = "Order History")
	WebElement OrderHistory;
	
	@FindBy(linkText = "My Lists")
	WebElement List;
	
	@FindBy(linkText = "Personal Settings")
	WebElement PersonalSettings;
	
	@FindBy(linkText = "Addresses")
	WebElement Address;
	
	@FindBy(linkText = "Credit Cards")
	WebElement CreditCard;
	
	@FindBy(linkText = "Sign Out")
	WebElement Signout;
	
	@FindBy(id = "global-search")
	WebElement search;
	
	@FindBy(className = "gicon-magnifier")
	WebElement searchitem;
	
	@FindBy(className = "css-gxbcya e175iya62")
	WebElement item;
	
	@FindBy(css=".css-17gzmsn:nth-child(2) > .css-iz0wk1")
	WebElement Sort;
	
	@FindBy(xpath ="//button/div")
	WebElement Filter;
	
	//Initialize WebElements
	public Homepage() {
		PageFactory.initElements(driver,this);	
	}
	
	public void Homepageelements() {
		
		boolean R = Recommendations.isDisplayed();
		System.out.println(R);
		
		boolean A = Account.isDisplayed();
		System.out.println(A);
		
		boolean O = OrderHistory.isDisplayed();
		System.out.println(O);
		
		boolean L = List.isDisplayed();
		System.out.println(L);
		
		boolean P = PersonalSettings.isDisplayed();
		System.out.println(P);
		
		boolean Ad = Address.isDisplayed();
		System.out.println(Ad);
		
		boolean cc = CreditCard.isDisplayed();
		System.out.println(cc);
		
		boolean so = Signout.isDisplayed();
		System.out.println(so);
		
		boolean srh = search.isDisplayed();
		System.out.println(srh);
		
		
		
	}
		
		
		public void searchitem() {
		search.sendKeys("ch");
		searchitem.click();
		//item.click();
		}

		public void sorting() {
		Sort.click();
		driver.findElement(By.xpath("//span[contains(.,'Price: High to Low')]")).click();
		}
		
		public void filter() {
			Filter.click();
			driver.findElement(By.cssSelector(".css-6btmoy > .css-5hi0bm")).click();
			}
}

