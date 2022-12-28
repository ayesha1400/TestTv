package testngDemo;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;

public class SampleTest extends BaseTest {
  
	@Test(priority=1)
		public void ksa() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement English=driver.findElement(By.xpath("//a[@id='translation-btn']"));
		English.click();
	    Thread.sleep(2000);
	    
	    boolean ksa = driver.findElement(By.xpath("//span[@id='country-name' and normalize-space() = 'KSA']")).isDisplayed();
	    WebElement a=driver.findElement(By.xpath("//span[@id='country-name' and normalize-space() = 'KSA']"));
	    a.click();
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", a);
	    
	    if(ksa) {

			String ExpectedTitle1 = "LITE";
		    String ActualSub1 = driver.findElement(By.xpath("//strong[@id='name-lite']")).getText();
		    assertEquals("Verify name", ExpectedTitle1, ActualSub1);
		    
		    boolean sar = driver.findElement(By.xpath("//div/i[contains(text(),'SAR')]")).isDisplayed();
		    boolean amt1 = driver.findElement(By.xpath("//div/b[text()='15']")).isDisplayed();
	   	    Thread.sleep(2000);

		    String ExpectedTitle2 = "CLASSIC";
		    String ActualSub2 = driver.findElement(By.xpath("//strong[@id='name-classic']")).getText();
		    assertEquals("Verify name", ExpectedTitle2, ActualSub2);
		    Thread.sleep(2000);	
		    
		    String ExpectedTitle3 = "PREMIUM";
		    String ActualSub3 = driver.findElement(By.xpath("//strong[@id='name-premium']")).getText();
		    assertEquals("Verify name", ExpectedTitle3, ActualSub3);
		    Thread.sleep(2000);
		    
		    }
	}
	    
	
	  @Test(priority=2) public void bhr() throws InterruptedException{
	  
	  driver.findElement(By.xpath("//div[@class='country-current']")).click();
	  WebElement b=driver.findElement(By.
	  xpath("//span[@id='bh-contry-lable' and normalize-space() = 'Bahrain']"));
	  b.click(); Thread.sleep(4000); boolean bhr = driver.findElement(By.
	  xpath("//span[@id='bh-contry-lable' and normalize-space() = 'Bahrain']")).
	  isDisplayed(); Thread.sleep(2000);
	  
	  if(bhr) { String ExpectedTitle1 = "LITE"; String ActualSub1 =
	  driver.findElement(By.xpath("//strong[@id='name-lite']")).getText();
	  assertEquals("Verify name", ExpectedTitle1, ActualSub1);
	  
	  boolean bhd =
	  driver.findElement(By.xpath("//div/i[contains(text(),'BHD']")).isDisplayed();
	  boolean amt2 =
	  driver.findElement(By.xpath("//div/b[text()='2']")).isDisplayed();
	  Thread.sleep(2000);
	  
	  String ExpectedTitle2 = "CLASSIC"; String ActualSub2 =
	  driver.findElement(By.xpath("//strong[@id='name-classic']")).getText();
	  assertEquals("Verify name", ExpectedTitle2, ActualSub2); Thread.sleep(2000);
	  
	  String ExpectedTitle3 = "PREMIUM"; String ActualSub3 =
	  driver.findElement(By.xpath("//strong[@id='name-premium']")).getText();
	  assertEquals("Verify name", ExpectedTitle3, ActualSub3); Thread.sleep(2000);
	  } }
	  
	  @Test(priority=3) public void kwt() throws InterruptedException{
	  
	  
	  driver.findElement(By.xpath("//div[@class='country-current']")).click();
	  WebElement c=driver.findElement(By.
	  xpath("//span[@id='kw-contry-lable' and normalize-space() = 'Kuwait']"));
	  c.click();Thread.sleep(2000);
	  
	  boolean kwt = driver.findElement(By.
	  xpath("//span[@id='kw-contry-lable' and normalize-space() = 'Kuwait']")).
	  isDisplayed();
	  
	  if(kwt) {
	  
	  String ExpectedTitle1 = "LITE"; String ActualSub1 =
	  driver.findElement(By.xpath("//strong[@id='name-lite']")).getText();
	  assertEquals("Verify name", ExpectedTitle1, ActualSub1);
	  
	  boolean kwd =
	  driver.findElement(By.xpath("//div/i[contains(text(),'KWD']")).isDisplayed();
	  boolean amt3 =
	  driver.findElement(By.xpath("//div/b[text()='1.2']")).isDisplayed();
	  Thread.sleep(2000);
	  
	  String ExpectedTitle2 = "CLASSIC"; String ActualSub2 =
	  driver.findElement(By.xpath("//strong[@id='name-classic']")).getText();
	  assertEquals("Verify name", ExpectedTitle2, ActualSub2); Thread.sleep(2000);
	  
	  String ExpectedTitle3 = "PREMIUM"; String ActualSub3 =
	  driver.findElement(By.xpath("//strong[@id='name-premium']")).getText();
	  assertEquals("Verify name", ExpectedTitle3, ActualSub3); Thread.sleep(2000);
	  driver.close();
	  
	  } }
	 

}

		
		
		
		
	