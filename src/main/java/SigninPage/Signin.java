package SigninPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.Homepage.Homepage;
import com.walmart.qa.base.Testbase;

public class Signin extends Testbase {
	
	@FindBy(id = "username")
	WebElement uname;
	
	@FindBy(id = "password")
	WebElement pw;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/form/div/div[7]/button")
	WebElement SigninButton;
	
	public Signin() {
		PageFactory.initElements(driver, this);
	}
	
	public Homepage signinmethod(String un, String pwd) {
		
		uname.sendKeys(un);
		pw.sendKeys(pwd);
		SigninButton.click();
		return new Homepage();
		
	}

}
