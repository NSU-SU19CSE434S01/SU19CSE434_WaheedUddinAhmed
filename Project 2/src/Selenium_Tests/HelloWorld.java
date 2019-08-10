package Selenium_Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	
	

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmc47\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		check_login();
		
		
	}

	private static boolean check_login() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("login")).click();
		
		Thread.sleep(1000);
//		driver.findElement(By.id("inputEmail")).sendKeys("waheed@gmail.com");
		driver.findElement(By.id("inputPassword")).click();
		driver.findElement(By.id("inputPassword")).sendKeys("starboi");
		Thread.sleep(1000);
		driver.findElement(By.id("recaptcha-anchor")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login")).click();
		String at = driver.getTitle();
		String et = "Client Area - PHP TRAVELS";
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Successful");
		}
		else {
			System.out.println("Test UnSuccessful");
		}
		
		return false;
		
	}
	
	
}