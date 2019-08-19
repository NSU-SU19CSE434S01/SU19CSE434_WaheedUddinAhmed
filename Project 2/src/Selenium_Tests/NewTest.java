package Selenium_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmc47\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe"); 
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dmc47\\Downloads\\Compressed\\chromedriver_win32\\geckodriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
//		Login("NGTest107@gmail.com","ngtest123");
	
		
		
	}
	
	
	/* Verifying the Page Title for the e-commerce site "http://automationpractice.com/index.php" */
  @Test(priority=1)
  public void verify_Page_Title() {
	  	
	    String title = driver.getTitle();
		System.out.println("the page title is " + title );
		Assert.assertEquals(title,"My Store");
  
  }
  
  

  @Test(priority=1)
  public void verify_Your_Logo_Experience_Logo() {
	  Boolean flag = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).isDisplayed();
	  Assert.assertTrue(flag);
  }
  
  
  
  

  


  
  
  
  
  
  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
  
  
  
  
}
