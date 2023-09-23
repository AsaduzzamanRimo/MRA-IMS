package driverPackage;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseDriver {
	public static WebDriver driver = null;
	@BeforeSuite
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
       
		
		String baseUrl = "https://mra-ims.celloscope.net/";
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		

		driver.findElement(By.id("loginId")).sendKeys("mfi-admin");
		driver.findElement(By.id("password")).sendKeys("123456");
		

		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(3000);
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
