package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {

 	WebDriver driver;

@BeforeSuite
  public void setUp() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\lib\\chromedriver.exe" );
  	 driver=new ChromeDriver();

  }

  @BeforeTest
  public void goToURL() throws InterruptedException {
	  
	  driver.get("https://subscribe.stctv.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);  }
  
    
  @AfterTest
  public void tear() {
	  driver.quit();
  }

}
