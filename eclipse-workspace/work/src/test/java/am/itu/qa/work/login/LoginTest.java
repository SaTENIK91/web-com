package am.itu.qa.work.login;
 
import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.work.base.BaseTest;
import am.itu.qa.work.page.main.LoginWindow;
import am.itu.qa.work.page.main.WorkMainPage;
import am.itu.qa.work.profile.Profile;
 
public class LoginTest extends BaseTest{
	
	//open mixhomepage
	@Test
	public void openMixHomepage() {
		WorkMainPage  home = new WorkMainPage (driver);
		boolean page = home.verifyHomepagePresent();
	    Assert.assertTrue(home.verifyHomepagePresent());
	    Teardown(3000);
	
	}
	 private void Teardown(int i) {
	// TODO Auto-generated method stub
		
	}
	
	 //on the main page click on profile button
	@Test
	 public void openLoginWindow() throws InterruptedException {
	 
	WorkMainPage main = new WorkMainPage(driver);
	LoginWindow window = main.clickOnProfileButton();
	Assert.assertTrue(window.isLoginWindowPresent());
	
	//verify,that presents all fields and Login button
	Assert.assertTrue(window.isEmailPresent());
	Assert.assertTrue(window.isPasswPresent());
	Assert.assertTrue(window.isSingInButtonPresent());
	
	 }
	/*
	//without value click on button Sing in.
	@Test 
	public  void clickOnSingInButton() {
		LoginWindow window = new LoginWindow(driver);
		window.clickOnSingInButton();
		Assert.assertTrue(window.verifyToastPresent());
		
	}
		*/
	//without value click on button Sing in.
	 @Test 
	 public void loginWithoutParamsTest() {
		WorkMainPage main = new WorkMainPage(driver);
		LoginWindow window = main.clickOnProfileButton();
		window = (LoginWindow)window.clickOnSingInButton();  	
	 	Assert.assertTrue(window.isToastPresent());
	
	}
	//login false email,psswd 
	@Test
 public void loginTestIncorrectPassword()   {
		WorkMainPage main = new WorkMainPage(driver);
		LoginWindow window = main.clickOnProfileButton();
		window.typePsswdEmail("asdfg", "email@.bk.r");
		window = (LoginWindow) window.clickOnSingInButton(); 
		Assert.assertTrue(window.isToastPresent());
		
	}
	   //correct email psswd
		@Test
		public void loginTestCorrectPassword() {
			WorkMainPage login = new WorkMainPage(driver);
			LoginWindow logeed = login.clickOnProfileButton();                  
			logeed.typePsswdEmail("sia-2020@bk.ru","mixupload666");
			logeed = (LoginWindow) logeed.clickOnSingInButton(); 
			Assert.assertTrue(logeed.verifyProfilePage());				 
			       
		}
		 
		 
		
		
}
	
	
	
	
	
	
	
	
	
