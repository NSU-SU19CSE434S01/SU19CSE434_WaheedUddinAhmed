package Selenium_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
	
	
	@Test(priority=2)
	public void click_On_Personal_Info() {
		
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")).click();
	String Text= "YOUR PERSONAL INFORMATION";
		  if(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/h1")).isDisplayed()) {
			  String SegmentTitle = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/h1")).getText();
			  Assert.assertEquals(SegmentTitle,Text);
		  }
		  
}
	
	
	
@Test(priority=3)
	public void Add_to_cart() {
		
		  driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		WebElement e_to_hover_over=  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
		Hover(driver, e_to_hover_over);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
		
		
		String extracted = driver.findElement(By.xpath("//*[@id=\"summary_products_quantity\"]")).getText();
		String pattern = "1 Product";	
		Assert.assertEquals(extracted,pattern);
		

		  
	}

		@Test(priority=4)
		public void searchBarTest() {
			
			// Clicked on the Search Bar
			driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).click();
			
			// Typed query item on the search Bar
			driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Printed Summer Dress");
			
			// Clicked on the search button
			driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
			
			String extractedText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5")).getText();
			
			String pattern = "Printed Summer Dress";
			
			
			
			 Assert.assertEquals(extractedText, pattern);
			
		}
	
	
		@Test(priority=5)
		public void Make_a_purchase() {
			
			  driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
			WebElement e_to_hover_over=  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
			Hover(driver, e_to_hover_over);
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
			
			
			 driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
			 driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
			 driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
			 if(driver.findElement(By.className("fancybox-overlay")).isDisplayed()) {
				 System.out.println("the overlay is in effect!");
			 }
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 WebElement element = driver.findElement(By.className("fancybox-overlay"));
			 js.executeScript("arguments[0].setAttribute('style', 'display:none')", element);
			 
			
			 
			  driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
			  
	
			 
			
	
				 driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
	
			 driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
			 driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
			 String extractedText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText();
			 String pattern = "Your order on My Store is complete.";
			 Assert.assertEquals(extractedText, pattern);
					 
	
			  
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
	  public static void Hover(WebDriver driver, WebElement element) {
		  Actions action = new Actions(driver);
		  action.moveToElement(element).perform();
		  
	  }
	  
	  
	  
}
