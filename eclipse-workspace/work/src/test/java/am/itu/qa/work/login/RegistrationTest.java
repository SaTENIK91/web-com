package am.itu.qa.work.login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.work.page.main.WorkMainPage;
import am.itu.qa.work.page.main.Registration;

public class RegistrationTest extends WorkMainPage {

	public RegistrationTest(WebDriver driver) {
		super(driver);
		 
	}
	 	
	@Test
	public void regTestIncorrectMail()  {
		WorkMainPage main = new WorkMainPage(driver);
		Registration singnUp = (Registration)main.clickOnProfileBtn();
		singnUp.typeIncorecctMailCorrectPswd("lopewa6791@jentrix.c","asdfghj","asdfghj");
		singnUp =(Registration) singnUp.clickOnSingnUpBtn(); 
		Assert.assertTrue(singnUp.verifyToastPresent());
	}
   
	
	
	
	
	

      
	     
	   
	

}
