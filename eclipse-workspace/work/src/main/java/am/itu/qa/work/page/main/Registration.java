package am.itu.qa.work.page.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.work.profile.FbProfile;
import am.itu.qa.work.profile.Profile;

public class Registration extends WorkMainPage {

	public Registration(WebDriver driver) {
		 super(driver);
	}
	 
	
	 @FindBy(xpath= "MIXUPLOAD_PROFILE_XPATH")
     WebElement profile;
	  
	  @FindBy(xpath= "REGISTRATION_WINDOW")
      WebElement regWindow;
	
	  @FindBy(xpath= "REG_EMAIL")
      WebElement regEail;
	
	  @FindBy(xpath="REG_PASSWD")
	  WebElement regPsswd;
	  
	  @FindBy(xpath="REPEAT_PSSWD")
	  WebElement repeatPsswd;
	   
	  @FindBy(xpath = "SIGN_UP_BUTTON")
	  WebElement singnUpBtn;
	  
	  @FindBy(xpath = "TOAST")
	  WebElement  error;
	
	  @FindBy(xpath = "FACEBOOK_BTN")
	  WebElement facebbok;
	  
	  
	 
	  public boolean verifyRegWindowPresent() {
		  regWindow.isDisplayed() ;
					return true;
	  }
	  
	//verify,that presents all fields and Login button
		public boolean isEmailPresent() {
			 return regEail.isDisplayed();
		}
		
		public boolean isPasswPresent() {
			 return regPsswd.isDisplayed();
		}	
		
		public boolean isRepeatPasswPresent() {
			 return repeatPsswd.isDisplayed();
		}	
		 
		public boolean isSingInButtonPresent() {
			 return singInButton.isDisplayed();
		}	
		
		public boolean isToastPresent() {
			return error.isDisplayed();
			}
	  
	   	//without value click on Registration button-error.
	    public  WorkMainPage clickOnSingnUpBtn() {
    	  singnUpBtn.click();
    	  if (isRepeatPasswPresent())
    	  { 
    		  return new Registration(driver);
    	  
    	  } else {
    		  
    		  return new Profile(this.driver) ;
			}
    	  
    	  }
	    public boolean verifyToastPresent() {
			return error.isDisplayed();
		  
      
	    }
	    
	    //type already registered email,passwords - present profile page.
	    public void typeIncorecctMailCorrectPswd(String mail,String psswd, String repeatPasw) {
	    	regEail.clear();
	    	regEail.sendKeys(mail);
	    	regPsswd.clear();
	    	regPsswd.sendKeys(psswd);
	    	repeatPsswd.clear();
	    	repeatPsswd.sendKeys(repeatPasw);
	    	singInButton.click();
	    }
	     
	    // click on fb button-present mix.profile page with name of Fb account
	    public FbProfile clickOnFacebbokBtn() {
			   facebbok.click();
			   return new FbProfile(driver);
			   
		   }
			 

		   
		   
		   
		   
		  
	     
	    
	    
	    
}
				
 






