package am.itu.qa.work.page.main;

import static am.itu.qa.work.page.main.WorkMainPageConstants.*; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.work.profile.Profile;

public class LoginWindow extends WorkMainPage {
   
	 
	public LoginWindow(WebDriver driver) {
	 super(driver);
} 
	 
	    @FindBy(xpath = LOGIN_LINK_XPATH)
	    WebElement loginWindowLink;
	
	    @FindBy(xpath= EMAIL_INPUT)
		WebElement emailInputLInk;
	
		@FindBy(xpath= PASSW_INPUT)
		WebElement passwInputLInk;
		
		@FindBy(xpath = SING_IN_BUTTON)
	    WebElement singInButton;
		
		@FindBy(xpath = TOAST)
		WebElement toast;
		
		@FindBy(xpath = PROFILE)
		WebElement profileImg;
	
	//click profile button, open login window
	public boolean isLoginWindowPresent() {
		 return loginWindowLink.isDisplayed();
	}
	
	//verify,that presents all fields and Login button
	public boolean isEmailPresent() {
		 return emailInputLInk.isDisplayed();
	}
	
	public boolean isPasswPresent() {
		 return passwInputLInk.isDisplayed();
	}	
	
	public boolean isSingInButtonPresent() {
		 return singInButton.isDisplayed();
	}	
	
	public boolean isToastPresent() {
		return toast.isDisplayed();
		}
	
	 		
	//without value click on Sing in button- present error. 
			public WorkMainPage clickOnSingInButton() {
					singInButton.click();
				if(isPasswPresent())
				{
					return new LoginWindow(driver);
					
				} else	{  
					
					return new Profile(this.driver) ;
				}
			 	
			}
			public boolean verifyToastPresent() {
				return toast.isDisplayed();
				}
			 			
			public void typePsswdEmail(String psswd, String email) {
				passwInputLInk.clear();
				passwInputLInk.sendKeys(psswd);
				emailInputLInk.clear();
				emailInputLInk.sendKeys(email);
				singInButton.click();
		   
			}
			 // type correct Email  and passw-presents Mixupload profile 
			public Profile openProfilePage() {
				 profileImg.isDisplayed();
				return new Profile(driver);
							
			}

			public boolean verifyProfilePage() {     
				return profileImg.isDisplayed() ;
			}
}                 

