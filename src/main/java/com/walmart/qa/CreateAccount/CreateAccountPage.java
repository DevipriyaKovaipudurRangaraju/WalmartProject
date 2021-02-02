package com.walmart.qa.CreateAccount;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.walmart.qa.Homepage.Homepage;
import com.walmart.qa.base.Testbase;

public class CreateAccountPage extends Testbase {
	
	//Page Factory
	
	/*@FindBy(id = "firstName")
	WebElement FirstName;
	
	@FindBy(id = "lastName")
	WebElement LastName;
	
	@FindBy(id = "phoneNumber")
	WebElement PhoneNumber;
	
	@FindBy(id = "email")
	WebElement EmailID;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(xpath = "//label[@className = 'css-12k6l22 ega94xn0']")
	WebElement TermsandCond;
	
	@FindBy(xpath = "//label[@className = 'css-vfxkzw edzik9p0']")
	WebElement CreateAccount;*/
	
	//Initialize WebElements
	
	/*public CreateAccountPage() {
		PageFactory.initElements(driver, this);
		
	}*/
	
	public void createAccount(String Fname, String Lname, String Email, String PW) {
		driver.findElement(By.id("firstName")).sendKeys(Fname);
		driver.findElement(By.id("lastName")).sendKeys(Lname);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(PW);
		driver.findElement(By.cssSelector("div.css-1icu9ov:nth-child(9) > div:nth-child(1) > div:nth-child(1) > label:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".css-vfxkzw")).click();
		driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
		//return new Homepage();
	}

}
