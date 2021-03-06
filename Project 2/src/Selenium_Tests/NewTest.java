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
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shovon\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe"); 
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shovon\\Downloads\\Compressed\\chromedriver_win32\\geckodriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");

	
		
		
	}
	
	
	/* Verifying the Page Title for the e-commerce site "http://automationpractice.com/index.php" */
  @Test(priority=1)
  public void verify_Page_Title() {
	  	
	    String title = driver.getTitle();
		System.out.println("the page title is " + title );
		Assert.assertEquals(title,"My Store");
  
  }
  
  

  @Test(priority=2)
  public void verify_Your_Logo_Experience_Logo() {
	  Boolean flag = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).isDisplayed();
	  Assert.assertTrue(flag);
  }
  
  
  @Test(priority=3)
  public void incorrect_login() {
	  WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("username");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("password");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		
		
		
		String extractedText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p")).getText();
		String pattern = "There is 1 error";
		Assert.assertEquals(extractedText,pattern);
				
  }

  


  
  
  
  
  
  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
  
  
  
  
}
