package am.itu.qa.work.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class  BaseTest {

  protected  WebDriver driver;
	
	@BeforeClass
	public void browserGenerator() throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver","/home/saten/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://mixupload.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	// նույն փէքիջի մեջ ինչու պետք է ստեղծենք AfterClass 
	//@interface AfterClass { }  նույնն էլ @BeforeClass

 @AfterClass
	public void tearDown() {
		driver.quit();
		
	}
	
}
