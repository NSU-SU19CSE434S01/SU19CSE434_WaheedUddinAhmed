package Selenium_Tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloWorld {
	
	

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmc47\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dmc47\\Downloads\\Compressed\\chromedriver_win32\\geckodriver.exe");

		//		WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement email;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("Waheed.Ahmed@northsouth.edu");
		
		
		
//	
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("starboi");
//		Thread.sleep(1000);
//		driver.findElement(By.id("recaptcha-anchor")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("login")).click();
//		String at = driver.getTitle();
//		String et = "Client Area - PHP TRAVELS";
//		driver.close();
//		if(at.equalsIgnoreCase(et)) {
//			System.out.println("Test Successful");
//		}
//		else {
//			System.out.println("Test UnSuccessful");
//		}
		
		
		
		
		
//		check_login();
		
		
	}


	
	
}