package am.itu.qa.work.profile;

import static am.itu.qa.work.page.main.WorkMainPageConstants.PROFILE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.work.page.main.LoginWindow;
 

public class Profile  extends LoginWindow {

	public Profile(WebDriver driver) {
		 super(driver);
		
	}

	@FindBy(xpath = PROFILE)
	WebElement profileImg;
	
	
	 // type correct Email  and passw-presents Mixupload profile 
	public boolean verifyProfileImg() {
		   return profileImg.isDisplayed();
		  
}
	
	
}
	
	
	