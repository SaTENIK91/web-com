package am.itu.qa.work.profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.work.page.main.WorkMainPageConstants.*;
import am.itu.qa.work.page.main.Registration;

public class FbProfile extends Registration {

	public FbProfile(WebDriver driver) {
		super(driver);
		 
	}

	@FindBy(xpath = FACEBOOK_PROFILE)
	 WebElement facebookprof;
	
	
	public void verifyFbProfile() {
		facebookprof.isDisplayed();
		
	}
	
}
