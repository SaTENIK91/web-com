package am.itu.qa.work.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WorkBasePage {

	 
	//public
	protected WebDriver driver; 
	
	public WorkBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
		
		// Teardown(3000);
	 
	}
	 
}


                
                
                