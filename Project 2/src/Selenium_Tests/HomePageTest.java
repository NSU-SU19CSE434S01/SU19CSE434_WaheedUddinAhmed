package Selenium_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	
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
		Login("NGTest107@gmail.com","ngtest123");
		
		
		
	}
	
	@Test(priority=1)
	public void is_Sign_Out_Working() {
		if(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).isDisplayed()) {
		  driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
		  }
		Boolean flag = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).isDisplayed();
		Assert.assertTrue(flag);
		  
	}  
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }
	  
	  
	  
	  
	 
	  public void Login(String username, String password) {
		  
		    WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"passwd\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(password);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
			
//			boolean flag = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).isDisplayed();
//			Assert.assertTrue(flag);
//		  
	  }
	  
	  
	  
}
