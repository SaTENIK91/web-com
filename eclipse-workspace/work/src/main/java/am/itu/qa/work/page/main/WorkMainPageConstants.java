package am.itu.qa.work.page.main;

import org.openqa.selenium.WebElement;

public class WorkMainPageConstants {

	//mix home
	public static final String MIXUPLOAD_LOGO_XPATH = "//header//a[@href='https://mixupload.com/']";
	//mix profile button 
	public static final String MIXUPLOAD_PROFILE_XPATH ="//img[@src='/images/bg-3.png']";
	//
	public static final String LOGIN_LINK_XPATH = "//div[@class='right']";
	
	
	//login
	public static final String SING_IN_BUTTON="public static final String";
	//login email
	public static final String EMAIL_INPUT = "//input[@name='login']";
	//login psswd
	public static final String PASSW_INPUT = "//form[@id='login-auth']//input[@name='pass']";
	//after click btn- toast
	public static final String TOAST = "//div[@id='notifications']";  
	//profil-sia
	public static final String PROFILE ="//a[@href='/u/sia-2020']//img";
    
	
	//registration window
	public static final String REGISTRATION_WINDOW ="//form//div[@class='left']";
	//reg-email
	public static final String REG_EMAIL = "//input[@id='reg-email']";
	//reg-passwd
	public static final String REG_PASSWD = "//input[@id='reg-pass']";
	//reg-sign up
	public static final String REPEAT_PSSWD ="//input[@id='reg-passre']";
	public static final String SIGN_UP_BUTTON = "//button[@class='sign-in']";
	  
	//reg facebbok button
	public static final String FACEBOOK_BTN = "//a[@class='nojs soc-btn fb']";
	//logged fb profile
	public static final String FACEBOOK_PROFILE = "//a[@href='/u/valerm00']";
	
	
	
	
}
