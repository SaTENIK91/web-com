package am.itu.qa.work.page.main;

import static am.itu.qa.work.page.main.WorkMainPageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.itu.qa.work.page.base.WorkBasePage;


public class WorkMainPage  extends WorkBasePage {
 
	public WorkMainPage(WebDriver driver) {
	 super(driver);
}
	 
	@FindBy(xpath = MIXUPLOAD_LOGO_XPATH)
	WebElement mixuploadLogo;
	
	@FindBy(xpath = MIXUPLOAD_PROFILE_XPATH)
	WebElement mixProfileButton;
	
	@FindBy(xpath = SING_IN_BUTTON)
    WebElement singInButton;
	
	//Registration
	@FindBy(xpath="REGISTRATION_WINDOW")
	WebElement registrWindow;
	
	
	 //Verify, that present mix. homepage
	public boolean verifyHomepagePresent() {
		 mixuploadLogo.isDisplayed() ;
				return true;
			}
	
	//click on profile button-present login window.
	public LoginWindow clickOnProfileButton() {
				mixProfileButton.click();
				return new LoginWindow(this.driver);
}
	public Registration clickOnProfileBtn() {
		mixProfileButton.click();
		return new  Registration(this.driver); 
				 
	
	}
}

