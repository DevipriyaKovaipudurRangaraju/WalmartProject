package com.walmart.qa.Cartpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walmart.qa.base.Testbase;

public class Cartpage extends Testbase{
	
	@FindBy(className = "css-gxbcya e175iya62")
	WebElement Item;
	
	@FindBy(className = "css-gxbcya e175iya62")
	WebElement Item1;
	
	public Cartpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Additem() {
		driver.findElement(By.linkText("CH Hanson 10366 Blue Lumber Crayon - Pack Of 12")).click();
		driver.findElement(By.cssSelector(".css-vfxkzw")).click();
		}
	public void SameAdditem() {
		driver.findElement(By.cssSelector(".e5qqw234")).click();
		System.out.println("Same item added multiple times and price is updated");
		}
	
	public void MultipleAdditem() {
		driver.findElement(By.linkText("CH Hanson 10366 Blue Lumber Crayon - Pack Of 12")).click();
		driver.findElement(By.className("css-vfxkzw edzik9p0")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("CH Hanson 10370 White Lumber Crayon - pack of 12")).click();
		driver.findElement(By.className("css-vfxkzw edzik9p0")).click();		
		System.out.println("Multipe items added multiple times and price is updated");
		}
}
