package signinTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walmart.qa.Homepage.Homepage;
import com.walmart.qa.base.Testbase;

import SigninPage.Signin;

public class SigninTest extends Testbase{
	
	Signin sin;
	Homepage homepage;
	
	public SigninTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		 sin = new Signin();
		
	}
	
	@Test
	public void logintest() {
		homepage = sin.signinmethod(prop.getProperty("username"), prop.getProperty("Password"));
				
	}

}
